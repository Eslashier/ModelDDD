package com.SofkaU.DDDChallengue.geometry.values;

import co.com.sofka.domain.generic.Identity;

public class LaneId extends Identity {
    public LaneId(){

    }

    private LaneId(String id){
        super(id);
    }

    public static LaneId of(String id){
        return new LaneId(id);
    }
}
