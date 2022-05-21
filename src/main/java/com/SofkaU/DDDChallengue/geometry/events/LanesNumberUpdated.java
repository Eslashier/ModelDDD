package com.SofkaU.DDDChallengue.geometry.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.geometry.values.LaneId;
import com.SofkaU.DDDChallengue.geometry.values.NumberOfLanes;

public class LanesNumberUpdated extends DomainEvent {
    private final LaneId laneId;
    private final NumberOfLanes numberOfLanes;

    public LanesNumberUpdated(LaneId laneId, NumberOfLanes numberOfLanes){
        super("challenge.geometry.lanesnumberupdated");
        this.laneId = laneId;
        this.numberOfLanes = numberOfLanes;
    }

    public LaneId getLaneId() {
        return laneId;
    }

    public NumberOfLanes getNumberOfLanes() {
        return numberOfLanes;
    }
}
