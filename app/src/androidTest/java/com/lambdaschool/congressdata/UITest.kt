package com.lambdaschool.congressdata

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.assertThat
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.runner.intent.IntentStubber
import com.lambdaschool.congressdata.ui.DetailsActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class UITest {
//    @get:Rule
//    val intentsTestRule = IntentsTestRule(DetailsActivity::class.java)
    @Rule
    @JvmField
    var activityScenarioRule = ActivityScenarioRule(DetailsActivity::class.java)

//    @Test
//    fun shouldTakeToTwitter(){
//        onView(withId(R.id.profile_twitter)).perform(click())
//    }
//
//    @Test
//    fun shouldTakeToFacebook(){
//        onView(withId(R.id.profile_facebook)).perform(click())
//    }
//
//    @Test
//    fun shouldTakeToMaps(){
//        onView(withId(R.id.profile_map)).perform(click())
//    }
}