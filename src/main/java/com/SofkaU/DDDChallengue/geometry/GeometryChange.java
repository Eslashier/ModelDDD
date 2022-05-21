package com.SofkaU.DDDChallengue.geometry;

import co.com.sofka.domain.generic.EventChange;
import com.SofkaU.DDDChallengue.geometry.events.GeometryCreated;
import com.SofkaU.DDDChallengue.geometry.events.LanesAdded;
import com.SofkaU.DDDChallengue.geometry.events.SideWalkAdded;

import java.util.HashSet;

public class GeometryChange extends EventChange {

    public GeometryChange(Geometry geometry){

        apply((GeometryCreated event)->{
            geometry.geometryNameLocation = event.getGeometryNameLocation();
            geometry.lanes = new HashSet<>();
            geometry.sidewalk = new HashSet<>();
        });

        apply((LanesAdded event)->{
            var numLanes = geometry.lanes.size();
            if(numLanes>1){
                throw new IllegalArgumentException("Cannot add mor than one lanes set");
            }
            geometry.lanes.add(new Lanes(
                    event.getLaneId(),
                    event.getNumberOfLanes(),
                    event.getLaneWide()
            ));
        });

        apply((SideWalkAdded event)->{
            var numSidewalks = geometry.lanes.size();
            if(numSidewalks>1){
                throw new IllegalArgumentException("Cannot add mor than one sidewalks set");
            }
            geometry.sidewalk.add(new Sidewalk(
                    event.getSidewalkId(),
                    event.getWide(),
                    event.getMaterial()
            ));
        });
    }
}
