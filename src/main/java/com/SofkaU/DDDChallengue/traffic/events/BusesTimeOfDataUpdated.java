package com.SofkaU.DDDChallengue.traffic.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.traffic.Buses;
import com.SofkaU.DDDChallengue.traffic.values.BusesId;
import com.SofkaU.DDDChallengue.traffic.values.TimeOfData;


public class BusesTimeOfDataUpdated extends DomainEvent {

    public final BusesId busesId;
    public final TimeOfData timeOfData;

    public BusesTimeOfDataUpdated(BusesId busesId, TimeOfData timeOfData){
        super("challenge.traffic.busestimeofdataupdated");
        this.busesId = busesId;
        this.timeOfData = timeOfData;
    }

    public BusesId getBusesId() {
        return busesId;
    }

    public TimeOfData getTimeOfData() {
        return timeOfData;
    }
}
