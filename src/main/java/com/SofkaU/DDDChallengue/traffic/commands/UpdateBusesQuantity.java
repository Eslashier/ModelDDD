package com.SofkaU.DDDChallengue.traffic.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.traffic.values.BusesId;
import com.SofkaU.DDDChallengue.traffic.values.Quantity;

public class UpdateBusesQuantity extends Command {

    private final BusesId busesId;
    private final Quantity quantity;

    public UpdateBusesQuantity(BusesId busesId, Quantity quantity) {
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
