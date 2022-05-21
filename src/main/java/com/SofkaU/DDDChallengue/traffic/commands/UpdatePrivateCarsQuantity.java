package com.SofkaU.DDDChallengue.traffic.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.traffic.values.BusesId;
import com.SofkaU.DDDChallengue.traffic.values.PrivateCarsId;
import com.SofkaU.DDDChallengue.traffic.values.Quantity;

public class UpdatePrivateCarsQuantity extends Command {

    private final PrivateCarsId privateCarsId;
    private final Quantity quantity;

    public UpdatePrivateCarsQuantity(PrivateCarsId privateCarsId, Quantity quantity) {
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
