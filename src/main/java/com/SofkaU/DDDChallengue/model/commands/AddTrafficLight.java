package com.SofkaU.DDDChallengue.model.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.model.values.TimeGreen;
import com.SofkaU.DDDChallengue.model.values.TimeRed;
import com.SofkaU.DDDChallengue.model.values.TrafficLightId;

public class AddTrafficLight extends Command {

    private final TrafficLightId trafficLightId;
    private final TimeGreen timeGreen;
    private final TimeRed timeRed;

    public AddTrafficLight(TrafficLightId trafficLightId, TimeGreen timeGreen, TimeRed timeRed) {
        this.trafficLightId = trafficLightId;
        this.timeGreen = timeGreen;
        this.timeRed = timeRed;
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
