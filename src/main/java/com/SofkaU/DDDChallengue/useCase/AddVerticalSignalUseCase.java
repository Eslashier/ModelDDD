package com.SofkaU.DDDChallengue.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.SofkaU.DDDChallengue.model.Model;
import com.SofkaU.DDDChallengue.model.commands.AddVerticalSignal;

public class AddVerticalSignalUseCase extends UseCase<RequestCommand<AddVerticalSignal>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddVerticalSignal> addVerticalSignalRequestCommand) {
        var command = addVerticalSignalRequestCommand.getCommand();
        var model = Model.from(command.getModelId(), retrieveEvents(command.getModelId().value()));
        model.addVerticalSignals(command.getVerticalSignalId(), command.getSignalGroup(), command.getSignalName());

        emit().onResponse(new ResponseEvents(model.getUncommittedChanges()));
    }

}
