package com.SofkaU.DDDChallengue.traffic.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.traffic.values.BusesId;
import com.SofkaU.DDDChallengue.traffic.values.Quantity;

public class BusesQuantityUpdated extends DomainEvent {
    private final BusesId busesId;
    private final Quantity quantity;

    public BusesQuantityUpdated(BusesId busesId, Quantity quantity){
        super("challenge.traffic.busesquantityupdated");
        this.busesId = busesId;
        this.quantity = quantity;
    }

    public BusesId getBusesId() {
        return busesId;
    }

    public Quantity getQuantity() {
        return quantity;
    }
}
