package com.company.peb.view.contract;

import com.company.peb.entity.Contract;
import com.company.peb.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "contracts", layout = MainView.class)
@ViewController(id = "Contract.list")
@ViewDescriptor(path = "contract-list-view.xml")
@LookupComponent("contractsDataGrid")
@DialogMode(width = "64em")
public class ContractListView extends StandardListView<Contract> {
}