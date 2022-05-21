package com.SofkaU.DDDChallengue.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.SofkaU.DDDChallengue.model.Model;
import com.SofkaU.DDDChallengue.model.commands.CreateModel;

public class CreateModelUseCase extends UseCase<RequestCommand<CreateModel>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CreateModel> createModelRequestCommand) {
        var command = createModelRequestCommand.getCommand();
        var model = new Model(
                command.getModelId(),
                command.getNameOfModel(),
                command.getDateOfModel()
        );

        emit().onResponse(new ResponseEvents(model.getUncommittedChanges()));
    }
}
