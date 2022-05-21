package com.SofkaU.DDDChallengue.model.values;

import co.com.sofka.domain.generic.Identity;

public class TrafficLightId extends Identity {

    public TrafficLightId(){

    }

    private TrafficLightId(String uid){
        super(uid);
    }

    public static TrafficLightId of(String uid){
        return new TrafficLightId(uid);
    }
}
