package com.SofkaU.DDDChallengue.traffic.values;

import co.com.sofka.domain.generic.Identity;

public class TrafficId extends Identity {

    public TrafficId(){

    }

    private TrafficId(String uid){
        super(uid);
    }

    public static TrafficId of(String uid){
        return new TrafficId(uid);
    }
}
