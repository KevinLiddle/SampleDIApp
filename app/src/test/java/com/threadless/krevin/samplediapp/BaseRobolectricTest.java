package com.threadless.krevin.samplediapp;

import org.robolectric.RuntimeEnvironment;

public class BaseRobolectricTest {
    public SkimbotApplication getApplication() {
        return (SkimbotApplication) RuntimeEnvironment.application;
    }
}
