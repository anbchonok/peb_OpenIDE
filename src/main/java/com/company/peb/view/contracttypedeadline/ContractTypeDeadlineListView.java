package com.company.peb.view.contracttypedeadline;

import com.company.peb.entity.ContractTypeDeadline;
import com.company.peb.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "contract-type-deadlines", layout = MainView.class)
@ViewController(id = "ContractTypeDeadline.list")
@ViewDescriptor(path = "contract-type-deadline-list-view.xml")
@LookupComponent("contractTypeDeadlinesDataGrid")
@DialogMode(width = "64em")
public class ContractTypeDeadlineListView extends StandardListView<ContractTypeDeadline> {
}