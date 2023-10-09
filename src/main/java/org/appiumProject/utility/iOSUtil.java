package org.appiumProject.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.rmi.Remote;
import java.util.HashMap;
import java.util.Map;

public class iOSUtil extends iOSBaseTest{


    public static String uikCatalog = "/Users/rishabsingh/Documents/Development/Projects/appiumProject/src/test/java/resources/UIKitCatalog.app";
    public static String testApp3 = "/Users/rishabsingh/Documents/Development/Projects/appiumProject/src/test/java/resources/TestApp 3.app";

    public static String photosAppBundleID = "com.apple.mobileslideshow";
    public static void longPressActionIOS(WebElement element,int duration )
    {
        Map<String, Object> params = new HashMap<>();
        params.put("element",((RemoteWebElement)element).getId());
        params.put("duration",duration);
        driver.executeScript("mobile:touchAndHold",params);
    }

    public static void scrollActionIOS(WebElement element, String direction)
    {
        Map<String, Object> params = new HashMap<>();
        params.put("element", ((RemoteWebElement)element).getId());
        params.put("direction", direction);
        driver.executeScript("mobile:scroll",params);
    }

    public static void swipeActionIOS(String direction)
    {
        Map<String, Object> params = new HashMap<>();
        params.put("direction",direction);
        driver.executeScript("mobile:swipe",params);
    }
}
