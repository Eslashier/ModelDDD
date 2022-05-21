package com.SofkaU.DDDChallengue.traffic.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.traffic.values.BusesId;
import com.SofkaU.DDDChallengue.traffic.values.Quantity;
import com.SofkaU.DDDChallengue.traffic.values.TimeOfData;

public class BusesAdded extends DomainEvent {
    private final BusesId busesId;
    private final Quantity quantity;
    private final TimeOfData timeOfData;

    public BusesAdded(BusesId busesId, Quantity quantity, TimeOfData timeOfData){
        super("challenge.traffic.busesadded");
        this.busesId = busesId;
        this.quantity = quantity;
        this.timeOfData = timeOfData;
    }

    public BusesId getBusesId() {
        return busesId;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public TimeOfData getTimeOfData() {
        return timeOfData;
    }
}
