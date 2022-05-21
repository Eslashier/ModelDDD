package com.SofkaU.DDDChallengue.geometry.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.geometry.values.GeometryId;
import com.SofkaU.DDDChallengue.geometry.values.SidewalkId;
import com.SofkaU.DDDChallengue.geometry.values.Wide;

public class UpdateSidewalkWide extends Command {

    private final GeometryId geometryId;
    private final SidewalkId sidewalkId;
    private final Wide wide;

    public UpdateSidewalkWide(GeometryId geometryId, SidewalkId sidewalkId, Wide wide) {
        this.geometryId = geometryId;
        this.sidewalkId = sidewalkId;
        this.wide = wide;
    }

    public GeometryId getGeometryId() {
        return geometryId;
    }

    public SidewalkId getSidewalkId() {
        return sidewalkId;
    }

    public Wide getWide() {
        return wide;
    }
}
