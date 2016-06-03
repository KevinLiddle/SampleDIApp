package com.threadless.krevin.samplediapp;

import com.threadless.krevin.conversations.AskAboutTheirDay;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class WatModule {

    private final String name;

    public WatModule(String name) {
        this.name = name;
    }

    @Provides
    @Singleton
    public AskAboutTheirDay provideAskAboutTheirDay() {
        return new AskAboutTheirDay(name);
    }}
