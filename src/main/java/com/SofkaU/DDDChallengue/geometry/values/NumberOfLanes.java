package com.SofkaU.DDDChallengue.geometry.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumberOfLanes implements ValueObject<Integer>{
    private final Integer value;

    public NumberOfLanes(Integer value){
        this.value = Objects.requireNonNull(value);
        if(this.value==0){
            throw new IllegalArgumentException("Number of lanes cannot be empty or be 0");
        }
        if(this.value<0){
            throw new IllegalArgumentException("Number of lanes cannot be negative");
        }
        if(this.value>26){
            throw new IllegalArgumentException("There is no freeway with more than 26 lanes");
        }
    }

    public Integer value(){
        return value;
    }
}
