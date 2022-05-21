package com.SofkaU.DDDChallengue.model.events;

import co.com.sofka.domain.generic.DomainEvent;

public class GeometryNotification extends DomainEvent {

    private String message;

    public GeometryNotification(String message){
        super("challenge.model.geometrynotification");
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
