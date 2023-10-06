package org.appiumProject.android;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import org.appiumProject.utility.AndroidBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppPackageAndActivity extends AndroidBaseTest {

    @Test
    public void appPackageAndActivityTest()
    {
        Activity activity = new Activity("io.appium.android.apis","io.appium.android.apis.preference.PreferenceDependencies");
        driver.startActivity(activity);

        driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
        driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
        driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("Rishab Wifi");
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
        Assert.assertEquals(alertTitle, "WiFi settings");
    }
}
