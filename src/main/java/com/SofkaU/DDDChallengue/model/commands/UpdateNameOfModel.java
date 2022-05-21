package com.SofkaU.DDDChallengue.model.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.model.values.DateOfModel;
import com.SofkaU.DDDChallengue.model.values.ModelId;

public class UpdateNameOfModel extends Command {
    private final ModelId modelId;
    private final DateOfModel dateOfModel;

    public UpdateNameOfModel(ModelId modelId, DateOfModel dateOfModel) {
        this.modelId = modelId;
        this.dateOfModel = dateOfModel;
    }

    public ModelId getModelId() {
        return modelId;
    }

    public DateOfModel getDateOfModel() {
        return dateOfModel;
    }
}
