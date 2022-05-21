package com.SofkaU.DDDChallengue.geometry.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.geometry.values.GeometryNameLocation;

public class GeometryNameLocationUpdated extends DomainEvent{

    private final GeometryNameLocation geometryNameLocation;

    public GeometryNameLocationUpdated(GeometryNameLocation geometryNameLocation){
        super("challenge.geometry.namelocationupdated");
        this.geometryNameLocation = geometryNameLocation;
    }

    public GeometryNameLocation getGeometryNameLocation() {
        return geometryNameLocation;
    }
}
