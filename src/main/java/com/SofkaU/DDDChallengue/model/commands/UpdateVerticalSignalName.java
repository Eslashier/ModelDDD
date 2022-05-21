package com.SofkaU.DDDChallengue.model.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.model.values.ModelId;
import com.SofkaU.DDDChallengue.model.values.SignalGroup;
import com.SofkaU.DDDChallengue.model.values.SignalName;
import com.SofkaU.DDDChallengue.model.values.VerticalSignalId;

public class UpdateVerticalSignalName extends Command {

    private final ModelId modelId;
    private final VerticalSignalId verticalSignalId;
    private final SignalName signalName;

    public UpdateVerticalSignalName(ModelId modelId, VerticalSignalId verticalSignalId, SignalName signalName) {
        this.modelId = modelId;
        this.verticalSignalId = verticalSignalId;
        this.signalName = signalName;
    }

    public ModelId getModelId() {
        return modelId;
    }

    public VerticalSignalId getVerticalSignalId() {
        return verticalSignalId;
    }

    public SignalName getSignalName() {
        return signalName;
    }
}
