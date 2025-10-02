package com.company.peb.view.location;

import com.company.peb.entity.Location;
import com.company.peb.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "locations/:id", layout = MainView.class)
@ViewController(id = "Location.detail")
@ViewDescriptor(path = "location-detail-view.xml")
@EditedEntityContainer("locationDc")
public class LocationDetailView extends StandardDetailView<Location> {
}