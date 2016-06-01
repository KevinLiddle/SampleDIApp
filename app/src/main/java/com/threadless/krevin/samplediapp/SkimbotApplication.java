package com.threadless.krevin.samplediapp;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;

public class SkimbotApplication extends Application {
    private ApplicationComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mComponent = DaggerSkimbotApplication_ApplicationComponent.builder().sampleModule(new SampleModule()).build();
    }

    public ApplicationComponent component() {
        return mComponent;
    }

    @Singleton
    @Component(modules = SampleModule.class)
    public interface ApplicationComponent {
        void inject(GreetingActivity activity);
    }
}
