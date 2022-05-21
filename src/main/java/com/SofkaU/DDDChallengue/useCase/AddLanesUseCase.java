package com.SofkaU.DDDChallengue.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.SofkaU.DDDChallengue.geometry.Geometry;
import com.SofkaU.DDDChallengue.geometry.commands.AddLanes;

public class AddLanesUseCase extends UseCase<RequestCommand<AddLanes>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddLanes> addLanesRequestCommand){
        var command = addLanesRequestCommand.getCommand();
        var geometry = Geometry.from(command.getGeometryId(), retrieveEvents(command.getGeometryId().value()));
        geometry.addLanes(command.getLaneId(), command.getLaneWide(), command.getNumberOfLanes());

        emit().onResponse(new ResponseEvents(geometry.getUncommittedChanges()));
    }
}
