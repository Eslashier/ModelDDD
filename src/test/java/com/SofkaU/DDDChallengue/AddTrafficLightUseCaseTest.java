package com.SofkaU.DDDChallengue;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.SofkaU.DDDChallengue.model.commands.AddTrafficLight;
import com.SofkaU.DDDChallengue.model.events.ModelCreated;
import com.SofkaU.DDDChallengue.model.events.TrafficLightAdded;
import com.SofkaU.DDDChallengue.model.values.*;
import com.SofkaU.DDDChallengue.useCase.AddTrafficLightUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class AddTrafficLightUseCaseTest {
    private final String ROOTID ="modeltest1";

    @Mock
    private DomainEventRepository repository;

    @Test
    void AddTrafficLights(){
        var command = new AddTrafficLight(ModelId.of(ROOTID),
                TrafficLightId.of("trafficlightsset1"),
                new TimeGreen(200),
                new TimeRed(60));

        var useCase = new AddTrafficLightUseCase();

        Mockito.when(repository.getEventsBy(ROOTID)).thenReturn(List.of(
                new ModelCreated(
                        new NameOfModel("My first model"),
                        new DateOfModel("2022-05-21")
                )
        ));

        useCase.addRepository(repository);
        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor(ROOTID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong creating traffic lights set"))
                .getDomainEvents();

        var event=(TrafficLightAdded)events.get(0);
        Assertions.assertEquals(command.getTimeGreen().value(), event.getTimeGreen().value());
        Assertions.assertEquals(command.getTimeRed().value(), event.getTimeRed().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}
