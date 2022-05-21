package com.SofkaU.DDDChallengue.model.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.model.values.NameOfModel;

public class NameOfModelUpdated extends DomainEvent {

    private final NameOfModel nameOfModel;

    public NameOfModelUpdated(NameOfModel nameOfModel){
        super("challenge.model.nameofmodelupdated");
        this.nameOfModel =  nameOfModel;
    }

    public NameOfModel getNameOfModel() {
        return nameOfModel;
    }
}
