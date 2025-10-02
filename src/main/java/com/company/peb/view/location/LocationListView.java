package com.company.peb.view.location;

import com.company.peb.entity.Location;
import com.company.peb.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "locations", layout = MainView.class)
@ViewController(id = "Location.list")
@ViewDescriptor(path = "location-list-view.xml")
@LookupComponent("locationsDataGrid")
@DialogMode(width = "64em")
public class LocationListView extends StandardListView<Location> {
}