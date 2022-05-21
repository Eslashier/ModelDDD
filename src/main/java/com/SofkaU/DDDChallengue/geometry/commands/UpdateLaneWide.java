package com.SofkaU.DDDChallengue.geometry.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.geometry.values.*;

public class UpdateLaneWide extends Command {

    private final GeometryId geometryId;
    private final LaneId laneId;
    private final LaneWide laneWide;

    public UpdateLaneWide(GeometryId geometryId, LaneId laneId, LaneWide laneWide) {
        this.geometryId = geometryId;
        this.laneId = laneId;
        this.laneWide = laneWide;
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
}
