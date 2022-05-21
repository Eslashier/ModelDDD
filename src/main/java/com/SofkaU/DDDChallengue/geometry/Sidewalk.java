package com.SofkaU.DDDChallengue.geometry;

import co.com.sofka.domain.generic.Entity;
import com.SofkaU.DDDChallengue.geometry.values.Material;
import com.SofkaU.DDDChallengue.geometry.values.SidewalkId;
import com.SofkaU.DDDChallengue.geometry.values.Wide;

public class Sidewalk extends Entity<SidewalkId> {
    private Wide wide;
    private Material material;

    public Sidewalk(SidewalkId entityId, Wide wide, Material material){
        super(entityId);
        this.wide = wide;
        this.material = material;
    }

    public void updateWide(Wide wide){
        this.wide = wide;
    }

    public void updateMaterial(Material material){
        this.material = material;
    }

    public Wide wide() {
        return wide;
    }

    public Material material() {
        return material;
    }
}
