package com.appium.day1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ola_app {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName","Redmi");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.4.4");
		
		
		capabilities.setCapability("appPackage","com.olacabs.customer");
		capabilities.setCapability("appActivity","com.olacabs.customer.ui.SplashActivity");
		
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Thread.sleep(5000);
		driver.findElementById("android:id/button1").click();
		
		//not yet implemented
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		
//		WebDriverWait wait= new WebDriverWait(driver, 35);
//		WebElement ele_Ridenow = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.olacabs.customer:id/button_ride_now")));
//		System.out.println("Ride now button found "+ele_Ridenow.isDisplayed());
//		
//		ele_Ridenow.click();
//		
//		
//		Thread.sleep(5000);
//		String Actual_Result = driver.findElementById("com.olacabs.customer:id/button_ride_confirm").getText();
//		System.out.println(Actual_Result);
//		
//		Thread.sleep(5000);
//		driver.sendKeyEvent(AndroidKeyCode.BACK);
		
	}

}
