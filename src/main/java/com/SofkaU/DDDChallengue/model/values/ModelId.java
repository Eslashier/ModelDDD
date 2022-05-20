package com.SofkaU.DDDChallengue.model.values;

import co.com.sofka.domain.generic.Identity;
import com.SofkaU.DDDChallengue.geometry.values.GeometryId;

public class ModelId extends Identity {
    public ModelId(){

    }

    private ModelId(String id){
        super(id);
    }

    public static ModelId of(String id){
        return new ModelId(id);
    }

}
