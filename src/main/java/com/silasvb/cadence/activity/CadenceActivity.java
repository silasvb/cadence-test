package com.silasvb.cadence.activity;

import com.uber.cadence.activity.ActivityMethod;

public interface CadenceActivity {

    // Cadence activity which takes rich set of input data, performs
    // operations on this dataset and returns the truthiness of a
    // concept
    @ActivityMethod
    Boolean logicalActivity(Object inputData);

    // Data generation activity, which takes an ID and returns a dataset
    // associated with said ID
    @ActivityMethod
    Object dataGenerationActivity(String inputId);

}
