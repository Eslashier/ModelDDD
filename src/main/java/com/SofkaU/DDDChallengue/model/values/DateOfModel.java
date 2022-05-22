package com.SofkaU.DDDChallengue.model.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DateOfModel implements ValueObject<String> {
    private final String value;

    public DateOfModel(String value){
        this.value = Objects.requireNonNull(value);
    }

    public String value(){
        return value;
    }

}
