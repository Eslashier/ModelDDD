package com.SofkaU.DDDChallengue;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.SofkaU.DDDChallengue.traffic.commands.AddBuses;
import com.SofkaU.DDDChallengue.traffic.commands.UpdateBusesQuantity;
import com.SofkaU.DDDChallengue.traffic.events.BusesAdded;
import com.SofkaU.DDDChallengue.traffic.events.BusesQuantityUpdated;
import com.SofkaU.DDDChallengue.traffic.events.TrafficCreated;
import com.SofkaU.DDDChallengue.traffic.values.*;

import com.SofkaU.DDDChallengue.useCase.AddBusesUseCase;
import com.SofkaU.DDDChallengue.useCase.UpdateBusesQuantityUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;


@ExtendWith(MockitoExtension.class)
class UpdateBusesQuantityUseCaseTest {

    private final String ROOTID ="Traffictest1";

    @Mock
    private DomainEventRepository repository;

    @Test
    void AddBuses(){
        var command = new AddBuses(TrafficId.of(ROOTID),
                BusesId.of("busesset1"),
                new Quantity(200),
                new TimeOfData("2022-05-21"));

        var useCase = new AddBusesUseCase();

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
                .orElseThrow(()->new IllegalArgumentException("Something went wrong creating Buses set"))
                .getDomainEvents();

        var event=(BusesAdded)events.get(0);
        Assertions.assertEquals(command.getQuantity().value(), event.getQuantity().value());
        Assertions.assertEquals(command.getTimeOfData().value(), event.getTimeOfData().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
    @Test
    void updateBusesQuantity(){
        var command = new UpdateBusesQuantity(TrafficId.of(ROOTID),
                BusesId.of("busesset1"),
                new Quantity(225));

        var useCase = new UpdateBusesQuantityUseCase();

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
                .orElseThrow(()->new IllegalArgumentException("Something went wrong creating Buses set"))
                .getDomainEvents();

        var event=(BusesQuantityUpdated)events.get(0);
        Assertions.assertEquals(command.getQuantity().value(), event.getQuantity().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}

