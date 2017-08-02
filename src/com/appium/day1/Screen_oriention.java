package com.appium.day1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Screen_oriention {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Sagar");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.3");
		cap.setCapability("appPackage","com.android.contacts" );
		cap.setCapability("appActivity", "com.android.contacts.activities.DialtactsActivity");

			AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			driver.rotate(ScreenOrientation.LANDSCAPE);
			Thread.sleep(5000);
			driver.rotate(ScreenOrientation.PORTRAIT);
	}

}
