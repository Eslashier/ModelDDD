package com.SofkaU.DDDChallengue.traffic.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.traffic.values.BusesId;
import com.SofkaU.DDDChallengue.traffic.values.Quantity;
import com.SofkaU.DDDChallengue.traffic.values.TimeOfData;
import com.SofkaU.DDDChallengue.traffic.values.TrafficId;

public class UpdateBusesTimeOfData extends Command {

    private final TrafficId trafficId;
    private final BusesId busesId;
    private final TimeOfData timeOfData;

    public UpdateBusesTimeOfData(TrafficId trafficId, BusesId busesId, TimeOfData timeOfData) {
        this.trafficId = trafficId;
        this.busesId = busesId;
        this.timeOfData = timeOfData;
    }

    public TrafficId getTrafficId() {
        return trafficId;
    }

    public BusesId getBusesId() {
        return busesId;
    }

    public TimeOfData getTimeOfData() {
        return timeOfData;
    }
}
