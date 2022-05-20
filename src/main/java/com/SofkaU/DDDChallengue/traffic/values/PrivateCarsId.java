package com.SofkaU.DDDChallengue.traffic.values;

import co.com.sofka.domain.generic.Identity;
import com.SofkaU.DDDChallengue.geometry.values.GeometryId;

public class PrivateCarsId extends Identity {

    public PrivateCarsId(){

    }

    private PrivateCarsId(String id){
        super(id);
    }

    public static PrivateCarsId of(String id){
        return new PrivateCarsId(id);
    }
}
