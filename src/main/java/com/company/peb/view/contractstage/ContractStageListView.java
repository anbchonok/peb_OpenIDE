package com.company.peb.view.contractstage;

import com.company.peb.entity.ContractStage;
import com.company.peb.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "contract-stages", layout = MainView.class)
@ViewController(id = "ContractStage.list")
@ViewDescriptor(path = "contract-stage-list-view.xml")
@LookupComponent("contractStagesDataGrid")
@DialogMode(width = "64em")
public class ContractStageListView extends StandardListView<ContractStage> {
}