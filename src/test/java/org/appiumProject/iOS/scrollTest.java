package org.appiumProject.iOS;

import io.appium.java_client.AppiumBy;
import org.appiumProject.utility.iOSBaseTest;
import org.appiumProject.utility.iOSUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import java.rmi.Remote;
import java.util.HashMap;
import java.util.Map;

public class scrollTest extends iOSBaseTest {

    @Test
    public static void scrollingTest()
    {
        WebElement webView = driver.findElement(AppiumBy.accessibilityId("Web View"));
        iOSUtil.scrollActionIOS(webView,"down");
        webView.click();
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name='UIKitCatalog']")).click();
        driver.findElement(AppiumBy.accessibilityId("Picker View")).click();
    }
}
