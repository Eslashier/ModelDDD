package com.SofkaU.DDDChallengue.geometry.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.geometry.Sidewalk;
import com.SofkaU.DDDChallengue.geometry.values.Material;
import com.SofkaU.DDDChallengue.geometry.values.SidewalkId;
import com.SofkaU.DDDChallengue.geometry.values.Wide;

public class SideWalkAdded extends DomainEvent {
    private final SidewalkId sidewalkId;
    private final Wide wide;
    private final Material material;

    public SideWalkAdded(SidewalkId sidewalkId, Wide wide, Material material){
        super("challenge.geometry.lanesadded");
        this.sidewalkId = sidewalkId;
        this.wide = wide;
        this.material = material;
    }

    public SidewalkId getSidewalkId() {
        return sidewalkId;
    }

    public Wide getWide() {
        return wide;
    }

    public Material getMaterial() {
        return material;
    }
}
