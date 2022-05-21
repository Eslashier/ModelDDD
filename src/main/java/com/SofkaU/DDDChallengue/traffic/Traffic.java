package com.SofkaU.DDDChallengue.traffic;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.traffic.events.BusesAdded;
import com.SofkaU.DDDChallengue.traffic.events.PrivateCarsAdded;
import com.SofkaU.DDDChallengue.traffic.events.TrafficCreated;
import com.SofkaU.DDDChallengue.traffic.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Traffic extends AggregateEvent<TrafficId> {

    protected TrafficNameLocation trafficNameLocation;
    protected Set<Buses> buses;
    protected Set<PrivateCars> privateCars;

    public Traffic(TrafficId entityId, TrafficNameLocation trafficNameLocation){
        super(entityId);
        appendChange(new TrafficCreated(trafficNameLocation)).apply();
    }
    private Traffic(TrafficId entityId){
        super(entityId);
        subscribe(new TrafficChange(this));
    }

    public static Traffic from(TrafficId trafficId, List<DomainEvent> events){
        var traffic = new Traffic(trafficId);
        events.forEach(traffic::applyEvent);
        return traffic;
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

    public Set<Buses> buses() {
        return buses;
    }

    public Set<PrivateCars> privateCars() {
        return privateCars;
    }
}
