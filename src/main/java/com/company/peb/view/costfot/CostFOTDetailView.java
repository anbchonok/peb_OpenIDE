package com.company.peb.view.costfot;

import com.company.peb.entity.CostFOT;
import com.company.peb.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "cost-fots/:id", layout = MainView.class)
@ViewController(id = "CostFOT.detail")
@ViewDescriptor(path = "cost-fot-detail-view.xml")
@EditedEntityContainer("costFOTDc")
public class CostFOTDetailView extends StandardDetailView<CostFOT> {
}