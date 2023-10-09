package org.appiumProject.utility;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

public class iOSBaseTest {
    public static XCUITestOptions options;
    public static IOSDriver driver;
    public static AppiumDriverLocalService server;

    @BeforeClass
    public void initialisation() throws IOException, InterruptedException {

        HashMap<String, String> environment = new HashMap<>();
        environment.put("PATH", "/usr/local/bin:" + System.getenv("PATH"));
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                .usingDriverExecutable(new File("/usr/local/bin/node"))
                .usingPort(4723)
                .withEnvironment(environment)
                .withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
                .withLogFile(new File("AppiumLog.txt"));
        server = AppiumDriverLocalService.buildService(builder);
        System.out.println("Server started at :" + server.getUrl());
        server.start();
        System.out.println("Server is Started.");

        options = new XCUITestOptions();
        options.setDeviceName("iPhone 15 Pro Max");
        options.setApp(iOSUtil.photosAppBundleID);
        options.setPlatformVersion("17.0"); // iOS Version
        options.setWdaLaunchTimeout(Duration.ofSeconds(30)); //Appium - WebDriver agent -> iOS Apps This is to give some time to install web driver agent into simulator

        driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(androidUtil.IMPLICIT_WAIT));
    }

    @AfterClass
    public void teardown() {
        driver.quit();
        server.stop();
    }
}