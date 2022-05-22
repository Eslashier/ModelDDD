package com.SofkaU.DDDChallengue;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.SofkaU.DDDChallengue.model.commands.CreateModel;
import com.SofkaU.DDDChallengue.model.events.ModelCreated;
import com.SofkaU.DDDChallengue.model.values.DateOfModel;
import com.SofkaU.DDDChallengue.model.values.ModelId;
import com.SofkaU.DDDChallengue.model.values.NameOfModel;
import com.SofkaU.DDDChallengue.useCase.CreateModelUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreateModelUseCaseTest {

    @Test
    void CreateModel(){
        var command = new CreateModel(
                ModelId.of("model1"),
                new NameOfModel("My second model"),
                new DateOfModel("2022-05-21")
        );

        var useCase = new CreateModelUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong creating geometry"))
                .getDomainEvents();

        var event = (ModelCreated)events.get(0);
        Assertions.assertEquals(command.getNameOfModel().value(),event.getNameOfModel().value());
        Assertions.assertEquals(command.getDateOfModel().value(),event.getDateOfModel().value());
    }
}
