package com.SofkaU.DDDChallengue.traffic.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.traffic.Traffic;
import com.SofkaU.DDDChallengue.traffic.values.TrafficId;
import com.SofkaU.DDDChallengue.traffic.values.TrafficNameLocation;

public class TrafficNameLocationUpdated extends DomainEvent {

    private final TrafficNameLocation trafficNameLocation;

    public TrafficNameLocationUpdated(TrafficNameLocation trafficNameLocation){
        super("challenge.traffic.trafficnamelocationupdated");
        this.trafficNameLocation = trafficNameLocation;
    }

    public TrafficNameLocation getTrafficNameLocation() {
        return trafficNameLocation;
    }
}
