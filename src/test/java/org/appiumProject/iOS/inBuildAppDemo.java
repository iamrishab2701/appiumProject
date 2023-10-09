package org.appiumProject.iOS;

import io.appium.java_client.AppiumBy;
import org.appiumProject.utility.iOSBaseTest;
import org.appiumProject.utility.iOSUtil;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class inBuildAppDemo extends iOSBaseTest {

    @Test
    public void inBuildAppTest()
    {
        Map<String, Object> params = new HashMap<>();
        params.put("bundleId","com.apple.mobileslideshow");
        driver.executeScript("mobile:launchApp",params);
        driver.findElement(AppiumBy.iOSNsPredicateString("label == \"All Photos\"")).click();
        List<WebElement> allPhotos = driver.findElements(AppiumBy.iOSClassChain("**/XCUIElementTypeCell"));
        System.out.println(allPhotos.size());
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeCell[1]")).click();
        for(WebElement photos : allPhotos) {
            String timeStamp = driver.findElement(AppiumBy.className("XCUIElementTypeNavigationBar")).getText();
            System.out.println(timeStamp);
            iOSUtil.swipeActionIOS("left");
        }
        driver.navigate().back();
        driver.findElement(AppiumBy.accessibilityId("Albums")).click();
    }
}