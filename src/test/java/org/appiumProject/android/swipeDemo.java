package org.appiumProject.android;

import io.appium.java_client.AppiumBy;
import org.appiumProject.utility.AndroidBaseTest;
import org.appiumProject.utility.androidUtil;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class swipeDemo extends AndroidBaseTest {

    @Test
    public void swipeTest()
    {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
        WebElement firstImage = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[1]"));
        String firstImageFocusable = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[1]")).getAttribute("focusable");
        Assert.assertEquals(firstImageFocusable, "true");
        //Swipe
        androidUtil.swipeAction(firstImage, "left");
        Assert.assertEquals(firstImageFocusable,"true");
    }
}
