package org.appiumProject.android;

import io.appium.java_client.AppiumBy;
import org.appiumProject.utility.AndroidBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class copyPasteClipBoardCases extends AndroidBaseTest {

    @Test
    public void clipBoardHandling()
    {
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
        driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();

        // Copy-Paste ClipBoard
        driver.setClipboardText("Rishab Wifi");
        driver.findElement(AppiumBy.id("android:id/edit")).sendKeys(driver.getClipboardText());

        //driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("Rishab Wifi");
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
        Assert.assertEquals(alertTitle, "WiFi settings");
    }
}
