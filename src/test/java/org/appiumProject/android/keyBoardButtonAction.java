package org.appiumProject.android;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.appiumProject.utility.AndroidBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class keyBoardButtonAction extends AndroidBaseTest {

    @Test
    public void keyboardActionTest()
    {
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
        driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
        driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("Rishab Wifi");
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();

        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.HOME));

        Assert.assertEquals(alertTitle, "WiFi settings");
    }
}
