package com.SofkaU.DDDChallengue.model.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.model.values.DateOfModel;
import com.SofkaU.DDDChallengue.model.values.NameOfModel;

public class ModelCreated extends DomainEvent {

    private final NameOfModel nameOfModel;
    private final DateOfModel dateOfModel;

    public ModelCreated(NameOfModel nameOfModel, DateOfModel dateOfModel){
        super("challenge.model.created");
        this.nameOfModel = nameOfModel;
        this.dateOfModel = dateOfModel;
    }

    public NameOfModel getNameOfModel() {
        return nameOfModel;
    }

    public DateOfModel getDateOfModel() {
        return dateOfModel;
    }
}
