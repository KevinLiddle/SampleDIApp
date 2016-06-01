package com.threadless.krevin.samplediapp;

import javax.inject.Singleton;

import dagger.Component;

public class TestSkimbotApplication extends SkimbotApplication {
    private TestApplicationComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mComponent = DaggerTestSkimbotApplication_TestApplicationComponent.builder().testModule(new TestModule()).build();
    }

    @Override
    public ApplicationComponent component() {
        return mComponent;
    }

    @Singleton
    @Component(modules = TestModule.class)
    public interface TestApplicationComponent extends ApplicationComponent {
        void inject(GreetingActivity activity);
    }
}
