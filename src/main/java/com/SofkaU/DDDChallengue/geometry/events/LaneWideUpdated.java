package com.SofkaU.DDDChallengue.geometry.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.geometry.values.LaneId;
import com.SofkaU.DDDChallengue.geometry.values.LaneWide;
import com.SofkaU.DDDChallengue.geometry.values.NumberOfLanes;

public class LaneWideUpdated extends DomainEvent {

    private final LaneId laneId;
    private final LaneWide laneWide;

    public LaneWideUpdated(LaneId laneId, LaneWide laneWide){
        super("challenge.geometry.lanewideupdated");
        this.laneId = laneId;
        this.laneWide = laneWide;
    }

    public LaneId getLaneId() {
        return laneId;
    }

    public LaneWide getLaneWide() {
        return laneWide;
    }
}
