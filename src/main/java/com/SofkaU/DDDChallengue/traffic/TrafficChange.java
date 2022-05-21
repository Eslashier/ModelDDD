package com.SofkaU.DDDChallengue.traffic;

import co.com.sofka.domain.generic.EventChange;
import com.SofkaU.DDDChallengue.traffic.events.TrafficCreated;

import java.util.HashSet;

public class TrafficChange extends EventChange {
    public TrafficChange(Traffic traffic){

        apply((TrafficCreated event) ->{
            traffic.trafficNameLocation = event.getTrafficNameLocation();
            traffic.buses = new HashSet<>();
            traffic.privateCars = new HashSet<>();
        });
    }
}
