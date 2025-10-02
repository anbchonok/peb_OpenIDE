package com.company.peb.view.application;

import com.company.peb.entity.Application;
import com.company.peb.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "applications/:id", layout = MainView.class)
@ViewController(id = "Application.detail")
@ViewDescriptor(path = "application-detail-view.xml")
@EditedEntityContainer("applicationDc")
public class ApplicationDetailView extends StandardDetailView<Application> {
}