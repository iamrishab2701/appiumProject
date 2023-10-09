package org.appiumProject.utility;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;
import java.util.Map;

public class androidUtil extends AndroidBaseTest {

    public static long IMPLICIT_WAIT = 15;

    public static void longPressAction(WebElement element)
    {
        ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
                ImmutableMap.of("elementId",((RemoteWebElement)element).getId(), "duration", 2000));
    }

    public static void scrollUsingUiAutomator(String str)
    {
        driver.findElement(AppiumBy.
                androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+ str +"\"));"));
    }

    public static void scrollUsingJavaScriptExecutorToEnd()
    {
        boolean canScrollMore;
        do {
            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 200, "height", 200,
                    "direction", "down",
                    "percent", 3.0));
        } while (canScrollMore);
    }

    public static void swipeAction(WebElement element, String direction)
    {
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId",((RemoteWebElement)element).getId(),
                "direction", direction,
                "percent",0.75
        ));
    }

    public static void dragAndDrop(WebElement source, int endX, int endY)
    {
        ((JavascriptExecutor)driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement)source).getId(),
                "endX",endX,
                "endY",endY
        ));
    }
}