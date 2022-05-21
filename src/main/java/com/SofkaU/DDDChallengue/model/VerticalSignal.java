package com.SofkaU.DDDChallengue.model;

import co.com.sofka.domain.generic.Entity;
import com.SofkaU.DDDChallengue.model.values.SignalGroup;
import com.SofkaU.DDDChallengue.model.values.SignalName;
import com.SofkaU.DDDChallengue.model.values.VerticalSignalId;

public class VerticalSignal extends Entity<VerticalSignalId> {

    private SignalGroup signalGroup;
    private SignalName signalName;

    public VerticalSignal(VerticalSignalId entityId, SignalGroup signalGroup, SignalName signalName){
        super(entityId);
        this.signalGroup = signalGroup;
        this.signalName = signalName;
    }

    public void updateSignalGroup(SignalGroup signalGroup){
       this.signalGroup = signalGroup;
    }
    public void updateSignalName(SignalName signalName){
        this.signalName = signalName;
    }

    public SignalGroup signalGroup() {
        return signalGroup;
    }

    public SignalName signalName() {
        return signalName;
    }
}
