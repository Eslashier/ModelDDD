package com.SofkaU.DDDChallengue.geometry.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.geometry.values.Material;
import com.SofkaU.DDDChallengue.geometry.values.SidewalkId;
import com.SofkaU.DDDChallengue.geometry.values.Wide;

public class AddSidewalk extends Command {

    private final SidewalkId sidewalkId;
    private final Wide wide;
    private final Material material;

    public AddSidewalk(SidewalkId sidewalkId, Wide wide, Material material) {
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
