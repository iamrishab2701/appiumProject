package org.appiumProject.android;

import io.appium.java_client.AppiumBy;
import org.appiumProject.utility.AndroidBaseTest;
import org.appiumProject.utility.androidUtil;
import org.testng.annotations.Test;

public class scrollDemo extends AndroidBaseTest {


    @Test
    public void scrollDemoTest() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        //1. UI automator methods
         androidUtil.scrollUsingUiAutomator("WebView");
    }
}
