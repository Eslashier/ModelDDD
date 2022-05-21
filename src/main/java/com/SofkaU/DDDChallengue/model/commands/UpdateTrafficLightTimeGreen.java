package com.SofkaU.DDDChallengue.model.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.model.values.ModelId;
import com.SofkaU.DDDChallengue.model.values.TimeGreen;
import com.SofkaU.DDDChallengue.model.values.TrafficLightId;


public class UpdateTrafficLightTimeGreen extends Command {
    private final ModelId modelId;
    private final TrafficLightId trafficLightId;
    private final TimeGreen timeGreen;

    public UpdateTrafficLightTimeGreen(ModelId modelId, TrafficLightId trafficLightId, TimeGreen timeGreen) {
        this.modelId = modelId;
        this.trafficLightId = trafficLightId;
        this.timeGreen = timeGreen;
    }

    public ModelId getModelId() {
        return modelId;
    }

    public TrafficLightId getTrafficLightId() {
        return trafficLightId;
    }

    public TimeGreen getTimeGreen() {
        return timeGreen;
    }
}
