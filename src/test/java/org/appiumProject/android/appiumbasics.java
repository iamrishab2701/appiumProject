package org.appiumProject.android;

import io.appium.java_client.AppiumBy;
import org.appiumProject.utility.AndroidBaseTest;
import org.testng.Assert;
import org.testng.annotations.*;

public class appiumbasics extends AndroidBaseTest {

    @Test
    public void test()
    {
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
        driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
        driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("Rishab Wifi");
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
        Assert.assertEquals(alertTitle, "WiFi settings");
    }
}