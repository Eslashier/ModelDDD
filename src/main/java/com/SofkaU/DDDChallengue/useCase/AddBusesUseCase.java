package com.SofkaU.DDDChallengue.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.SofkaU.DDDChallengue.traffic.Traffic;
import com.SofkaU.DDDChallengue.traffic.commands.AddBuses;

public class AddBusesUseCase extends UseCase<RequestCommand<AddBuses>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddBuses> addBusesRequestCommand){
        var command = addBusesRequestCommand.getCommand();
        var traffic = Traffic.from(command.getTrafficId(), retrieveEvents(command.getTrafficId().value()));
        traffic.addBuses(command.getBusesId(), command.getQuantity(), command.getTimeOfData());

        emit().onResponse(new ResponseEvents(traffic.getUncommittedChanges()));
    }

}
