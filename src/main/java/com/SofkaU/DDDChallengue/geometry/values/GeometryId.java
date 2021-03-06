package com.SofkaU.DDDChallengue.geometry.values;

import co.com.sofka.domain.generic.Identity;
import com.SofkaU.DDDChallengue.model.values.ModelId;

public class GeometryId extends Identity {
    public GeometryId(){

    }

    private GeometryId(String uid){
        super(uid);
    }

    public static GeometryId of(String uid){
        return new GeometryId(uid);
    }
}
