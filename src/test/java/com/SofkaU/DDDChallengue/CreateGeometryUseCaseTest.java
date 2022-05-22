package com.SofkaU.DDDChallengue;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.SofkaU.DDDChallengue.geometry.commands.CreateGeometry;
import com.SofkaU.DDDChallengue.geometry.events.GeometryCreated;
import com.SofkaU.DDDChallengue.geometry.values.GeometryId;
import com.SofkaU.DDDChallengue.geometry.values.GeometryNameLocation;
import com.SofkaU.DDDChallengue.useCase.CreateGeometryUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreateGeometryUseCaseTest {

    @Test
    void createGeometry(){
        var command = new CreateGeometry(
                GeometryId.of("geometri1"),
                new GeometryNameLocation("Zipaquira")
        );

        var useCase = new CreateGeometryUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong creating geometry"))
                .getDomainEvents();

        var event = (GeometryCreated)events.get(0);
        Assertions.assertEquals(command.getGeometryNameLocation().value(), event.getGeometryNameLocation().value());
    }
}
