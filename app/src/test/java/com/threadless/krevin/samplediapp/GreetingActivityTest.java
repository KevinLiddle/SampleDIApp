package com.threadless.krevin.samplediapp;

import android.widget.TextView;

import com.threadless.krevin.conversations.Greeting;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class GreetingActivityTest {

    private Greeting mGreeting;

    @Before
    public void setUp() {
        TestSkimbotApplication application = (TestSkimbotApplication) RuntimeEnvironment.application;
//        mGreeting = application.getObjectGraph().get(GreetingActivity.class).mGreeting;
    }

    @Test
    public void onCreateFormulatesAGreeting() {
//        when(mGreeting.formulate()).thenReturn("What did you say to me?");

        GreetingActivity activity = Robolectric.buildActivity(GreetingActivity.class).create().get();
        TextView view = (TextView) activity.findViewById(R.id.greeting_text);

        assertThat(view.getText().toString(), is(equalTo("What did you say to me?")));
    }

    @Test
    public void wat() {
//        when(mGreeting.formulate()).thenReturn("nothing");

        GreetingActivity activity = Robolectric.buildActivity(GreetingActivity.class).create().get();
        TextView view = (TextView) activity.findViewById(R.id.greeting_text);

        assertThat(view.getText().toString(), is(equalTo("nothing")));
    }
}
