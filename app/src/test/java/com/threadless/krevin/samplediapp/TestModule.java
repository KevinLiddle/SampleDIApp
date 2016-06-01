package com.threadless.krevin.samplediapp;

import com.threadless.krevin.conversations.AskAboutTheirDay;
import com.threadless.krevin.conversations.Greeting;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@Module
public class TestModule {
    @Provides
    @Singleton
    public Greeting provideGreeting() {
        Greeting mock = mock(Greeting.class);
        when(mock.formulate()).thenReturn("sheisse");
        return mock;
    }

    @Provides
    public AskAboutTheirDay provideAskAboutTheirDay() {
        return mock(AskAboutTheirDay.class);
    }
}
