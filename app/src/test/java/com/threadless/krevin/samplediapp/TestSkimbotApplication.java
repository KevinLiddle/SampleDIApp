package com.threadless.krevin.samplediapp;

import dagger.ObjectGraph;

public class TestSkimbotApplication extends SkimbotApplication {
    @Override
    public ObjectGraph buildObjectGraph() {
        return ObjectGraph.create(new TestModule());
    }
}
