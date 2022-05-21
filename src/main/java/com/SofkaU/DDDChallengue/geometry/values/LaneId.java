package com.SofkaU.DDDChallengue.geometry.values;

import co.com.sofka.domain.generic.Identity;

public class LaneId extends Identity {
    public LaneId(){

    }

    private LaneId(String uid){
        super(uid);
    }

    public static LaneId of(String uid){
        return new LaneId(uid);
    }
}
