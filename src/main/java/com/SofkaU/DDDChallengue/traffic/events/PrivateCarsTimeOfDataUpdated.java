package com.SofkaU.DDDChallengue.traffic.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.traffic.values.BusesId;
import com.SofkaU.DDDChallengue.traffic.values.PrivateCarsId;
import com.SofkaU.DDDChallengue.traffic.values.TimeOfData;

public class PrivateCarsTimeOfDataUpdated extends DomainEvent {

    public final PrivateCarsId privateCarsId;
    public final TimeOfData timeOfData;

    public PrivateCarsTimeOfDataUpdated(PrivateCarsId privateCarsId, TimeOfData timeOfData){
        super("challenge.traffic.privatecarstimeofdataupdated");
        this.privateCarsId = privateCarsId;
        this.timeOfData = timeOfData;
    }

    public PrivateCarsId getPrivateCarsId() {
        return privateCarsId;
    }

    public TimeOfData getTimeOfData() {
        return timeOfData;
    }
}


