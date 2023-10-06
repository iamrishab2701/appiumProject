package org.appiumProject.android;

import io.appium.java_client.AppiumBy;
import org.appiumProject.utility.AndroidBaseTest;
import org.appiumProject.utility.util;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dragAndDrop extends AndroidBaseTest {

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
