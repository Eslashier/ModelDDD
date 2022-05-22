package com.SofkaU.DDDChallengue;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.SofkaU.DDDChallengue.traffic.commands.CreateTraffic;
import com.SofkaU.DDDChallengue.traffic.events.TrafficCreated;
import com.SofkaU.DDDChallengue.traffic.values.TrafficId;
import com.SofkaU.DDDChallengue.traffic.values.TrafficNameLocation;
import com.SofkaU.DDDChallengue.useCase.CreateTrafficUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreateTrafficUseCaseTest {

    @Test
    void createTraffic(){
        var command = new CreateTraffic(
                TrafficId.of("traffic1"),
                new TrafficNameLocation("Zipaquira")
        );

        var useCase = new CreateTrafficUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong creating geometry"))
                .getDomainEvents();

        var event = (TrafficCreated)events.get(0);
        Assertions.assertEquals(command.getTrafficNameLocation().value(), event.getTrafficNameLocation().value());
    }
}
