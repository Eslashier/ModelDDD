package com.SofkaU.DDDChallengue.model.events;

import co.com.sofka.domain.generic.DomainEvent;

public class TrafficNotification extends DomainEvent {

    private String message;

    public TrafficNotification(String message){
        super("challenge.model.trafficnotification");
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
