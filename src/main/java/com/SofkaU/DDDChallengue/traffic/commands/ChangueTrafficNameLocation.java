package com.SofkaU.DDDChallengue.traffic.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.traffic.values.PrivateCarsId;
import com.SofkaU.DDDChallengue.traffic.values.TrafficId;
import com.SofkaU.DDDChallengue.traffic.values.TrafficNameLocation;

public class ChangueTrafficNameLocation extends Command {

    private final TrafficId trafficId;
    private final TrafficNameLocation trafficNameLocation;

    public ChangueTrafficNameLocation(TrafficId trafficId, TrafficNameLocation trafficNameLocation) {
        this.trafficId = trafficId;
        this.trafficNameLocation = trafficNameLocation;
    }

    public TrafficId getTrafficId() {
        return trafficId;
    }

    public TrafficNameLocation getTrafficNameLocation() {
        return trafficNameLocation;
    }
}
