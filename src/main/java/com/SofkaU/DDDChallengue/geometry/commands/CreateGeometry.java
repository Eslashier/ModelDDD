package com.SofkaU.DDDChallengue.geometry.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.geometry.values.GeometryId;
import com.SofkaU.DDDChallengue.geometry.values.GeometryNameLocation;

public class CreateGeometry extends Command {
    private final GeometryId geometryId;
    private final GeometryNameLocation geometryNameLocation;

    public CreateGeometry(GeometryId geometryId, GeometryNameLocation geometryNameLocation) {
        this.geometryId = geometryId;
        this.geometryNameLocation = geometryNameLocation;
    }

    public GeometryId getGeometryId() {
        return geometryId;
    }

    public GeometryNameLocation getGeometryNameLocation() {
        return geometryNameLocation;
    }
}
