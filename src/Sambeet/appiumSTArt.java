package Sambeet;

import java.io.File;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class appiumSTArt {
	WebDriver driver;
    AppiumDriverLocalService appiumService;
    String appiumServiceUrl;
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Appium_Node_Path="D:\\Appium\\node.exe";
		String Appium_JS_Path="D:\\Appium\\node_modules\\appium\\bin\\appium.js";
		AppiumDriverLocalService appiumService;

		appiumService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().
			                usingAnyFreePort().usingDriverExecutable(new File(Appium_Node_Path)).
			                withAppiumJS(new File(Appium_JS_Path)));
		appiumService.start();
	}

}
