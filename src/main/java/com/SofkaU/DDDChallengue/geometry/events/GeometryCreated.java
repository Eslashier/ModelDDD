package com.SofkaU.DDDChallengue.geometry.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.geometry.values.GeometryNameLocation;

public class GeometryCreated extends DomainEvent {

    private final GeometryNameLocation geometryNameLocation;

    public GeometryCreated(GeometryNameLocation geometryNameLocation){
        super("challenge.geometry.created");
        this.geometryNameLocation = geometryNameLocation;
    }

    public GeometryNameLocation getGeometryNameLocation() {
        return geometryNameLocation;
    }
}
