package com.threadless.krevin.samplediapp;

import com.threadless.krevin.conversations.AskAboutTheirDay;
import com.threadless.krevin.conversations.Greeting;
import com.threadless.krevin.conversations.Howdy;

import dagger.Module;
import dagger.Provides;

@Module( injects = GreetingActivity.class, library=true )
public class SampleModule {
    @Provides
    public Greeting provideGreeting() {
        return new Howdy();
    }

    @Provides
    public AskAboutTheirDay provideAskAboutTheirDay() {
        return new AskAboutTheirDay();
    }
}
