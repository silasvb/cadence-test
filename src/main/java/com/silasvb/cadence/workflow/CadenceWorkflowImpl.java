package com.silasvb.cadence.workflow;

import com.silasvb.cadence.activity.CadenceActivity;
import com.uber.cadence.activity.ActivityOptions;
import com.uber.cadence.workflow.Workflow;

public class CadenceWorkflowImpl implements CadenceWorkflow {

    private final CadenceActivity cadenceActivity;

    public CadenceWorkflowImpl() {
        ActivityOptions options = new ActivityOptions.Builder().build();
        cadenceActivity = Workflow.newActivityStub(CadenceActivity.class, options);
    }

    @Override
    public void process(String id) {
        Object data = cadenceActivity.dataGenerationActivity(id);
        var result = cadenceActivity.logicalActivity(data);
    }
}
