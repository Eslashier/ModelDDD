package com.SofkaU.DDDChallengue.traffic.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.traffic.values.BusesId;
import com.SofkaU.DDDChallengue.traffic.values.Quantity;
import com.SofkaU.DDDChallengue.traffic.values.TimeOfData;
import com.SofkaU.DDDChallengue.traffic.values.TrafficId;

public class AddBuses extends Command {

    private final TrafficId trafficId;
    private final BusesId busesId;
    private final Quantity quantity;
    private final TimeOfData timeOfData;

    public AddBuses(TrafficId trafficId, BusesId busesId, Quantity quantity, TimeOfData timeOfData) {
        this.trafficId = trafficId;
        this.busesId = busesId;
        this.quantity = quantity;
        this.timeOfData = timeOfData;
    }

    public TrafficId getTrafficId() {
        return trafficId;
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
