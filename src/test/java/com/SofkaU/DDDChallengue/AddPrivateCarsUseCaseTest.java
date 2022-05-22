package com.SofkaU.DDDChallengue;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.SofkaU.DDDChallengue.traffic.commands.AddPrivateCars;
import com.SofkaU.DDDChallengue.traffic.events.PrivateCarsAdded;
import com.SofkaU.DDDChallengue.traffic.events.TrafficCreated;
import com.SofkaU.DDDChallengue.traffic.values.*;
import com.SofkaU.DDDChallengue.useCase.AddPrivateCarsUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class AddPrivateCarsUseCaseTest {

    private final String ROOTID ="Traffictest2";

    @Mock
    private DomainEventRepository repository;

    @Test
    void AddPrivateCars(){
        var command = new AddPrivateCars(TrafficId.of(ROOTID),
                PrivateCarsId.of("privatecarsset1"),
                new Quantity(800),
                new TimeOfData("2020-01-23"));

        var useCase = new AddPrivateCarsUseCase();

        Mockito.when(repository.getEventsBy(ROOTID)).thenReturn(List.of(
                new TrafficCreated(
                        new TrafficNameLocation("Zipaquira")
                )
        ));

        useCase.addRepository(repository);
        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor(ROOTID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong creating private cars set"))
                .getDomainEvents();

        var event=(PrivateCarsAdded)events.get(0);
        Assertions.assertEquals(command.getQuantity().value(), event.getQuantity().value());
        Assertions.assertEquals(command.getTimeOfData().value(), event.getTimeOfData().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}
