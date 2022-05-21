package com.SofkaU.DDDChallengue.geometry.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.geometry.values.GeometryId;
import com.SofkaU.DDDChallengue.geometry.values.Material;
import com.SofkaU.DDDChallengue.geometry.values.SidewalkId;

public class UpdateSidewalkMaterial extends Command {

    private final GeometryId geometryId;
    private final SidewalkId sidewalkId;
    private final Material material;

    public UpdateSidewalkMaterial(GeometryId geometryId, SidewalkId sidewalkId, Material material) {
        this.geometryId = geometryId;
        this.sidewalkId = sidewalkId;
        this.material = material;
    }

    public GeometryId getGeometryId() {
        return geometryId;
    }

    public SidewalkId getSidewalkId() {
        return sidewalkId;
    }

    public Material material() {
        return material;
    }
}
