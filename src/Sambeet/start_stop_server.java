package Sambeet;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class start_stop_server {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub

		
		AppiumDriverLocalService buildDefaultService = AppiumDriverLocalService.buildDefaultService();
		buildDefaultService.start();
		String string = buildDefaultService.getUrl().toString();
		 System.out.println("Appium Service Address : - "+ string);
		 Thread.sleep(12000);
			
		 System.out.println("sambeet");

		 DesiredCapabilities capabilities=new DesiredCapabilities();
		 capabilities.setCapability("deviceName","Redmi");
		  capabilities.setCapability("platformName", "Android");
		  capabilities.setCapability("platformVersion", "4.4.4");
		  //app details
		  
		  capabilities.setCapability("appPackage","com.mobeta.android.demodslv");
		  
		  capabilities.setCapability("appActivity","com.mobeta.android.demodslv.Launcher");
		 
		  System.out.println("hello");
WebDriver androidDriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
	}

}
