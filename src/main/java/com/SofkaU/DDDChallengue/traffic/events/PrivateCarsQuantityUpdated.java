package com.SofkaU.DDDChallengue.traffic.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.traffic.values.BusesId;
import com.SofkaU.DDDChallengue.traffic.values.PrivateCarsId;
import com.SofkaU.DDDChallengue.traffic.values.Quantity;

public class PrivateCarsQuantityUpdated extends DomainEvent {

    private final PrivateCarsId privateCarsId;
    private final Quantity quantity;

    public PrivateCarsQuantityUpdated(PrivateCarsId privateCarsId, Quantity quantity){
        super("challenge.traffic.busesquantityupdated");
        this.privateCarsId = privateCarsId;
        this.quantity = quantity;
    }

    public PrivateCarsId getPrivateCarsId() {
        return privateCarsId;
    }

    public Quantity getQuantity() {
        return quantity;
    }
}
