package com.SofkaU.DDDChallengue.model.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.model.values.ModelId;
import com.SofkaU.DDDChallengue.model.values.SignalGroup;
import com.SofkaU.DDDChallengue.model.values.TrafficLightId;
import com.SofkaU.DDDChallengue.model.values.VerticalSignalId;

public class UpdateVerticalSignalGroup extends Command {
    private final ModelId modelId;
    private final VerticalSignalId verticalSignalId;
    private final SignalGroup signalGroup;

    public UpdateVerticalSignalGroup(ModelId modelId, VerticalSignalId verticalSignalId, SignalGroup signalGroup) {
        this.modelId = modelId;
        this.verticalSignalId = verticalSignalId;
        this.signalGroup = signalGroup;
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
}
