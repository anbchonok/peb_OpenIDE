package com.company.peb.view.contractstage;

import com.company.peb.entity.ContractStage;
import com.company.peb.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "contract-stages/:id", layout = MainView.class)
@ViewController(id = "ContractStage.detail")
@ViewDescriptor(path = "contract-stage-detail-view.xml")
@EditedEntityContainer("contractStageDc")
public class ContractStageDetailView extends StandardDetailView<ContractStage> {
}