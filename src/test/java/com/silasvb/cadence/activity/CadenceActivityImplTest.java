package com.silasvb.cadence.activity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CadenceActivityImplTest {

    @Test
    void logicalActivityTest() {
        CadenceActivity codeUnderTest = new CadenceActivityImpl();
        assertTrue(codeUnderTest.logicalActivity(null));
    }

    @Test
    void dataGenerationActivityTest() {
        CadenceActivity codeUnderTest = new CadenceActivityImpl();
        assertNotNull(codeUnderTest.dataGenerationActivity(""));
    }

}
