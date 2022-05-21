package com.SofkaU.DDDChallengue.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.SofkaU.DDDChallengue.geometry.Geometry;
import com.SofkaU.DDDChallengue.geometry.commands.CreateGeometry;

public class CreateGeometryUseCase extends UseCase<RequestCommand<CreateGeometry>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CreateGeometry> createGeometryRequestCommand) {
        var command = createGeometryRequestCommand.getCommand();
        var geometry = new Geometry(
                command.getGeometryId(),
                command.getGeometryNameLocation()
        );

        emit().onResponse(new ResponseEvents(geometry.getUncommittedChanges()));
    }


}
