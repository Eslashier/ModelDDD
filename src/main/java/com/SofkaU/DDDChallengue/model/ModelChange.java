package com.SofkaU.DDDChallengue.model;

import co.com.sofka.domain.generic.EventChange;
import com.SofkaU.DDDChallengue.model.commands.UpdateTrafficLightTimeGreen;
import com.SofkaU.DDDChallengue.model.events.*;
import com.SofkaU.DDDChallengue.model.values.DateOfModel;
import com.SofkaU.DDDChallengue.model.values.NameOfModel;
import com.SofkaU.DDDChallengue.traffic.events.BusesQuantityUpdated;

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

        apply((NameOfModelUpdated event)-> model.nameOfModel = event.getNameOfModel());

        apply((DateOfModelUpdated event)-> model.dateOfModel = event.getDateOfModel());

        apply((TrafficLightTimeGreenUpdated event)->{
            var lights = model.getTrafficLightById(event.getTrafficLightId())
                    .orElseThrow(()->new IllegalArgumentException(("Set of Traffic lights not found")));
            lights.updateTimeGreen(event.getTimeGreen());
        });

        apply((TrafficLightTimeRedUpdated event)->{
            var lights = model.getTrafficLightById(event.getTrafficLightId())
                    .orElseThrow(()->new IllegalArgumentException(("Set of Traffic lights not found")));
            lights.updateTimeRed(event.getTimeRed());
        });

        apply((VerticalSignalGroupUpdated event)->{
            var signals = model.getVerticalSignalById(event.getVerticalSignalId())
                    .orElseThrow(()->new IllegalArgumentException(("Set of signals not found")));
            signals.updateSignalGroup(event.getSignalGroup());
        });

        apply((VerticalSignalNameUpdated event)->{
            var signals = model.getVerticalSignalById(event.getVerticalSignalId())
                    .orElseThrow(()->new IllegalArgumentException(("Set of signals not found")));
            signals.updateSignalName(event.getSignalName());
        });
    }
}
