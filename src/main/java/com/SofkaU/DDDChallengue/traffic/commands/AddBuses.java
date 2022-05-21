package com.SofkaU.DDDChallengue.traffic.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.traffic.values.BusesId;
import com.SofkaU.DDDChallengue.traffic.values.Quantity;
import com.SofkaU.DDDChallengue.traffic.values.TimeOfData;

public class AddBuses extends Command {

    private final BusesId busesId;
    private final Quantity quantity;
    private final TimeOfData timeOfData;

    public AddBuses(BusesId busesId, Quantity quantity, TimeOfData timeOfData) {
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
