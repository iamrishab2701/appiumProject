package org.appiumProject;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.appiumProject.utility.BaseTest;
import org.appiumProject.utility.util;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class longPressGesture extends BaseTest {

    @Test
    public void longPressTest() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();

        //Long click gesture using JavaScriptExecutor
        WebElement pNames = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='People Names']"));
        util.longPressAction(pNames);

        String sampleMenuText = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Sample menu']")).getText();
        Assert.assertEquals(sampleMenuText, "Sample menu");
    }
}
