package com.SofkaU.DDDChallengue.model.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.model.values.TimeRed;
import com.SofkaU.DDDChallengue.model.values.TrafficLightId;

public class TrafficLightTimeRedUpdated extends DomainEvent {

    private final TrafficLightId trafficLightId;
    private final TimeRed timeRed;

    public TrafficLightTimeRedUpdated(TrafficLightId trafficLightId, TimeRed timeRed){
        super("challenge.model.trafficlighttimeredupdated");
        this.trafficLightId = trafficLightId;
        this.timeRed = timeRed;
    }

    public TrafficLightId getTrafficLightId() {
        return trafficLightId;
    }

    public TimeRed getTimeRed() {
        return timeRed;
    }
}
