package com.SofkaU.DDDChallengue.model.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.model.values.ModelId;
import com.SofkaU.DDDChallengue.traffic.values.TrafficId;

public class LinkTraffic extends Command {

    private final ModelId modelId;
    private final TrafficId trafficId;

    public LinkTraffic(ModelId modelId, TrafficId trafficId) {
        this.modelId = modelId;
        this.trafficId = trafficId;
    }

    public ModelId getModelId() {
        return modelId;
    }

    public TrafficId getTrafficId() {
        return trafficId;
    }
}
