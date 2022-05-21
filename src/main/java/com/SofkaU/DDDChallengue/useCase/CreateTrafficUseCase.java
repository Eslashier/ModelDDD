package com.SofkaU.DDDChallengue.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.SofkaU.DDDChallengue.geometry.commands.CreateGeometry;
import com.SofkaU.DDDChallengue.traffic.Traffic;
import com.SofkaU.DDDChallengue.traffic.commands.CreateTraffic;

public class CreateTrafficUseCase extends UseCase<RequestCommand<CreateTraffic>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateTraffic> createTrafficRequestCommand) {
        var command = createTrafficRequestCommand.getCommand();
        var traffic = new Traffic(
                command.getTrafficId(),
                command.getTrafficNameLocation()
        );

        emit().onResponse(new ResponseEvents(traffic.getUncommittedChanges()));
    }
}
