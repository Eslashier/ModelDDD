package com.SofkaU.DDDChallengue.geometry.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.geometry.values.LaneId;
import com.SofkaU.DDDChallengue.geometry.values.LaneWide;
import com.SofkaU.DDDChallengue.geometry.values.NumberOfLanes;

public class LanesAdded extends DomainEvent {

    private final LaneId laneId;
    private final LaneWide laneWide;
    private final NumberOfLanes numberOfLanes;

    public LanesAdded(LaneId laneId, LaneWide laneWide, NumberOfLanes numberOfLanes){
        super("challenge.geometry.lanesadded");
        this.laneId = laneId;
        this.laneWide = laneWide;
        this.numberOfLanes = numberOfLanes;
    }

    public LaneId getLaneId() {
        return laneId;
    }

    public LaneWide getLaneWide() {
        return laneWide;
    }

    public NumberOfLanes getNumberOfLanes() {
        return numberOfLanes;
    }
}
