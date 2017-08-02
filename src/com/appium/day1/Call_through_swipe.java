package com.appium.day1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Call_through_swipe {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
DesiredCapabilities cap=new DesiredCapabilities();
cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Sagar");
cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.3");
cap.setCapability("appPackage","com.android.contacts" );
cap.setCapability("appActivity", "com.android.contacts.activities.DialtactsActivity");

	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

	driver.findElementByName("Contacts").click();
	driver.findElementByName("    Search").sendKeys("Manas");
driver.findElementByXPath("//*[@text='Manas'][@index='1']").click();
driver.findElementByAccessibilityId("Call").click();

Thread.sleep(3000);
 
String text = driver.findElementById("Dialling").getText();

driver.findElementByAccessibilityId("End call").click();
if (text.equals("Dialling")) {System.out.println("pass");
} else {
System.out.println("fail");
}

	}
	  

}
