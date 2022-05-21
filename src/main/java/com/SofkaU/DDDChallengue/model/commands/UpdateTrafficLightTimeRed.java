package com.SofkaU.DDDChallengue.model.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.model.values.ModelId;
import com.SofkaU.DDDChallengue.model.values.TimeRed;
import com.SofkaU.DDDChallengue.model.values.TrafficLightId;

public class UpdateTrafficLightTimeRed extends Command {
    private final ModelId modelId;
    private final TrafficLightId trafficLightId;
    private final TimeRed timeRed;

    public UpdateTrafficLightTimeRed(ModelId modelId, TrafficLightId trafficLightId, TimeRed timeRed) {
        this.modelId = modelId;
        this.trafficLightId = trafficLightId;
        this.timeRed = timeRed;
    }

    public ModelId getModelId() {
        return modelId;
    }

    public TrafficLightId getTrafficLightId() {
        return trafficLightId;
    }

    public TimeRed getTimeRed() {
        return timeRed;
    }
}
