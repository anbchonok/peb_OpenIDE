package com.company.peb.view.application;

import com.company.peb.entity.Application;
import com.company.peb.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "applications", layout = MainView.class)
@ViewController(id = "Application.list")
@ViewDescriptor(path = "application-list-view.xml")
@LookupComponent("applicationsDataGrid")
@DialogMode(width = "64em")
public class ApplicationListView extends StandardListView<Application> {
}