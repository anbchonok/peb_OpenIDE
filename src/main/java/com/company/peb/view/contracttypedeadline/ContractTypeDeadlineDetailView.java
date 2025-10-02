package com.company.peb.view.contracttypedeadline;

import com.company.peb.entity.ContractTypeDeadline;
import com.company.peb.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "contract-type-deadlines/:id", layout = MainView.class)
@ViewController(id = "ContractTypeDeadline.detail")
@ViewDescriptor(path = "contract-type-deadline-detail-view.xml")
@EditedEntityContainer("contractTypeDeadlineDc")
public class ContractTypeDeadlineDetailView extends StandardDetailView<ContractTypeDeadline> {
}