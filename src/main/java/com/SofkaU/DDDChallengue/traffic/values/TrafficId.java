package com.SofkaU.DDDChallengue.traffic.values;

import co.com.sofka.domain.generic.Identity;
import com.SofkaU.DDDChallengue.geometry.values.GeometryId;

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
