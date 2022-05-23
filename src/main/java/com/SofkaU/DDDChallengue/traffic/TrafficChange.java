package com.SofkaU.DDDChallengue.traffic;

import co.com.sofka.domain.generic.EventChange;
import com.SofkaU.DDDChallengue.traffic.events.*;

import java.util.HashSet;

public class TrafficChange extends EventChange {
    public TrafficChange(Traffic traffic){

        apply((TrafficCreated event) ->{
            traffic.trafficNameLocation = event.getTrafficNameLocation();
            traffic.buses = new HashSet<>();
            traffic.privateCars = new HashSet<>();
        });

        apply((BusesAdded event)->{
            var numBuses = traffic.buses.size();
            if(numBuses >1){
                throw new IllegalArgumentException("Cannot add more than one buses set");
            }
            traffic.buses.add(new Buses(
                    event.getBusesId(),
                    event.getQuantity(),
                    event.getTimeOfData()
            ));
        });

        apply((PrivateCarsAdded event)->{
            var numCars = traffic.privateCars.size();
            if(numCars >1){
                throw new IllegalArgumentException("Cannot add more than one private cars set");
            }
            traffic.privateCars.add(new PrivateCars(
                    event.getPrivateCarsId(),
                    event.getQuantity(),
                    event.getTimeOfData()
            ));
        });

        apply((TrafficNameLocationUpdated event)->{
            traffic.trafficNameLocation = event.getTrafficNameLocation();
        });

        apply((BusesTimeOfDataUpdated event)->{
            var buses = traffic.getBusesById(event.getBusesId())
                    .orElseThrow(()->new IllegalArgumentException("Set of buses not found"));
            buses.updateTimeOfData(event.getTimeOfData());
        });


        apply((PrivateCarsTimeOfDataUpdated event)->{
            var buses = traffic.getPrivateCarsById(event.getPrivateCarsId())
                    .orElseThrow(()->new IllegalArgumentException("Set of private cars not found"));
            buses.updateTimeOfData(event.getTimeOfData());
        });
    }
}
