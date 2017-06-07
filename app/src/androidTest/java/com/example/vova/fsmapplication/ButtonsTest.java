package com.example.vova.fsmapplication;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.vova.fsmapplication.presentation.ui.activities.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by vova on 06.06.17.
 */

@RunWith(AndroidJUnit4.class)
public class ButtonsTest {

    @Rule
    public ActivityTestRule<MainActivity> mMainActivityActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void clickLockButton_changeText() throws Exception {
        onView(withId(R.id.button_lock)).perform(click());
        onView(withId(R.id.textView_status)).check(matches(isDisplayed()));
    }

    @Test
    public void clickLockX2Button_changeText() throws Exception {
        onView(withId(R.id.button_lock_x2)).perform(click());
        onView(withId(R.id.textView_status)).check(matches(isDisplayed()));
    }

    @Test
    public void clickUnlockButton_changeText() throws Exception {
        onView(withId(R.id.button_unlock)).perform(click());
        onView(withId(R.id.textView_status)).check(matches(isDisplayed()));
    }

    @Test
    public void clickUnlockX2Button_changeText() throws Exception {
        onView(withId(R.id.button_unlock_x2)).perform(click());
        onView(withId(R.id.textView_status)).check(matches(isDisplayed()));
    }
}
