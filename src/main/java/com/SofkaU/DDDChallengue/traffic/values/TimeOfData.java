package com.SofkaU.DDDChallengue.traffic.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TimeOfData implements ValueObject<String> {

    private final String value;

    public TimeOfData(String value){
        this.value = Objects.requireNonNull(value);
    }

    public String value(){
        return value;
    }
}
