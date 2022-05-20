package com.SofkaU.DDDChallengue.model.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class DateOfModel implements ValueObject<Date> {
    private final Date value;

    public DateOfModel(Date value){
        this.value = Objects.requireNonNull(value);
    }

    public Date value(){
        return value;
    }

}
