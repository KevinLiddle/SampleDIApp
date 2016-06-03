package com.threadless.krevin.samplediapp;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;

public class SkimbotApplication extends Application {
    protected ApplicationComponent mComponent;
    private DaggerSkimbotApplication_ApplicationComponent.Builder mComponentBuilder;

    public ApplicationComponent component() {
        if (mComponent == null) {
            mComponent = getComponentBuilder().build();
        }
        return mComponent;
    }

    public DaggerSkimbotApplication_ApplicationComponent.Builder getComponentBuilder() {
        if (mComponentBuilder == null) {
            mComponentBuilder = DaggerSkimbotApplication_ApplicationComponent
                    .builder()
                    .sampleModule(new SampleModule())
                    .watModule(new WatModule("Jerry"));
        }
        return mComponentBuilder;
    }

    @Singleton
    @Component(modules = {SampleModule.class, WatModule.class})
    public interface ApplicationComponent {
        void inject(GreetingActivity activity);
    }
}
