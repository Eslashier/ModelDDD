package com.SofkaU.DDDChallengue;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.SofkaU.DDDChallengue.model.commands.AddVerticalSignal;
import com.SofkaU.DDDChallengue.model.events.ModelCreated;
import com.SofkaU.DDDChallengue.model.events.VerticalSignalAdded;
import com.SofkaU.DDDChallengue.model.values.*;
import com.SofkaU.DDDChallengue.useCase.AddVerticalSignalUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class AddVerticalSignalUseCaseTest {
    private final String ROOTID ="modeltest2";

    @Mock
    private DomainEventRepository repository;

    @Test
    void AddTrafficLights(){
        var command = new AddVerticalSignal(ModelId.of(ROOTID),
                VerticalSignalId.of("verticalsignalset1"),
                new SignalGroup("Regulatory Sign"),
                new SignalName("SR-01"));

        var useCase = new AddVerticalSignalUseCase();

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
                .orElseThrow(()->new IllegalArgumentException("Something went wrong creating vertical signals set"))
                .getDomainEvents();

        var event=(VerticalSignalAdded)events.get(0);
        Assertions.assertEquals(command.getSignalGroup().value(), event.getSignalGroup().value());
        Assertions.assertEquals(command.getSignalName().value(), event.getSignalName().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}
