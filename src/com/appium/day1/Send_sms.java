package com.appium.day1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Send_sms {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities cap = new DesiredCapabilities();
		// Device details
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Sagar");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.3");
		// app details

		cap.setCapability("appPackage", "com.android.mms");
		cap.setCapability("appActivity", "com.android.mms.ui.ConversationComposer");
		// lunch app
		AndroidDriver androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		String expect_result ="998064115";
		androidDriver.findElementByAccessibilityId("Compose").click();
		androidDriver.findElementByName("Enter recipient").sendKeys("998064115");
		androidDriver.findElementByName("Enter message").sendKeys("hello");
		androidDriver.findElementByName("Send").click();
		androidDriver.findElementById("android:id/up").click();// androidDriver.pressKeyCode(AndroidKeyCode.BACK);
		 List<WebElement> lit_msg = androidDriver.findElementsById("com.android.mms:id/from");
		 int flag=0;
		 for (WebElement webElement : lit_msg) {
			 System.out.println(webElement.getText());
			 if (webElement.getText().equals(expect_result)) {
				 flag=1;
				 break;}
		 }
			if (flag==1) {
				System.out.println("pass");
			} else {
                 System.out.println("fail");
			}
		
 
	}
}