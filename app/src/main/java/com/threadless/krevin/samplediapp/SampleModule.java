package com.threadless.krevin.samplediapp;

import com.threadless.krevin.conversations.Greeting;
import com.threadless.krevin.conversations.Howdy;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SampleModule {
    @Provides
    @Singleton
    public Greeting provideGreeting() {
        return new Howdy();
    }
}
