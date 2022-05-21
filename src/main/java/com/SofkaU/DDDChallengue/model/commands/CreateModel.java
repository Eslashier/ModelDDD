package com.SofkaU.DDDChallengue.model.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.DDDChallengue.model.values.DateOfModel;
import com.SofkaU.DDDChallengue.model.values.ModelId;
import com.SofkaU.DDDChallengue.model.values.NameOfModel;

public class CreateModel extends Command {
    private final ModelId modelId;
    private final NameOfModel nameOfModel;
    private final DateOfModel dateOfModel;

    public CreateModel(ModelId modelId, NameOfModel nameOfModel, DateOfModel dateOfModel) {
        this.modelId = modelId;
        this.nameOfModel = nameOfModel;
        this.dateOfModel = dateOfModel;
    }

    public ModelId getModelId() {
        return modelId;
    }

    public NameOfModel getNameOfModel() {
        return nameOfModel;
    }

    public DateOfModel getDateOfModel() {
        return dateOfModel;
    }
}
