/*
 *    Copyright 2015 APPNEXUS INC
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.appnexus.opensdk;

import com.appnexus.opensdk.shadows.ShadowAsyncTaskNoExecutor;
import com.appnexus.opensdk.shadows.ShadowSettings;
import com.appnexus.opensdk.shadows.ShadowWebSettings;
import com.appnexus.opensdk.ut.UTRequestParameters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowLog;
import org.robolectric.shadows.ShadowWebView;

import java.lang.reflect.Method;
import java.util.ArrayList;

import static junit.framework.Assert.assertTrue;


/**
 * This tests if the options set on a Interstitial AdView are represented in the UT Post data in the right format.
 */
@Config(constants = BuildConfig.class, sdk = 21,
        shadows = {ShadowAsyncTaskNoExecutor.class,
                ShadowWebView.class, ShadowWebSettings.class, ShadowSettings.class, ShadowLog.class})
@RunWith(RobolectricTestRunner.class)
public class InterstitialAdToRequestParametersTest extends BaseRoboTest {

    InterstitialAdView interstitialAdView;
    UTRequestParameters requestParameters;

    @Override
    public void setup() {
        super.setup();
        interstitialAdView = new InterstitialAdView(activity);
        requestParameters = interstitialAdView.requestParameters;

    }



    // https://github.com/robolectric/robolectric/blob/master/shadows/framework/src/main/java/org/robolectric/shadows/ShadowDisplay.java
    // By default Roboelectric uses the ShadowDisplay to set the DisplayMetrics so the container width=320 and height = 496 always

    // Primary size is always the calculated container size.
    // Size Array = (All values passed in the setAllowedSize even if greater than container size) + (1x1 size) + (Container size)
    // Allow smaller size should be false.
    @Test
    public void testSetAllowedSizes(){
        ArrayList<AdSize> adSizeArrayList = new ArrayList<AdSize>();
        adSizeArrayList.add(new AdSize(10,10));
        adSizeArrayList.add(new AdSize(320,50));
        adSizeArrayList.add(new AdSize(300,250));
        adSizeArrayList.add(new AdSize(1024,768));
        interstitialAdView.setAllowedSizes(adSizeArrayList);



        String postData = getRequestParametersPostData();
        assertTrue(postData.contains("\"primary_size\":{\"width\":320,\"height\":496},"));
        assertTrue(postData.contains("\"sizes\":[{\"width\":10,\"height\":10},{\"width\":320,\"height\":50},{\"width\":300,\"height\":250},{\"width\":1024,\"height\":768},{\"width\":1,\"height\":1},{\"width\":320,\"height\":496}],"));
        assertTrue(postData.contains("\"allow_smaller_sizes\":false,"));
    }



    // https://github.com/robolectric/robolectric/blob/master/shadows/framework/src/main/java/org/robolectric/shadows/ShadowDisplay.java
    // By default Roboelectric uses the ShadowDisplay to set the DisplayMetrics so the container width=320 and height = 496 always


    // Primary size is always the calculated container size.
    // Size Array = (All of the default sizes less than container size) + (1x1 size) + (Container size)
    // Allow smaller size should be false.
    @Test
    public void testDefaultSizes(){
        String postData = getRequestParametersPostData();
        assertTrue(postData.contains("\"primary_size\":{\"width\":320,\"height\":496},"));
        assertTrue(postData.contains("\"sizes\":[{\"width\":1,\"height\":1},{\"width\":320,\"height\":496},{\"width\":300,\"height\":250}],"));
        assertTrue(postData.contains("\"allow_smaller_sizes\":false,"));
    }



    public UTRequestParameters getRequestParameters() {
        return requestParameters;
    }


    /**
     * getPostData method is private in UTRequestParameters using reflection to access it.
     * There might be better way of doing this but this works.!!
     * @return postData String
     */
    private String getRequestParametersPostData() {
        String postData = "";
        try {
            Method getPostData = UTRequestParameters.class.getDeclaredMethod("getPostData", null);
            getPostData.setAccessible(true);
            postData = (String) getPostData.invoke(requestParameters, null);
            System.out.println("postData = " + postData);

        }catch (Exception e){
            e.printStackTrace();
        }
        return postData;
    }
}

