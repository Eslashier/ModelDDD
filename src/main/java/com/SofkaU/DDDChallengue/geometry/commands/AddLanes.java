package com.SofkaU.DDDChallengue.geometry.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.geometry.Geometry;
import com.SofkaU.DDDChallengue.geometry.values.GeometryId;
import com.SofkaU.DDDChallengue.geometry.values.LaneId;
import com.SofkaU.DDDChallengue.geometry.values.LaneWide;
import com.SofkaU.DDDChallengue.geometry.values.NumberOfLanes;

public class AddLanes extends Command {

    private final GeometryId geometryId;
    private final LaneId laneId;
    private final LaneWide laneWide;
    private final NumberOfLanes numberOfLanes;

    public AddLanes(GeometryId geometryId, LaneId laneId, LaneWide laneWide, NumberOfLanes numberOfLanes) {
        this.geometryId = geometryId;
        this.laneId = laneId;
        this.laneWide = laneWide;
        this.numberOfLanes = numberOfLanes;
    }

    public GeometryId getGeometryId() {
        return geometryId;
    }

    public LaneId getLaneId() {
        return laneId;
    }

    public LaneWide getLaneWide() {
        return laneWide;
    }

    public NumberOfLanes getNumberOfLanes() {
        return numberOfLanes;
    }
}
