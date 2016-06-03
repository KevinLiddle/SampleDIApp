package com.threadless.krevin.samplediapp;

import android.widget.TextView;

import com.threadless.krevin.conversations.Greeting;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class GreetingActivityTest extends BaseRobolectricTest {

    private ActivityController<GreetingActivity> activityController;
    private Greeting greeting;

    @Before
    public void setUp() {
        greeting = mock(Greeting.class);
        SampleModule sampleModule = new SampleModule() {
            @Override
            public Greeting provideGreeting() {
                return greeting;
            }
        };
        getApplication().getComponentBuilder().sampleModule(sampleModule);
        activityController = Robolectric.buildActivity(GreetingActivity.class);
    }

    @Test
    public void onCreateFormulatesAGreeting() {
        when(greeting.formulate()).thenReturn("What did you say to me?");

        GreetingActivity activity = activityController.create().get();
        TextView view = (TextView) activity.findViewById(R.id.greeting_text);

        assertThat(view.getText().toString(), is(equalTo("What did you say to me?")));
    }

    @Test
    public void wat() {
        when(greeting.formulate()).thenReturn("nothing");

        GreetingActivity activity = activityController.create().get();
        TextView view = (TextView) activity.findViewById(R.id.greeting_text);

        assertThat(view.getText().toString(), is(equalTo("nothing")));
    }
}
