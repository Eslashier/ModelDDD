package com.SofkaU.DDDChallengue.model.values;

import co.com.sofka.domain.generic.Identity;
import com.SofkaU.DDDChallengue.geometry.values.GeometryId;

public class VerticalSignalId extends Identity {
    public VerticalSignalId(){

    }

    private VerticalSignalId(String id){
        super(id);
    }

    public static VerticalSignalId of(String id){
        return new VerticalSignalId(id);
    }
}
