package com.SofkaU.DDDChallengue.model.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.model.values.SignalGroup;
import com.SofkaU.DDDChallengue.model.values.SignalName;
import com.SofkaU.DDDChallengue.model.values.VerticalSignalId;

public class AddVerticalSignal extends Command {

    private final VerticalSignalId verticalSignalId;
    private final SignalGroup signalGroup;
    private final SignalName signalName;

    public AddVerticalSignal(VerticalSignalId verticalSignalId, SignalGroup signalGroup, SignalName signalName) {
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
