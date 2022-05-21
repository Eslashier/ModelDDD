package com.SofkaU.DDDChallengue.geometry;

import co.com.sofka.domain.generic.AggregateEvent;
import com.SofkaU.DDDChallengue.geometry.commands.AddLanes;
import com.SofkaU.DDDChallengue.geometry.events.GeometryCreated;
import com.SofkaU.DDDChallengue.geometry.events.LanesAdded;
import com.SofkaU.DDDChallengue.geometry.events.SideWalkAdded;
import com.SofkaU.DDDChallengue.geometry.values.*;
import com.SofkaU.DDDChallengue.traffic.values.TimeOfData;

import java.util.Objects;

public class Geometry extends AggregateEvent<GeometryId> {

    protected GeometryNameLocation geometryNameLocation;
    protected GeometryId geometryId;
    protected SidewalkId sidewalkId;

    public Geometry(GeometryId entityId, GeometryNameLocation geometryNameLocation){
        super(entityId);
        appendChange(new GeometryCreated(geometryNameLocation)).apply();
    }

    public void addLanes(LaneId entityId, LaneWide laneWide, NumberOfLanes numberOfLanes){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(laneWide);
        Objects.requireNonNull(numberOfLanes);
        appendChange(new LanesAdded(entityId, laneWide,numberOfLanes)).apply();
    }
    public void addSidewalk(SidewalkId entityId, Wide wide, Material material){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(wide);
        Objects.requireNonNull(material);
        appendChange(new SideWalkAdded(entityId, wide, material)).apply();
    }
    public GeometryNameLocation geometryNameLocation() {
        return geometryNameLocation;
    }

    public GeometryId geometryId() {
        return geometryId;
    }

    public SidewalkId sidewalkId() {
        return sidewalkId;
    }
}
