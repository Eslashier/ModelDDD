package com.SofkaU.DDDChallengue.model.values;

import co.com.sofka.domain.generic.Identity;
import com.SofkaU.DDDChallengue.geometry.values.GeometryId;

public class TrafficLightId extends Identity {

    public TrafficLightId(){

    }

    private TrafficLightId(String id){
        super(id);
    }

    public static TrafficLightId of(String id){
        return new TrafficLightId(id);
    }
}
