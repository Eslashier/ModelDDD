package com.SofkaU.DDDChallengue.model.values;

import co.com.sofka.domain.generic.Identity;

public class ModelId extends Identity {
    public ModelId(){

    }

    private ModelId(String uid){
        super(uid);
    }

    public static ModelId of(String uid){
        return new ModelId(uid);
    }

}
