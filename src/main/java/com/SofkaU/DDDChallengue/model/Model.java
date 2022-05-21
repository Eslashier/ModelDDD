package com.SofkaU.DDDChallengue.model;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.DDDChallengue.geometry.values.GeometryId;
import com.SofkaU.DDDChallengue.model.events.*;
import com.SofkaU.DDDChallengue.model.values.*;
import com.SofkaU.DDDChallengue.traffic.values.TrafficId;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Model extends AggregateEvent<ModelId> {
    protected NameOfModel nameOfModel;
    protected DateOfModel dateOfModel;
    protected Set<TrafficLight> trafficLights;
    protected Set<VerticalSignal> verticalSignals;

    protected TrafficId trafficId;
    protected GeometryId geometryId;

    public Model(ModelId entityId, NameOfModel nameOfModel, DateOfModel dateOfModel){
        super(entityId);
        appendChange(new ModelCreated(nameOfModel, dateOfModel)).apply();
    }

    private Model(ModelId entityId){
        super(entityId);
        subscribe(new ModelChange(this));
    }

    public static Model from(ModelId modelId, List<DomainEvent> events){
        var model = new Model(modelId);
        events.forEach(model::applyEvent);
        return model;
    }
    public void addTrafficLight(TrafficLightId entityId, TimeGreen timeGreen, TimeRed timeRed){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(timeGreen);
        Objects.requireNonNull(timeRed);
        appendChange(new TrafficLightAdded(entityId, timeGreen, timeRed)).apply();
    }

    public void addVerticalSignals(VerticalSignalId entityId, SignalGroup signalGroup, SignalName signalName){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(signalGroup);
        Objects.requireNonNull(signalName);
        appendChange(new VerticalSignalAdded(entityId, signalGroup, signalName)).apply();
    }

    protected Optional<TrafficLight> getTrafficLightById(final TrafficLightId trafficLightId){
        return trafficLights()
                .stream()
                .filter(light -> light.identity().equals(trafficLightId))
                .findFirst();
    }

    protected Optional<VerticalSignal> getVerticalSignalById(final VerticalSignalId verticalSignalId){
        return verticalSignals()
                .stream()
                .filter(signal -> signal.identity().equals(verticalSignalId))
                .findFirst();
    }
    public void  updateNameOfModel(NameOfModel nameOfModel){
        Objects.requireNonNull(nameOfModel);
        appendChange(new NameOfModelUpdated(nameOfModel)).apply();
    }
    public void  updateDateOfModel(DateOfModel dateOfModel){
        Objects.requireNonNull(dateOfModel);
        appendChange(new DateOfModelUpdated(dateOfModel)).apply();
    }

    public void updateTrafficLightTimeGreen(TrafficLightId trafficLightId, TimeGreen timeGreen){
        Objects.requireNonNull(trafficLightId);
        Objects.requireNonNull(timeGreen);
        appendChange(new TrafficLightTimeGreenUpdated(trafficLightId, timeGreen)).apply();
    }

    public void updateTrafficLightTimeRed(TrafficLightId trafficLightId, TimeRed timeRed){
        Objects.requireNonNull(trafficLightId);
        Objects.requireNonNull(timeRed);
        appendChange(new TrafficLightTimeRedUpdated(trafficLightId, timeRed)).apply();
    }

    public void updateVerticalSignalGroup(VerticalSignalId verticalSignalId, SignalGroup signalGroup){
        Objects.requireNonNull(verticalSignalId);
        Objects.requireNonNull(signalGroup);
        appendChange(new VerticalSignalGroupUpdated(verticalSignalId, signalGroup)).apply();
    }

    public void updateVerticalSignalName(VerticalSignalId verticalSignalId, SignalName signalName){
        Objects.requireNonNull(verticalSignalId);
        Objects.requireNonNull(signalName);
        appendChange(new VerticalSignalNameUpdated(verticalSignalId, signalName)).apply();
    }

    public void geometryLinked(GeometryId geometryId){
        appendChange(new GeometryLinked(geometryId)).apply();
    }

    public void trafficLinked(TrafficId trafficId){
        appendChange(new TrafficLinked(trafficId)).apply();
    }

    public NameOfModel nameOfModel() {
        return nameOfModel;
    }

    public DateOfModel dateOfModel() {
        return dateOfModel;
    }

    public Set<TrafficLight> trafficLights() {
        return trafficLights;
    }

    public Set<VerticalSignal> verticalSignals() {
        return verticalSignals;
    }

    public TrafficId getTrafficId() {
        return trafficId;
    }

    public GeometryId getGeometryId() {
        return geometryId;
    }

    public void notifyGeometryDepartment(String message){
        Objects.requireNonNull(message);
        appendChange(new GeometryNotification(message)).apply();
    }

    public void notifyTrafficDepartment(String message){
        Objects.requireNonNull(message);
        appendChange(new TrafficNotification(message)).apply();
    }
}
