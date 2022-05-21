package com.SofkaU.DDDChallengue.geometry.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.geometry.values.Material;
import com.SofkaU.DDDChallengue.geometry.values.SidewalkId;
import com.SofkaU.DDDChallengue.geometry.values.Wide;

public class SidewalkMaterialUpdated extends DomainEvent {

    private final SidewalkId sidewalkId;
    private final Material material;

    public SidewalkMaterialUpdated(SidewalkId sidewalkId, Material material){
        super("challenge.geometry.sidewalkmaterialupdated");
        this.sidewalkId = sidewalkId;
        this.material = material;
    }

    public SidewalkId getSidewalkId() {
        return sidewalkId;
    }

    public Material getMaterial() {
        return material;
    }
}
