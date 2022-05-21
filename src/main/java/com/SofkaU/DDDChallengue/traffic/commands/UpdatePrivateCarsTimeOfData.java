package com.SofkaU.DDDChallengue.traffic.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.traffic.values.PrivateCarsId;
import com.SofkaU.DDDChallengue.traffic.values.TimeOfData;
import com.SofkaU.DDDChallengue.traffic.values.TrafficId;

public class UpdatePrivateCarsTimeOfData extends Command {

    private final TrafficId trafficId;
    private final PrivateCarsId privateCarsId;
    private final TimeOfData timeOfData;

    public UpdatePrivateCarsTimeOfData(TrafficId trafficId, PrivateCarsId privateCarsId, TimeOfData timeOfData) {
        this.trafficId = trafficId;
        this.privateCarsId = privateCarsId;
        this.timeOfData = timeOfData;
    }

    public TrafficId getTrafficId() {
        return trafficId;
    }

    public PrivateCarsId getPrivateCarsId() {
        return privateCarsId;
    }

    public TimeOfData getTimeOfData() {
        return timeOfData;
    }
}
