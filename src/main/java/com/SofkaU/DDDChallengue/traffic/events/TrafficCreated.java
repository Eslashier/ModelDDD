package com.SofkaU.DDDChallengue.traffic.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.model.values.NameOfModel;
import com.SofkaU.DDDChallengue.traffic.values.TrafficNameLocation;

public class TrafficCreated extends DomainEvent {
    private final TrafficNameLocation trafficNameLocation;

    public TrafficCreated(TrafficNameLocation trafficNameLocation){
        super("challenge.traffic.created");
        this.trafficNameLocation = trafficNameLocation;
    }

    public TrafficNameLocation getTrafficNameLocation() {
        return trafficNameLocation;
    }
}
