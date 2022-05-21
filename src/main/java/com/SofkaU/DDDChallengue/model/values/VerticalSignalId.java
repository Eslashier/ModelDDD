package com.SofkaU.DDDChallengue.model.values;

import co.com.sofka.domain.generic.Identity;

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
