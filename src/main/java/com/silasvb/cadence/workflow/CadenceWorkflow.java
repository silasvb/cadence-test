package com.silasvb.cadence.workflow;

import com.uber.cadence.workflow.WorkflowMethod;

public interface CadenceWorkflow {

    @WorkflowMethod
    void process(String id);

}
