package Sambeet;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebBased_app {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
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
	 capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
	 AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	 
	 Thread.sleep(5000);
	 
	 driver.get("http://www.google.com");
		
	 driver.findElementByName("q").sendKeys("Sachin");
//		driver.findElementByClassName("gws-lite__searchbox-submit").click();
//		
//		Thread.sleep(12000);
//		
//		String Actual_Result = driver.findElementByXPath("//div[contains(text(),'Cricketer')]").getText();
//		System.out.println("Actual Result is "+Actual_Result);
		

	}

}
