package com.SofkaU.DDDChallengue.model;

import co.com.sofka.domain.generic.Entity;
import com.SofkaU.DDDChallengue.model.values.TimeGreen;
import com.SofkaU.DDDChallengue.model.values.TimeRed;
import com.SofkaU.DDDChallengue.model.values.TrafficLightId;

public class TrafficLight extends Entity<TrafficLightId> {

    private TimeGreen timeGreen;
    private TimeRed timeRed;

    public TrafficLight(TrafficLightId entityId, TimeGreen timeGreen, TimeRed timeRed){
        super(entityId);
        this.timeGreen = timeGreen;
        this.timeRed = timeRed;
    }

    public void updateTimeGreen(TimeGreen timeGreen){
        this.timeGreen = timeGreen;
    }

    public void updateTimeRed(TimeRed timeRed){
        this.timeRed = timeRed;
    }


    public TimeGreen getTimeGreen() {
        return timeGreen;
    }

    public TimeRed getTimeRed() {
        return timeRed;
    }
}
