package com.SofkaU.DDDChallengue.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import com.SofkaU.DDDChallengue.model.Model;
import com.SofkaU.DDDChallengue.model.events.ModelCreated;
import com.SofkaU.DDDChallengue.model.values.ModelId;

public class NotifyTrafficDepartmentUseCase extends UseCase<TriggeredEvent<ModelCreated>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<ModelCreated> modelCreatedTriggeredEvent) {
        var event =modelCreatedTriggeredEvent.getDomainEvent();
        var geometry = Model.from(ModelId.of(event.aggregateRootId()), this.retrieveEvents());
        geometry.notifyTrafficDepartment("The model has been created");

        emit().onResponse(new ResponseEvents(geometry.getUncommittedChanges()));
    }
}
