package com.SofkaU.DDDChallengue.traffic;

import co.com.sofka.domain.generic.Entity;
import com.SofkaU.DDDChallengue.traffic.values.BusesId;
import com.SofkaU.DDDChallengue.traffic.values.Quantity;
import com.SofkaU.DDDChallengue.traffic.values.TimeOfData;

import java.util.Objects;

public class Buses extends Entity<BusesId> {

    private Quantity quantity;
    private TimeOfData timeOfData;

    public Buses(BusesId entityId, Quantity quantity, TimeOfData timeOfData){
        super(entityId);
        this.quantity = quantity;
        this.timeOfData = timeOfData;
    }
    public void updateQuantity(Quantity quantity){
        this.quantity = Objects.requireNonNull(quantity);
    }

    public void updateTimeOfData(TimeOfData timeOfData){
        this.timeOfData = Objects.requireNonNull(timeOfData);
    }
    public Quantity getQuantity() {
        return quantity;
    }

    public TimeOfData getTimeOfData() {
        return timeOfData;
    }
}
