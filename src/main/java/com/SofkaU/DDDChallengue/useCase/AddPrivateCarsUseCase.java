package com.SofkaU.DDDChallengue.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.SofkaU.DDDChallengue.traffic.Traffic;
import com.SofkaU.DDDChallengue.traffic.commands.AddPrivateCars;

public class AddPrivateCarsUseCase extends UseCase<RequestCommand<AddPrivateCars>, ResponseEvents> {

@Override
public void executeUseCase(RequestCommand<AddPrivateCars> addPrivateCarsRequestCommand){
        var command = addPrivateCarsRequestCommand.getCommand();
        var traffic = Traffic.from(command.getTrafficId(), retrieveEvents(command.getTrafficId().value()));
        traffic.addPrivateCars(command.getPrivateCarsId(), command.getQuantity(), command.getTimeOfData());

        emit().onResponse(new ResponseEvents(traffic.getUncommittedChanges()));
        }
}
