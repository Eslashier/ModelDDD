package com.SofkaU.DDDChallengue;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.SofkaU.DDDChallengue.traffic.commands.UpdateBusesQuantity;
import com.SofkaU.DDDChallengue.traffic.commands.UpdatePrivateCarsQuantity;
import com.SofkaU.DDDChallengue.traffic.events.BusesQuantityUpdated;
import com.SofkaU.DDDChallengue.traffic.events.PrivateCarsQuantityUpdated;
import com.SofkaU.DDDChallengue.traffic.events.TrafficCreated;
import com.SofkaU.DDDChallengue.traffic.values.*;
import com.SofkaU.DDDChallengue.useCase.UpdateBusesQuantityUseCase;
import com.SofkaU.DDDChallengue.useCase.UpdatePrivateCarsQuantityUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class UpdatePrivateCarsQuantityUseCaseTest {
    private final String ROOTID="Trafficfinal";

    @Mock
    private DomainEventRepository repository;

    @Test
    void updateBusesQuantity(){
        var command = new UpdatePrivateCarsQuantity(TrafficId.of(ROOTID),
                PrivateCarsId.of("PrivateCarSet1"),
                new Quantity(1000));

        var useCase = new UpdatePrivateCarsQuantityUseCase();

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

        var event=(PrivateCarsQuantityUpdated)events.get(0);
        Assertions.assertEquals(command.getQuantity().value(), event.getQuantity().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}
