package com.SofkaU.DDDChallengue.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.SofkaU.DDDChallengue.traffic.Traffic;
import com.SofkaU.DDDChallengue.traffic.commands.UpdateBusesQuantity;

public class UpdateBusesQuantityUseCase extends UseCase<RequestCommand<UpdateBusesQuantity>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<UpdateBusesQuantity> updateBusesQuantityRequestCommand){
        var command = updateBusesQuantityRequestCommand.getCommand();
        var traffic = Traffic.from(command.getTrafficId(), retrieveEvents(command.getTrafficId().value()));
        traffic.updateBusesQuantity(command.getBusesId(), command.getQuantity());

        emit().onResponse(new ResponseEvents(traffic.getUncommittedChanges()));
    }
}
