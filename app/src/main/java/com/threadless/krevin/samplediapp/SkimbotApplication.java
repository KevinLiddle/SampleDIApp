package com.threadless.krevin.samplediapp;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;

public class SkimbotApplication extends Application {
    protected ApplicationComponent mComponent;

    public ApplicationComponent component() {
        if (mComponent == null) {
            mComponent = DaggerSkimbotApplication_ApplicationComponent.builder().sampleModule(new SampleModule()).build();
        }
        return mComponent;
    }

    @Singleton
    @Component(modules = SampleModule.class)
    public interface ApplicationComponent {
        void inject(GreetingActivity activity);
    }
}
