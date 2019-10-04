package com.lambdaschool.congressdata

import android.content.Intent
import android.support.design.widget.CoordinatorLayout.Behavior.setTag
import android.support.v4.content.ContextCompat
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.runner.intent.IntentStubber
import com.lambdaschool.congressdata.ui.DetailsActivity
import kotlinx.android.synthetic.main.activity_details_view.*
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

//    @get:Rule
//    val intentsTestRule = IntentsTestRule(DetailsActivity::class.java)
    @Rule
    @JvmField
    var activityScenarioRule = ActivityScenarioRule(DetailsActivity::class.java)

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

//        activityScenarioRule.scenario.onActivity {
//            it.profile_image.setImageDrawable(it.getDrawable(R.drawable.k000388))
//            val intent = Intent(it, DetailsActivity::class.java)
//            intent.putExtra("id", "A000374")
//            it.startActivity(intent)
//
//        }

        //onView(withId(R.id.profile_image)).check(matches(withId(R.drawable.k000388)))
    }
}