package com.SofkaU.DDDChallengue.traffic.values;

import co.com.sofka.domain.generic.Identity;
import com.SofkaU.DDDChallengue.geometry.values.GeometryId;

public class BusesId extends Identity {
    public BusesId(){

    }

    private BusesId(String id){
        super(id);
    }

    public static BusesId of(String id){
        return new BusesId(id);
    }

}
