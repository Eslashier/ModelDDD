package com.SofkaU.DDDChallengue.model.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.model.values.ModelId;
import com.SofkaU.DDDChallengue.model.values.TimeGreen;
import com.SofkaU.DDDChallengue.model.values.TimeRed;
import com.SofkaU.DDDChallengue.model.values.TrafficLightId;

public class AddTrafficLight extends Command {

    private final ModelId modelId;
    private final TrafficLightId trafficLightId;
    private final TimeGreen timeGreen;
    private final TimeRed timeRed;

    public AddTrafficLight(ModelId modelId, TrafficLightId trafficLightId, TimeGreen timeGreen, TimeRed timeRed) {
        this.modelId = modelId;
        this.trafficLightId = trafficLightId;
        this.timeGreen = timeGreen;
        this.timeRed = timeRed;
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

    public TimeRed getTimeRed() {
        return timeRed;
    }
}
