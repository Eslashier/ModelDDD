package com.SofkaU.DDDChallengue.geometry.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.geometry.values.Material;
import com.SofkaU.DDDChallengue.geometry.values.SidewalkId;
import com.SofkaU.DDDChallengue.geometry.values.Wide;

public class SidewalkWideUpdated extends DomainEvent {

    private final SidewalkId sidewalkId;
    private final Wide wide;

    public SidewalkWideUpdated(SidewalkId sidewalkId, Wide wide){
        super("challenge.geometry.sidewalkwideupdated");
        this.sidewalkId = sidewalkId;
        this.wide = wide;
    }

    public SidewalkId getSidewalkId() {
        return sidewalkId;
    }

    public Wide getWide() {
        return wide;
    }
}
