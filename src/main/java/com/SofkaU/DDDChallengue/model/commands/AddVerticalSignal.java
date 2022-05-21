package com.SofkaU.DDDChallengue.model.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.model.values.ModelId;
import com.SofkaU.DDDChallengue.model.values.SignalGroup;
import com.SofkaU.DDDChallengue.model.values.SignalName;
import com.SofkaU.DDDChallengue.model.values.VerticalSignalId;

public class AddVerticalSignal extends Command {

    private final ModelId modelId;
    private final VerticalSignalId verticalSignalId;
    private final SignalGroup signalGroup;
    private final SignalName signalName;

    public AddVerticalSignal(ModelId modelId, VerticalSignalId verticalSignalId, SignalGroup signalGroup, SignalName signalName) {
        this.modelId = modelId;
        this.verticalSignalId = verticalSignalId;
        this.signalGroup = signalGroup;
        this.signalName = signalName;
    }

    public ModelId getModelId() {
        return modelId;
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
