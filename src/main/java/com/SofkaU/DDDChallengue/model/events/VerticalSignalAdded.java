package com.SofkaU.DDDChallengue.model.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.model.values.SignalGroup;
import com.SofkaU.DDDChallengue.model.values.SignalName;
import com.SofkaU.DDDChallengue.model.values.VerticalSignalId;

public class VerticalSignalAdded extends DomainEvent{
    private VerticalSignalId verticalSignalId;
    private SignalGroup signalGroup;
    private SignalName signalName;

    public VerticalSignalAdded(VerticalSignalId verticalSignalId, SignalGroup signalGroup, SignalName signalName){
        super("challenge.model.verticalsignaladded");
        this.verticalSignalId = verticalSignalId;
        this.signalGroup = signalGroup;
        this.signalName = signalName;
    }

    public VerticalSignalId getVerticalSignalId() {
        return verticalSignalId;
    }

    public SignalGroup getSignalGroup() {
        return signalGroup;
    }

    public SignalName getSignalName() {
        return signalName;
    }

}
