package com.SofkaU.DDDChallengue.geometry;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.geometry.events.GeometryCreated;
import com.SofkaU.DDDChallengue.geometry.events.LanesAdded;
import com.SofkaU.DDDChallengue.geometry.events.SideWalkAdded;
import com.SofkaU.DDDChallengue.geometry.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Geometry extends AggregateEvent<GeometryId> {

    protected GeometryNameLocation geometryNameLocation;
    protected Set<Lanes> lanes;
    protected Set<Sidewalk> sidewalk;

    public Geometry(GeometryId entityId, GeometryNameLocation geometryNameLocation) {
        super(entityId);
        appendChange(new GeometryCreated(geometryNameLocation)).apply();
    }

    private Geometry(GeometryId entityId){
        super(entityId);
        subscribe(new GeometryChange(this));
    }

    public static Geometry from(GeometryId geometryId, List<DomainEvent> events){
        var geometry = new Geometry(geometryId);
        events.forEach(geometry::applyEvent);
        return geometry;
    }
    public void addLanes(LaneId entityId, LaneWide laneWide, NumberOfLanes numberOfLanes) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(laneWide);
        Objects.requireNonNull(numberOfLanes);
        appendChange(new LanesAdded(entityId, laneWide, numberOfLanes)).apply();
    }

    public void addSidewalk(SidewalkId entityId, Wide wide, Material material) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(wide);
        Objects.requireNonNull(material);
        appendChange(new SideWalkAdded(entityId, wide, material)).apply();
    }

    public GeometryNameLocation geometryNameLocation() {
        return geometryNameLocation;
    }

    public Set<Lanes> lanes() {
        return lanes;
    }

    public Set<Sidewalk> sidewalks() {
        return sidewalk;
    }
}

