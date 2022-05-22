package com.SofkaU.DDDChallengue;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import com.SofkaU.DDDChallengue.model.events.ModelCreated;
import com.SofkaU.DDDChallengue.model.events.TrafficNotification;
import com.SofkaU.DDDChallengue.model.values.DateOfModel;
import com.SofkaU.DDDChallengue.model.values.NameOfModel;
import com.SofkaU.DDDChallengue.useCase.NotifyTrafficDepartmentUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class NotifyTrafficDepartmentUseCaseTest {
    private final String ROOTID="model1";

    @Mock
    private DomainEventRepository repository;

    @Test
    void notifyGeometryDepartment(){
        var event = new ModelCreated(
                new NameOfModel("My third model"),
                new DateOfModel("2022-05-21")
        );
        event.setAggregateRootId(ROOTID);

        var useCase = new NotifyTrafficDepartmentUseCase();

        Mockito.when(repository.getEventsBy(ROOTID)).thenReturn(List.of(
                event
        ));

        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(ROOTID)
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow()
                .getDomainEvents();

        var message=(TrafficNotification)events.get(0);
        Assertions.assertEquals("The model has been created",message.getMessage());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}
