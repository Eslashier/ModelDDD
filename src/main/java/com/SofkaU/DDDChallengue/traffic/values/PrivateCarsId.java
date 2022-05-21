package com.SofkaU.DDDChallengue.traffic.values;

import co.com.sofka.domain.generic.Identity;

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
