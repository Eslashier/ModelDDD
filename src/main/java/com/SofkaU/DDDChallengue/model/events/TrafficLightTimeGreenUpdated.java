package com.SofkaU.DDDChallengue.model.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.model.values.TimeGreen;
import com.SofkaU.DDDChallengue.model.values.TrafficLightId;

public class TrafficLightTimeGreenUpdated extends DomainEvent {

    private final TrafficLightId trafficLightId;
    private final TimeGreen timeGreen;

    public TrafficLightTimeGreenUpdated(TrafficLightId trafficLightId, TimeGreen timeGreen){
        super("challenge.model.trafficlighttimegreenupdated");
        this.trafficLightId = trafficLightId;
        this.timeGreen = timeGreen;
    }

    public TrafficLightId getTrafficLightId() {
        return trafficLightId;
    }

    public TimeGreen getTimeGreen() {
        return timeGreen;
    }
}
