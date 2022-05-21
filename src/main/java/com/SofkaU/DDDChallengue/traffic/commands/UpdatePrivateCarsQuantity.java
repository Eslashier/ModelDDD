package com.SofkaU.DDDChallengue.traffic.commands;

import ch.qos.logback.core.joran.spi.DefaultClass;
import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.traffic.values.PrivateCarsId;
import com.SofkaU.DDDChallengue.traffic.values.Quantity;
import com.SofkaU.DDDChallengue.traffic.values.TrafficId;

public class UpdatePrivateCarsQuantity extends Command {

    private final TrafficId trafficId;
    private final PrivateCarsId privateCarsId;
    private final Quantity quantity;

    public UpdatePrivateCarsQuantity(TrafficId trafficId, PrivateCarsId privateCarsId, Quantity quantity) {
        this.trafficId = trafficId;
        this.privateCarsId = privateCarsId;
        this.quantity = quantity;
    }

    public TrafficId getTrafficId() {
        return trafficId;
    }

    public PrivateCarsId getPrivateCarsId() {
        return privateCarsId;
    }

    public Quantity getQuantity() {
        return quantity;
    }
}

