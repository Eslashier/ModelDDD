package com.SofkaU.DDDChallengue.model;

import co.com.sofka.domain.generic.EventChange;
import com.SofkaU.DDDChallengue.model.events.*;

import java.util.HashSet;

public class ModelChange extends EventChange {

    public ModelChange(Model model){

        apply((ModelCreated event)->{
           model.nameOfModel = event.getNameOfModel();
           model.dateOfModel = event.getDateOfModel();
           model.trafficLights = new HashSet<>();
           model.verticalSignals = new HashSet<>();
        });

        apply((TrafficLinked event) -> model.trafficId = event.getTrafficId());

        apply((GeometryLinked event) -> model.geometryId = event.getGeometryId());

        apply((TrafficLightAdded event)->{
            var numTrafficLights = model.trafficLights.size();
            if(numTrafficLights>1){
                throw new IllegalArgumentException("Cannot add more than one TrafficLights for the moment");
            }
            model.trafficLights.add(new TrafficLight(
                    event.getTrafficLightId(),
                    event.getTimeGreen(),
                    event.getTimeRed()
            ));
        });

        apply((VerticalSignalAdded event)->{
            var numVerticalSignals = model.verticalSignals.size();
            if(numVerticalSignals>1){
                throw new IllegalArgumentException("Cannot add more than one Vertical signals for the moment");
            }
            model.verticalSignals.add(new VerticalSignal(
                    event.getVerticalSignalId(),
                    event.getSignalGroup(),
                    event.getSignalName()
            ));
        });
    }
}
