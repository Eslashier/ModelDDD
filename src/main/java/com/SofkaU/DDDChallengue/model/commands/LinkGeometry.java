package com.SofkaU.DDDChallengue.model.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.geometry.values.GeometryId;
import com.SofkaU.DDDChallengue.model.values.ModelId;

public class LinkGeometry extends Command {

    private final ModelId modelId;
    private final GeometryId geometryId;

    public LinkGeometry(ModelId modelId, GeometryId geometryId) {
        this.modelId = modelId;
        this.geometryId = geometryId;
    }

    public ModelId getModelId() {
        return modelId;
    }

    public GeometryId getGeometryId() {
        return geometryId;
    }
}
