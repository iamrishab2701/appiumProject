package org.appiumProject;

import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.Immutable;
import io.appium.java_client.AppiumBy;
import org.appiumProject.utility.BaseTest;
import org.appiumProject.utility.util;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

public class scrollDemo extends BaseTest {


    @Test
    public void scrollDemoTest() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        //1. UI automator methods
         util.scrollUsingUiAutomator("WebView");
    }
}
