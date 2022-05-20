package com.SofkaU.DDDChallengue.geometry.values;

import co.com.sofka.domain.generic.Identity;

public class SidewalkId extends Identity {
    public SidewalkId(){

    }

    private SidewalkId(String id){
        super(id);
    }

    public static SidewalkId of(String id){
        return new SidewalkId(id);
    }
}
