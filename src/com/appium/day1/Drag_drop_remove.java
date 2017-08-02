package com.appium.day1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Drag_drop_remove {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		// device details

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Sagar");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.3");

		// app details
		// cap.setCapability(capabilityName, value);
		cap.setCapability("appPackage", "com.mobeta.android.demodslv");

		cap.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");

		// new AndroidDriver<>(remoteAddress, desiredCapabilities);
		AndroidDriver androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	 
	androidDriver.findElementByXPath("//*[@text='CursorAdapter'][@class='android.widget.TextView']").click();
	

	List<WebElement> ele_txtcont = androidDriver.findElementsById("com.mobeta.android.demodslv:id/text");
	int size = ele_txtcont.size();
	
	
	List<WebElement> ele_remcont = androidDriver.findElementsById("com.mobeta.android.demodslv:id/click_remove");
	int size2 = ele_remcont.size();
	
	for(int i=0;i<size;i++)
	{
		
		if((ele_txtcont.get(i).getText()).equals("Keith Jarrett"))
		{
			ele_remcont.get(i).click();
			break;
			
		}
		
		
	}
	//verfify
	List<WebElement> list=androidDriver.findElementsById("com.mobeta.android.demodslv:id/text");
	int flag=0;//not seen;
	
	
	for (WebElement webElement : list) {
		if (webElement.getText().equals("Keith Jarrett")) {flag=1;//seen
		break;
			
		}
	}
	if (flag==0) {System.out.println("pass");
		
	} else {System.out.println("fail");

	}
	
	}
	 
	}
	
	
	
	
