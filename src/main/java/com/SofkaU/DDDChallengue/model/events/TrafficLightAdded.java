package com.SofkaU.DDDChallengue.model.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.model.values.TimeGreen;
import com.SofkaU.DDDChallengue.model.values.TimeRed;
import com.SofkaU.DDDChallengue.model.values.TrafficLightId;

public class TrafficLightAdded extends DomainEvent {
    private final TrafficLightId trafficLightId;
    private final TimeGreen timeGreen;
    private final TimeRed timeRed;

    public TrafficLightAdded(TrafficLightId trafficLightId, TimeGreen timeGreen, TimeRed timeRed){
        super("challenge.model.trafficlightadded");
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
