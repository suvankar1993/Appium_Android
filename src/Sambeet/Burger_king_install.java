package Sambeet;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Burger_king_install {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		File app= new File("D:\\apk file\\Burger_King\\bk-mobile-native.apk");
		
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
		
		capabilities.setCapability("app", app.getAbsolutePath());		
	 
		//Appium server details
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				
	
	}

}
