package com.threadless.krevin.samplediapp;

import org.robolectric.TestLifecycleApplication;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestSkimbotApplication extends SkimbotApplication implements TestLifecycleApplication {
    private SampleModule mModuleOverride;

    @Override
    public ApplicationComponent component() {
        if (mComponent == null) {
            mComponent = DaggerSkimbotApplication_ApplicationComponent.builder().sampleModule(getModule()).build();
        }
        return mComponent;
    }

    @Override
    public void beforeTest(Method method) {
    }

    @Override
    public void prepareTest(Object test) {
        for (Field f : test.getClass().getDeclaredFields()) {
            if (f.isAnnotationPresent(ModuleOverride.class)) {
                try {
                    mModuleOverride = (SampleModule) f.get(test);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public void afterTest(Method method) {
    }

    private SampleModule getModule() {
        if (mModuleOverride == null) {
            return new SampleModule();
        }

        return mModuleOverride;
    }
}
