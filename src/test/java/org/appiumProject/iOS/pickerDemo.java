package org.appiumProject.iOS;

import io.appium.java_client.AppiumBy;
import org.appiumProject.utility.iOSBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class pickerDemo extends iOSBaseTest {

    @Test
    public void pickerTest()
    {
        scrollTest.scrollingTest();
        driver.findElement(AppiumBy.accessibilityId("Red color component value")).sendKeys("80");
        driver.findElement(AppiumBy.accessibilityId("Green color component value")).sendKeys("220");
        driver.findElement(AppiumBy.iOSNsPredicateString("label == \"Blue color component value\"")).sendKeys("105");
        Assert.assertEquals(driver.findElement(AppiumBy.iOSNsPredicateString("label == \"Blue color component value\"")).getText(), "105");
    }
}
