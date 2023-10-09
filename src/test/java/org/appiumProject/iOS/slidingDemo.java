package org.appiumProject.iOS;

import io.appium.java_client.AppiumBy;
import org.appiumProject.utility.iOSBaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class slidingDemo extends iOSBaseTest {

    @Test
    public void slidingTest()
    {
        WebElement slider = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSlider[`label == \"AppElem\"`]"));
        slider.sendKeys("0%");
        System.out.println(slider.getAttribute("value"));
        slider.sendKeys("0.7%");
        System.out.println(slider.getAttribute("value"));
    }
}
