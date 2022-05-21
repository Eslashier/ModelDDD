package com.SofkaU.DDDChallengue.traffic.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.traffic.values.PrivateCarsId;
import com.SofkaU.DDDChallengue.traffic.values.Quantity;
import com.SofkaU.DDDChallengue.traffic.values.TimeOfData;

public class AddPrivateCars extends Command {

    private final PrivateCarsId privateCarsId;
    private final Quantity quantity;
    private final TimeOfData timeOfData;

    public AddPrivateCars(PrivateCarsId privateCarsId, Quantity quantity, TimeOfData timeOfData) {
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
