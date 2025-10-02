package com.company.peb.view.advance;

import com.company.peb.entity.Advance;
import com.company.peb.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "advances/:id", layout = MainView.class)
@ViewController(id = "Advance.detail")
@ViewDescriptor(path = "advance-detail-view.xml")
@EditedEntityContainer("advanceDc")
public class AdvanceDetailView extends StandardDetailView<Advance> {
}