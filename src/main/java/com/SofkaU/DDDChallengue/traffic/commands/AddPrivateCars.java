package com.SofkaU.DDDChallengue.traffic.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.traffic.values.PrivateCarsId;
import com.SofkaU.DDDChallengue.traffic.values.Quantity;
import com.SofkaU.DDDChallengue.traffic.values.TimeOfData;
import com.SofkaU.DDDChallengue.traffic.values.TrafficId;

public class AddPrivateCars extends Command {

    private final TrafficId trafficId;
    private final PrivateCarsId privateCarsId;
    private final Quantity quantity;
    private final TimeOfData timeOfData;

    public AddPrivateCars(TrafficId trafficId, PrivateCarsId privateCarsId, Quantity quantity, TimeOfData timeOfData) {
        this.trafficId = trafficId;
        this.privateCarsId = privateCarsId;
        this.quantity = quantity;
        this.timeOfData = timeOfData;
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

    public TimeOfData getTimeOfData() {
        return timeOfData;
    }
}
