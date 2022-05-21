package com.SofkaU.DDDChallengue.model.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.geometry.values.GeometryId;

public class GeometryLinked extends DomainEvent {

    private final GeometryId geometryId;
    public GeometryLinked(GeometryId geometryId){
        super("challenge.model.geometrylinked");
        this.geometryId = geometryId;
    }

    public GeometryId getGeometryId() {
        return geometryId;
    }
}
