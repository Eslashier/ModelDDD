package com.SofkaU.DDDChallengue.traffic.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.traffic.values.BusesId;
import com.SofkaU.DDDChallengue.traffic.values.PrivateCarsId;
import com.SofkaU.DDDChallengue.traffic.values.Quantity;
import com.SofkaU.DDDChallengue.traffic.values.TimeOfData;

public class PrivateCarsAdded extends DomainEvent {

    private final PrivateCarsId privateCarsId;
    private final Quantity quantity;
    private final TimeOfData timeOfData;

    public PrivateCarsAdded(PrivateCarsId privateCarsId, Quantity quantity, TimeOfData timeOfData){
        super("challenge.traffic.busesadded");
        this.privateCarsId = privateCarsId;
        this.quantity = quantity;
        this.timeOfData = timeOfData;
    }

    public PrivateCarsId getPrivateCarsId() {
        return privateCarsId;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public TimeOfData getTimeOfData() {
        return timeOfData;
    }
}
