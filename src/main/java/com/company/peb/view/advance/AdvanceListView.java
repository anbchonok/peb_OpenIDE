package com.company.peb.view.advance;

import com.company.peb.entity.Advance;
import com.company.peb.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "advances", layout = MainView.class)
@ViewController(id = "Advance.list")
@ViewDescriptor(path = "advance-list-view.xml")
@LookupComponent("advancesDataGrid")
@DialogMode(width = "64em")
public class AdvanceListView extends StandardListView<Advance> {
}