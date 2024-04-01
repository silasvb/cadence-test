package com.silasvb.cadence.activity;

class CadenceActivityImpl implements CadenceActivity {
    @Override
    public Boolean logicalActivity(Object inputData) {
        return true;
    }

    @Override
    public Object dataGenerationActivity(String inputId) {
        return new Object();
    }
}
