package com.SofkaU.DDDChallengue.model.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class SignalName implements ValueObject<String> {
    private final String value;

    public SignalName(String value){
        this.value= Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The signal name cannot be empty");
        }

        if(this.value.length()<=4){
            throw new IllegalArgumentException("Please enter a valid signal name without abbreviation");
        }
    }

    public String value(){
        return value;
    }
}
