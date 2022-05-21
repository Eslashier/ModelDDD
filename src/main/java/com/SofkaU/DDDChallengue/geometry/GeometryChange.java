package com.SofkaU.DDDChallengue.geometry;

import co.com.sofka.domain.generic.EventChange;
import com.SofkaU.DDDChallengue.geometry.events.*;

import java.util.HashSet;

public class GeometryChange extends EventChange {

    public GeometryChange(Geometry geometry){

        apply((GeometryCreated event)->{
            geometry.geometryNameLocation = event.getGeometryNameLocation();
            geometry.lanes = new HashSet<>();
            geometry.sidewalks = new HashSet<>();
        });

        apply((LanesAdded event)->{
            var numLanes = geometry.lanes.size();
            if(numLanes>1){
                throw new IllegalArgumentException("Cannot add more than one lanes set");
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
                throw new IllegalArgumentException("Cannot add more than one sidewalks set");
            }
            geometry.sidewalks.add(new Sidewalk(
                    event.getSidewalkId(),
                    event.getWide(),
                    event.getMaterial()
            ));
        });

        apply((GeometryNameLocationUpdated event)->{
            geometry.geometryNameLocation = event.getGeometryNameLocation();
        });

        apply((LanesNumberUpdated event)->{
            var lanes = geometry.getLanesById(event.getLaneId())
                    .orElseThrow(()->new IllegalArgumentException("Set of lanes not found"));
            lanes.updateNumberOfLanes(event.getNumberOfLanes());
        });

        apply((LaneWideUpdated event)->{
            var lanes = geometry.getLanesById(event.getLaneId())
                    .orElseThrow(()->new IllegalArgumentException("Set of lanes not found"));
            lanes.updateLaneWide(event.getLaneWide());
        });

        apply((SidewalkMaterialUpdated event)->{
            var sidewalk = geometry.getSidewalkById(event.getSidewalkId())
                    .orElseThrow(()->new IllegalArgumentException("Set of sidewalks not found"));
            sidewalk.updateMaterial(event.getMaterial());
        });

        apply((SidewalkWideUpdated event)->{
            var sidewalk = geometry.getSidewalkById(event.getSidewalkId())
                    .orElseThrow(()->new IllegalArgumentException("Set of sidewalks not found"));
            sidewalk.updateWide(event.getWide());
        });

    }
}
