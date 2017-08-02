package com.appium.day1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Star_stop_server {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

//		String Start_Server="D:\\Appium\\node.exe  D:\\Appium\\node_modules\\appium\\bin\\appium.js";
//		Process process = Runtime.getRuntime().exec(Start_Server);
//		
//		if(process != null)
//		{
//			System.out.println("Appium Server is Started");
//		}
//		else
//		{
//			System.out.println("NOT Started the Appium server");
//		}
		
		Process process = Runtime.getRuntime().exec("cmd /c start /min appium");
		Thread.sleep(15000);
		
		if(process != null)
			System.out.println("Appium Server is Started");
		else
			System.out.println("NOT Started the Appium server");
		
		
		
		//*************************************************************
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Sagar");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.3");
		
		cap.setCapability("noReset", true); // it won't reset the app .. it will use whatever the current app is .. ok
		
		cap.setCapability("appPackage","com.mobeta.android.demodslv");
		 
		 cap.setCapability("appActivity","com.mobeta.android.demodslv.Launcher");

			AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
			System.out.println(driver.getContext());
			
			driver.findElementByXPath("//android.widget.TextView[@text='Basic usage playground']").click();
			
			
			
			//wait
		 
		//*************************************************
		 //Stop the server
//		 if(process!=null)
//		 {
//		 process.destroy();
//			 Thread.sleep(4000);
//			 System.out.println("Stopped the Server");
//			 
//		 }
			if(process!=null) {
				 process.destroy();
				 Thread.sleep(5000);
					Runtime.getRuntime().exec("taskkill /F /IM node.exe");
			}
			
	}

}
