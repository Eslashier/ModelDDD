package com.SofkaU.DDDChallengue.geometry.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Wide implements ValueObject<Double> {
    private final Double value;

    public Wide(Double value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isNaN()){
            throw new IllegalArgumentException("The lane wide cannot be empty");
        }

        if(this.value < 0){
            throw  new IllegalArgumentException("A distance cannot be negative");
        }
    }

    public Double value(){
        return value;
    }
}
