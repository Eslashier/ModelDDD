package com.SofkaU.DDDChallengue.model;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.EventChange;
import com.SofkaU.DDDChallengue.model.events.GeometryLinked;
import com.SofkaU.DDDChallengue.model.events.ModelCreated;
import com.SofkaU.DDDChallengue.model.events.TrafficLinked;

import java.util.HashSet;

public class ModelChange extends EventChange {

    public ModelChange(Model model){

        apply((ModelCreated event)->{
           model.nameOfModel = event.getNameOfModel();
           model.dateOfModel = event.getDateOfModel();
           model.trafficLights = new HashSet<>();
           model.verticalSignals = new HashSet<>();
        });

        apply((TrafficLinked event) ->{
            model.trafficId = event.getTrafficId();
        });

        apply((GeometryLinked event) ->{
            model.geometryId = event.getGeometryId();
        });
    }
}
