package org.appiumProject.iOS;

import io.appium.java_client.AppiumBy;
import org.appiumProject.utility.iOSBaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IOSBasicsTest extends iOSBaseTest {

    @Test
    public void iOSBasicsTest()
    {
        driver.findElement(AppiumBy.accessibilityId("Alert Views")).click();
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Text Entry\"`]")).click();
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeCell")).sendKeys("Hello World");
        driver.findElement(AppiumBy.accessibilityId("OK")).click();
        driver.findElement(AppiumBy.iOSNsPredicateString("label == \"Confirm / Cancel\" AND type == \"XCUIElementTypeStaticText\"")).click();
        String alertMessage = driver.findElement(AppiumBy.accessibilityId("A message should be a short, complete sentence.")).getText();
        Assert.assertEquals(alertMessage, "A message should be a short, complete sentence.");
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Confirm\"`]")).click();

    }
}