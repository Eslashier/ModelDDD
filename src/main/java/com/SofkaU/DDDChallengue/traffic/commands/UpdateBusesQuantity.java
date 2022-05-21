package com.SofkaU.DDDChallengue.traffic.commands;

import ch.qos.logback.core.joran.spi.DefaultClass;
import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.traffic.Traffic;
import com.SofkaU.DDDChallengue.traffic.values.BusesId;
import com.SofkaU.DDDChallengue.traffic.values.Quantity;
import com.SofkaU.DDDChallengue.traffic.values.TrafficId;

public class UpdateBusesQuantity extends Command {

    private final TrafficId trafficId;
    private final BusesId busesId;
    private final Quantity quantity;

    public UpdateBusesQuantity(TrafficId trafficId, BusesId busesId, Quantity quantity) {
        this.trafficId = trafficId;
        this.busesId = busesId;
        this.quantity = quantity;
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

}
