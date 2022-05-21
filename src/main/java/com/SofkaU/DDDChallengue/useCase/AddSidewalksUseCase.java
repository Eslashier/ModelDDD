package com.SofkaU.DDDChallengue.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.SofkaU.DDDChallengue.geometry.Geometry;
import com.SofkaU.DDDChallengue.geometry.commands.AddSidewalk;

public class AddSidewalksUseCase extends UseCase<RequestCommand<AddSidewalk>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddSidewalk> addSidewalkRequestCommand){
        var command = addSidewalkRequestCommand.getCommand();
        var geometry = Geometry.from(command.getGeometryId(), retrieveEvents(command.getGeometryId().value()));
        geometry.addSidewalk(command.getSidewalkId(), command.getWide(), command.getMaterial());

        emit().onResponse(new ResponseEvents(geometry.getUncommittedChanges()));
    }
}
