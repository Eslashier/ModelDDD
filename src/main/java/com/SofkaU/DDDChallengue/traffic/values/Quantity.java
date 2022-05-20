package com.SofkaU.DDDChallengue.traffic.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Quantity implements ValueObject<Integer> {
    private final Integer value;

    public Quantity(Integer value){
        this.value = Objects.requireNonNull(value);
        if(this.value<0){
            throw new IllegalArgumentException("Number of vehicles cannot be negative");
        }
        if(this.value>10000){
            throw new IllegalArgumentException("There is a huge ammount of vehicules please check your quantity");
        }
    }

    public Integer value(){
        return value;
    }
}
