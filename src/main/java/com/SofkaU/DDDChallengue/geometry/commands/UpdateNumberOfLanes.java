package com.SofkaU.DDDChallengue.geometry.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.geometry.values.GeometryId;
import com.SofkaU.DDDChallengue.geometry.values.LaneId;
import com.SofkaU.DDDChallengue.geometry.values.NumberOfLanes;

public class UpdateNumberOfLanes extends Command {

    private final GeometryId geometryId;
    private final LaneId laneId;
    private final NumberOfLanes numberOfLanes;

    public UpdateNumberOfLanes(GeometryId geometryId, LaneId laneId, NumberOfLanes numberOfLanes) {
        this.geometryId = geometryId;
        this.laneId = laneId;
        this.numberOfLanes = numberOfLanes;
    }

    public GeometryId getGeometryId() {
        return geometryId;
    }

    public LaneId getLaneId() {
        return laneId;
    }

    public NumberOfLanes getNumberOfLanes() {
        return numberOfLanes;
    }
}
