package com.SofkaU.DDDChallengue.model.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TimeRed implements ValueObject<Integer> {
    private final Integer value;

    public TimeRed(Integer value){
        this.value = Objects.requireNonNull(value);
        if(this.value==0){
            throw new IllegalArgumentException("Time of red light must be greater than 0 and uses seconds");
        }
        if(this.value<0){
            throw new IllegalArgumentException("A time cannot be negative");
        }
        if(this.value>600){
            throw new IllegalArgumentException("Please check if your red light time is correct, over 600 seconds");
        }
    }

    public Integer value(){
        return value;
    }
}
