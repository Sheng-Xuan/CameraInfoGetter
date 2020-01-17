package com.netvirta.camerainforgetter

import android.content.Intent
import android.util.Log
import androidx.test.espresso.Espresso.onData
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule
import java.util.regex.Pattern.matches

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    val activity = ActivityTestRule(MainActivity::class.java, true, true)

    @Test
    fun printCameraInfoBack() {
        val intent = Intent()
        activity.launchActivity(intent)
        assertEquals("",activity.activity.backCameraInfo.toString())
        activity.finishActivity()
    }
    @Test
    fun printCameraInfoFront() {
        val intent = Intent()
        activity.launchActivity(intent)
        assertEquals("",activity.activity.frontCameraInfo.toString())
        activity.finishActivity()
    }
}
