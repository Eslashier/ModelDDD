package com.SofkaU.DDDChallengue.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.SofkaU.DDDChallengue.model.Model;
import com.SofkaU.DDDChallengue.model.commands.AddTrafficLight;

public class AddTrafficLightUseCase extends UseCase<RequestCommand<AddTrafficLight>, UseCase.ResponseValues> {

    @Override
    public void executeUseCase(RequestCommand<AddTrafficLight> addTrafficLightRequestCommand){
        var command = addTrafficLightRequestCommand.getCommand();
        var model = Model.from(command.getModelId(), retrieveEvents(command.getModelId().value()));
        model.addTrafficLight(command.getTrafficLightId(), command.getTimeGreen(), command.getTimeRed());

        emit().onResponse(new ResponseEvents(model.getUncommittedChanges()));
    }
}
