package org.appiumProject;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.appiumProject.utility.BaseTest;
import org.appiumProject.utility.util;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class swipeDemo extends BaseTest {

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
        util.swipeAction(firstImage, "left");
        Assert.assertEquals(firstImageFocusable,"true");
    }
}
