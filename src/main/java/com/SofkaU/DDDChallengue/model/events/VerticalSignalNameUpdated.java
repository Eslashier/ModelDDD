package com.SofkaU.DDDChallengue.model.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.model.values.SignalName;
import com.SofkaU.DDDChallengue.model.values.VerticalSignalId;

public class VerticalSignalNameUpdated extends DomainEvent {

    private final VerticalSignalId verticalSignalId;
    private final SignalName signalName;

    public VerticalSignalNameUpdated(VerticalSignalId verticalSignalId, SignalName signalName){
        super("challenge.model.verticalsignalnameupdated");
        this.verticalSignalId = verticalSignalId;
        this.signalName = signalName;
    }

    public VerticalSignalId getVerticalSignalId() {
        return verticalSignalId;
    }

    public SignalName getSignalName() {
        return signalName;
    }
}
