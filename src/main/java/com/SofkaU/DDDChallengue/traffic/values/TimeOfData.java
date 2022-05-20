package com.SofkaU.DDDChallengue.traffic.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class TimeOfData implements ValueObject<Date> {
    private final Date value;

    public TimeOfData(Date value){
        this.value = Objects.requireNonNull(value);
    }

    public Date value(){
        return value;
    }
}
