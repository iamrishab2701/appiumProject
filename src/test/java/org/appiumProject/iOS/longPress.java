package org.appiumProject.iOS;

import io.appium.java_client.AppiumBy;
import org.appiumProject.utility.androidUtil;
import org.appiumProject.utility.iOSUtil;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class longPress extends IOSBasicsTest{

    @Test
    public static void longPressTest()
    {
        driver.findElement(AppiumBy.accessibilityId("Steppers")).click();
        WebElement increment = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Increment\"`][3]"));
        iOSUtil.longPressActionIOS(increment,5);
    }
}
