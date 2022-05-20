package com.SofkaU.DDDChallengue.model.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class SignalGroup implements ValueObject<String> {
    private final String value;

    public SignalGroup(String value){
        this.value= Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The signal group cannot be empty it should be ");
        }

        if(this.value.length()<=4){
            throw new IllegalArgumentException("Please enter a valid signal group without abbreviation");
        }
    }

    public String value(){
        return value;
    }
}
