package com.SofkaU.DDDChallengue.traffic;

import co.com.sofka.domain.generic.Entity;
import com.SofkaU.DDDChallengue.traffic.values.PrivateCarsId;
import com.SofkaU.DDDChallengue.traffic.values.Quantity;
import com.SofkaU.DDDChallengue.traffic.values.TimeOfData;

public class PrivateCars extends Entity<PrivateCarsId> {

    private Quantity quantity;
    private TimeOfData timeOfData;

    public PrivateCars(PrivateCarsId entityId, Quantity quantity, TimeOfData timeOfData){
        super(entityId);
        this.quantity = quantity;
        this.timeOfData = timeOfData;
    }

    public void updateQuantity(Quantity quantity){
        this.quantity = quantity;
    }

    public void updateTimeOfData(TimeOfData timeOfData){
        this.timeOfData = timeOfData;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public TimeOfData getTimeOfData() {
        return timeOfData;
    }
}
