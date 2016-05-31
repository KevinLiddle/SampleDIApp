package com.threadless.krevin.samplediapp;

import android.app.Application;

import dagger.ObjectGraph;

public class SkimbotApplication extends Application {
    private ObjectGraph mGraph;

    @Override
    public void onCreate() {
        super.onCreate();
        getObjectGraph();
    }

    protected ObjectGraph buildObjectGraph() {
        return ObjectGraph.create(new SampleModule());
    }

    public void inject(Object object) {
        mGraph.inject(object);
    }

    protected ObjectGraph getObjectGraph() {
        if (mGraph == null) {
            mGraph = buildObjectGraph();
        }
        return mGraph;
    }

}
