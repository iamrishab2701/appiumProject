package org.appiumProject;

import io.appium.java_client.AppiumBy;
import org.appiumProject.utility.BaseTest;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class orientationCases extends BaseTest {

    @Test
    public void orientationHandling()
    {

        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();

        // Changing the device orientation
        DeviceRotation rotation = new DeviceRotation(0,0,90); // 0,0,90 is for Landscape
        driver.rotate(rotation);

        driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
        driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("Rishab Wifi");
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
        Assert.assertEquals(alertTitle, "WiFi settings");
    }

}
