package com.SofkaU.DDDChallengue.model.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.model.values.SignalGroup;
import com.SofkaU.DDDChallengue.model.values.VerticalSignalId;

public class VerticalSignalGroupUpdated extends DomainEvent {

    private final VerticalSignalId verticalSignalId;
    private final SignalGroup signalGroup;

    public VerticalSignalGroupUpdated(VerticalSignalId verticalSignalId, SignalGroup signalGroup){
        super("challenge.model.verticalsignalgroupupdated");
        this.verticalSignalId = verticalSignalId;
        this.signalGroup = signalGroup;
    }

    public VerticalSignalId getVerticalSignalId() {
        return verticalSignalId;
    }

    public SignalGroup getSignalGroup() {
        return signalGroup;
    }
}
