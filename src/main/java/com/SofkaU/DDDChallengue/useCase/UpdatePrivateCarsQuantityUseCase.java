package com.SofkaU.DDDChallengue.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.SofkaU.DDDChallengue.traffic.Traffic;
import com.SofkaU.DDDChallengue.traffic.commands.UpdatePrivateCarsQuantity;

public class UpdatePrivateCarsQuantityUseCase extends UseCase<RequestCommand<UpdatePrivateCarsQuantity>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<UpdatePrivateCarsQuantity> updatePrivateCarsQuantityRequestCommand){
        var command = updatePrivateCarsQuantityRequestCommand.getCommand();
        var traffic = Traffic.from(command.getTrafficId(), retrieveEvents(command.getTrafficId().value()));
        traffic.updatePrivateCarsQuantity(command.getPrivateCarsId(), command.getQuantity());

        emit().onResponse(new ResponseEvents(traffic.getUncommittedChanges()));
    }

}
