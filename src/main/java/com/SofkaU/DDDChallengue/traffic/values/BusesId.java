package com.SofkaU.DDDChallengue.traffic.values;

import co.com.sofka.domain.generic.Identity;
import com.SofkaU.DDDChallengue.geometry.values.GeometryId;

public class BusesId extends Identity {
    public BusesId(){

    }

    private BusesId(String uid){
        super(uid);
    }

    public static BusesId of(String uid){
        return new BusesId(uid);
    }

}
