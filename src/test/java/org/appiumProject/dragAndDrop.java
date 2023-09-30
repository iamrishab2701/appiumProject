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

public class dragAndDrop extends BaseTest {

    @Test
    public void dragAndDropTest()
    {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

        WebElement sourceElement = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
        //Drag and Drop
        util.dragAndDrop(sourceElement, 645,595);
        String dragResult = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"io.appium.android.apis:id/drag_result_text\"]")).getText();
        Assert.assertEquals(dragResult, "Dropped!");
    }
}
