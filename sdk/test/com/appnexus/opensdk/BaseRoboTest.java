package com.appnexus.opensdk;

import android.app.Activity;

import com.appnexus.opensdk.shadows.ShadowSettings;
import com.appnexus.opensdk.ut.UTConstants;
import com.appnexus.opensdk.util.Lock;
import com.appnexus.opensdk.util.MockMainActivity;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.mockwebserver.MockWebServer;

import org.junit.After;
import org.junit.Before;
import org.robolectric.Robolectric;
import org.robolectric.shadows.ShadowLog;
import org.robolectric.util.Scheduler;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import static org.robolectric.Shadows.shadowOf;

public class BaseRoboTest {
    public static final int placementID = 1;
    public static final int width = 320;
    public static final int height = 50;
    Activity activity;
    Scheduler uiScheduler, bgScheduler;
    public MockWebServer server;

    @Before
    public void setup() {
        Robolectric.getBackgroundThreadScheduler().reset();
        Robolectric.getForegroundThreadScheduler().reset();
        ShadowLog.stream = System.out;
        activity = Robolectric.buildActivity(MockMainActivity.class).create().start().resume().visible().get();
        shadowOf(activity).grantPermissions("android.permission.INTERNET");
        server= new MockWebServer();
        try {
            server.start();
            HttpUrl url= server.url("/");
            UTConstants.REQUEST_BASE_URL_UT_V2 = url.toString();
            System.out.println(UTConstants.REQUEST_BASE_URL_UT_V2);
            ShadowSettings.setTestURL(url.toString());
            TestResponsesUT.setTestURL(url.toString());
        } catch (IOException e) {
            System.out.print("IOException");
        }
        bgScheduler = Robolectric.getBackgroundThreadScheduler();
        uiScheduler = Robolectric.getForegroundThreadScheduler();
        Robolectric.flushBackgroundThreadScheduler();
        Robolectric.flushForegroundThreadScheduler();
        bgScheduler.pause();
        uiScheduler.pause();
    }


    @After
    public void tearDown() {
        try {
            server.shutdown();
            bgScheduler.reset();
            uiScheduler.reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
        activity.finish();
    }

    private void scheduleTimerToCheckForTasks() {
        Timer timer = new Timer();
        final int[] counter = {330};
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                counter[0]--;
                if (uiScheduler.areAnyRunnable() || bgScheduler.areAnyRunnable() || counter[0] == 0) {
                    Lock.unpause();
                    this.cancel();
                }
            }
        }, 0, 100);
    }

    public void waitForTasks() {
        scheduleTimerToCheckForTasks();
        Lock.pause();
    }
}