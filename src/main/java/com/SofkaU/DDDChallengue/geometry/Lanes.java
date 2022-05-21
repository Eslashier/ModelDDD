package com.SofkaU.DDDChallengue.geometry;

import co.com.sofka.domain.generic.Entity;
import com.SofkaU.DDDChallengue.geometry.values.LaneId;
import com.SofkaU.DDDChallengue.geometry.values.LaneWide;
import com.SofkaU.DDDChallengue.geometry.values.NumberOfLanes;

public class Lanes extends Entity<LaneId> {

    private NumberOfLanes numberOfLanes;
    private LaneWide laneWide;

    public Lanes(LaneId entityId, NumberOfLanes numberOfLanes, LaneWide laneWide){
        super(entityId);
        this.numberOfLanes = numberOfLanes;
        this.laneWide = laneWide;
    }

    public void updateNumberOfLanes(NumberOfLanes numberOfLanes){
        this.numberOfLanes =numberOfLanes;
    }

    public void updateLaneWide(LaneWide laneWide){
        this.laneWide = laneWide;
    }

    public NumberOfLanes numberOfLanes() {
        return numberOfLanes;
    }

    public LaneWide laneWide() {
        return laneWide;
    }

}
