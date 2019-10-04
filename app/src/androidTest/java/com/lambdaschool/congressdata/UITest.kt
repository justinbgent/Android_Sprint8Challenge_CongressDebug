package com.lambdaschool.congressdata

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import com.lambdaschool.congressdata.ui.DetailsActivity
import org.junit.Before
import org.junit.FixMethodOrder
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters

@RunWith(AndroidJUnit4::class)
@LargeTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class UITest {
    //A000374 Ralph Abraham
    //https://developer.android.com/training/testing/espresso/intents


//    val intentsTestRule = IntentsTestRule(DetailsActivity::class.java)

    @Rule
    @JvmField
    val intentStuff = ActivityTestRule(DetailsActivity::class.java)
    @Before
    fun startIntent(){
        val intent = Intent()
        intent.putExtra("id", "A000374")
        intentStuff.launchActivity(intent)
    }
//    var activityScenarioRule = ActivityScenarioRule(DetailsActivity::class.java)

    @Test
    fun shouldTakeToTwitter(){
        onView(withId(R.id.profile_twitter)).perform(click())
    }

    @Test
    fun shouldTakeToFacebook(){
        onView(withId(R.id.profile_facebook)).perform(click())
    }

    @Test
    fun shouldTakeToMaps(){
        onView(withId(R.id.profile_map)).perform(click())
    }

    @Test
    fun shouldShowImage(){
        onView(withId(R.id.profile_image)).check()
    }
}