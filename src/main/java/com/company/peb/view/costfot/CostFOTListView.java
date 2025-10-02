package com.company.peb.view.costfot;

import com.company.peb.entity.CostFOT;
import com.company.peb.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "cost-fots", layout = MainView.class)
@ViewController(id = "CostFOT.list")
@ViewDescriptor(path = "cost-fot-list-view.xml")
@LookupComponent("costFOTsDataGrid")
@DialogMode(width = "64em")
public class CostFOTListView extends StandardListView<CostFOT> {
}