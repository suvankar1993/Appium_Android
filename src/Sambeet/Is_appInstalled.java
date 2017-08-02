package Sambeet;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Is_appInstalled {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		File file= new File("D:\\apk file\\com.mobeta.android.demodslv.apk");
		
		//appium server start
		
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("cmd /c start /min appium");
		Thread.sleep(10000);
		if(process!=null) System.out.println("Appium server stared");
		else System.out.println("Appium server not stared");
		//device details
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("deviceName","Redmi");
		 capabilities.setCapability("platformName", "Android");
	 capabilities.setCapability("platformVersion", "4.4.4");
		
		capabilities.setCapability(MobileCapabilityType.APP , file.getAbsolutePath());		
	 
		//Appium server details
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				
		if(driver.isAppInstalled("com.mobeta.android.demodslv"))
		{
			System.out.println("Successfully Installed the APP");
			Thread.sleep(8000);
			
			driver.removeApp("com.mobeta.android.demodslv");
			System.out.println("Removed the app");
			Thread.sleep(8000);
			
			
			driver.installApp("D:\\apk file\\com.mobeta.android.demodslv.apk");
			System.out.println("Re installed the app");
			Thread.sleep(8000);
		}
		else
		{
			System.out.println("NOT installed");
		}
		
		 if(process!=null) {
			 runtime.exec("taskkill /f /im node.exe");
			 runtime.exec("taskkill /f /im cmd.exe");
		 }
	




	}

}
