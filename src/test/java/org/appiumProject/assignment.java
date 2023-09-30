package org.appiumProject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.appiumProject.utility.BaseTest;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class assignment extends BaseTest {

    @BeforeMethod
    public void assignmentTest()
    {
        driver.findElement(AppiumBy.accessibilityId("App")).click();
        driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
    }

    @Test
    public void okCancelDialogWithSmallMessage()
    {
        driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
        String alertText = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertText, "Lorem ipsum dolor sit aie consectetur adipiscing\n" +
                "Plloaso mako nuto siwuf cakso dodtos anr koop.");
        driver.findElement(AppiumBy.id("android:id/button1"));
    }

    @Test
    public void okCancelDialogWIthLongMessage()
    {
        driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a long message")).click();
        String alertText = driver.findElement(AppiumBy.id("android:id/message")).getText();
        Assert.assertEquals(alertText, "Plloaso mako nuto siwuf cakso dodtos anr koop a cupy uf cak vux noaw yerw phuno. Whag schengos, uf efed, quiel ba mada su otrenzr.\n" +
                "\n" +
                "Swipontgwook proudgs hus yag su ba dagarmidad. Plasa maku noga wipont trenzsa schengos ent kaap zux comy.\n" +
                "\n" +
                "Wipont trenz kipg naar mixent phona. Cak pwico siructiun ruous nust apoply tyu cak Uhex sisulutiun munityuw uw dseg");
        driver.findElement(AppiumBy.id("android:id/button1")).click();
    }
}