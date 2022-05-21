package com.SofkaU.DDDChallengue.model.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.traffic.values.TrafficId;


public class TrafficLinked extends DomainEvent {

    private final TrafficId trafficId;
    public TrafficLinked(TrafficId trafficId){
        super("challenge.model.trafficlinked");
        this.trafficId = trafficId;
    }

    public TrafficId getTrafficId() {
        return trafficId;
    }


}
