package com.appium.day1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Get_Sms {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap=new DesiredCapabilities();
		//Device details
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Sagar");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType .PLATFORM_VERSION, "4.3");
		//app Details
		cap. setCapability("appPackage","com.android.mms");
		cap.setCapability("appActivity","com.android.mms.ui.ConversationComposer");
//Lunch app
		AndroidDriver  androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		String expect_result ="Subhendu Dadababu";
		String Actual_result="";
		
		WebElement present = androidDriver.findElementByClassName("android.widget.TextView");
		do {
			List<WebElement> list_msg = androidDriver
					.findElementsByXPath("//*[@text='Subhendu Dadababu'][@resource-id='com.android.mms:id/from']");
			if (list_msg.size() > 0) {
				 Actual_result = androidDriver.findElementByXPath("//*[@text='Subhendu Dadababu'][@resource-id='com.android.mms:id/from']").getText();
				 androidDriver.quit();
				
				break;
			}
			// vertical swipe
			Dimension size = androidDriver.manage().window().getSize();
			int starty = (int) (size.height * .9);
			int endy = (int) (size.height * .1);
			int x = (int) (size.width * .5);
			androidDriver.swipe(x, starty, x, endy, 2000);
		}while(present.isDisplayed()==true);

		if (Actual_result.equals(expect_result)) {
			System.out.println("pass");
		} else {
          System.out.println("fail");
		}
	}

}
