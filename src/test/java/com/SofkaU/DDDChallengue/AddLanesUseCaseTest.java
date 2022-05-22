package com.SofkaU.DDDChallengue;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.SofkaU.DDDChallengue.geometry.commands.AddLanes;
import com.SofkaU.DDDChallengue.geometry.events.GeometryCreated;
import com.SofkaU.DDDChallengue.geometry.events.LanesAdded;
import com.SofkaU.DDDChallengue.geometry.values.*;
import com.SofkaU.DDDChallengue.useCase.AddLanesUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class AddLanesUseCaseTest {
    private final String ROOTID ="Geometrytest1";

    @Mock
    private DomainEventRepository repository;

    @Test
    void AddLanes(){
        var command = new AddLanes(GeometryId.of(ROOTID),
                LaneId.of("lanesset1"),
                new LaneWide(3.50),
                new NumberOfLanes(4));

        var useCase = new AddLanesUseCase();

        Mockito.when(repository.getEventsBy(ROOTID)).thenReturn(List.of(
                new GeometryCreated(
                        new GeometryNameLocation("Zipaquira")
                )
        ));

        useCase.addRepository(repository);
        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor(ROOTID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong creating lanes set"))
                .getDomainEvents();

        var event=(LanesAdded)events.get(0);
        Assertions.assertEquals(command.getLaneWide().value(), event.getLaneWide().value());
        Assertions.assertEquals(command.getNumberOfLanes().value(), event.getNumberOfLanes().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}
