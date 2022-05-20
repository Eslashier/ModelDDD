package com.SofkaU.DDDChallengue.traffic.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TrafficNameLocation implements ValueObject<String> {

    private final String value;

    public TrafficNameLocation(String value){
        this.value= Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The material cannot be empty");
        }

        if(this.value.length()<=4){
            throw new IllegalArgumentException("Please enter a valid material without abbreviation");
        }
    }

    public String value(){
        return value;
    }
}
