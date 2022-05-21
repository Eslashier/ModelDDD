package com.SofkaU.DDDChallengue.model.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.model.values.DateOfModel;
import com.SofkaU.DDDChallengue.model.values.NameOfModel;

public class DateOfModelUpdated extends DomainEvent {

    private final DateOfModel dateOfModel;

    public DateOfModelUpdated(DateOfModel dateOfModel){
        super("challenge.model.dateofmodelupdated");
        this.dateOfModel =  dateOfModel;
    }

    public DateOfModel getDateOfModel() {
        return dateOfModel;
    }
}
