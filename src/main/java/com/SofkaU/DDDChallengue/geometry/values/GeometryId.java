package com.SofkaU.DDDChallengue.geometry.values;

import co.com.sofka.domain.generic.Identity;

public class GeometryId extends Identity {
    public GeometryId(){

    }

    private GeometryId(String id){
        super(id);
    }

    public static GeometryId of(String id){
        return new GeometryId(id);
    }

}
