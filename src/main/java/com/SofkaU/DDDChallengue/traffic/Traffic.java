package com.SofkaU.DDDChallengue.traffic;

import co.com.sofka.domain.generic.AggregateEvent;
import com.SofkaU.DDDChallengue.traffic.events.BusesAdded;
import com.SofkaU.DDDChallengue.traffic.events.PrivateCarsAdded;
import com.SofkaU.DDDChallengue.traffic.events.TrafficCreated;
import com.SofkaU.DDDChallengue.traffic.values.*;

import java.util.Objects;

public class Traffic extends AggregateEvent<TrafficId> {

    protected TrafficNameLocation trafficNameLocation;
    protected BusesId busesId;
    protected PrivateCarsId privateCarsId;

    public Traffic(TrafficId entityId, TrafficNameLocation trafficNameLocation){
        super(entityId);
        appendChange(new TrafficCreated(trafficNameLocation)).apply();
    }

    public void addPrivateCars(PrivateCarsId entityId, Quantity quantity, TimeOfData timeOfData){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(quantity);
        Objects.requireNonNull(timeOfData);
        appendChange(new PrivateCarsAdded(entityId, quantity, timeOfData)).apply();

    }

    public void addBuses(BusesId entityId, Quantity quantity, TimeOfData timeOfData){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(quantity);
        Objects.requireNonNull(timeOfData);
        appendChange(new BusesAdded(entityId, quantity, timeOfData)).apply();
    }

    public TrafficNameLocation trafficNameLocation() {
        return trafficNameLocation;
    }

    public BusesId busesId() {
        return busesId;
    }

    public PrivateCarsId privateCarsId() {
        return privateCarsId;
    }
}
