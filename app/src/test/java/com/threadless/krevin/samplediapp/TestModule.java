package com.threadless.krevin.samplediapp;

import com.threadless.krevin.conversations.AskAboutTheirDay;
import com.threadless.krevin.conversations.Greeting;

import dagger.Module;
import dagger.Provides;

import static org.mockito.Mockito.mock;

@Module(
        injects = GreetingActivityTest.class,
        library = true,
        overrides = true
)
public class TestModule {
    @Provides
    public Greeting provideGreeting() {
        return mock(Greeting.class);
    }

    @Provides
    public AskAboutTheirDay provideAskAboutTheirDay() {
        return mock(AskAboutTheirDay.class);
    }
}
