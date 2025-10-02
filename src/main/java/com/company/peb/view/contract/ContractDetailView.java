package com.company.peb.view.contract;

import com.company.peb.entity.Contract;
import com.company.peb.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "contracts/:id", layout = MainView.class)
@ViewController(id = "Contract.detail")
@ViewDescriptor(path = "contract-detail-view.xml")
@EditedEntityContainer("contractDc")
public class ContractDetailView extends StandardDetailView<Contract> {
}