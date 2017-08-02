package Sambeet;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Burger_king {

	public static void main(String[] args) throws InterruptedException, IOException {
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
	 capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
//app deteils
		capabilities.setCapability("appPackage","com.emn8.mobilem8.nativeapp.bk");
		capabilities.setCapability("appActivity","com.emn8.mobilem8.nativeapp.bk.BKNativeMobileApp");
		//Appium server details
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
Thread.sleep(22000);
		
		Set<String> contextHandles = driver.getContextHandles();
		System.out.println(contextHandles.size());
		
		//*****************************************

		
		for(String contextname:contextHandles)
		{
			System.out.println(contextname);
			
			if(contextname.contains("NATIVE"))
			{
				driver.context(contextname);
				
			}
			
		}
		
		
		WebDriverWait wait= new WebDriverWait(driver, 50);
		WebElement ele_Voucher = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@index='9'][@class='android.view.View'][@content-desc='VOUCHERS']")));
		System.out.println("Voucher element is displayed  "+ele_Voucher.isDisplayed());
				
		ele_Voucher.click();
		
		//*************************************************************
		
		Thread.sleep(7000);
		//second page
		
		for(String contextname:contextHandles)
		{
			System.out.println(contextname);
			
			if(contextname.contains("NATIVE"))
			{
				driver.context(contextname);
				
			}
			
		}
		
		WebDriverWait wait2= new WebDriverWait(driver, 50);
		WebElement ele_Redeem= wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@index='17'][@class='android.view.View'][@content-desc='REDEEM']")));
		System.out.println("Redeem element is displayed  "+ele_Redeem.isDisplayed());
				
		ele_Redeem.click();
		
		//****************************************************************
		
		Thread.sleep(7000);
		//Third page
		
		for(String contextname:contextHandles)
		{
			System.out.println(contextname);
			
			if(contextname.contains("WEBVIEW"))
			{
				driver.context(contextname);
				
			}
			
		}
		
		WebDriverWait wait3= new WebDriverWait(driver, 50);
		WebElement ele_uname= wait3.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
		System.out.println("uname element is displayed  "+ele_uname.isDisplayed());
				
		ele_uname.sendKeys("jun@gmail.com");
		
		WebElement ele_pwd = driver.findElementByName("password");
		ele_pwd.click();
		Thread.sleep(3000);
		
		ele_pwd.sendKeys("1234");
		
		//**************************************************
		
		Thread.sleep(3000);
		
		for(String contextname:contextHandles)
		{
			System.out.println(contextname);
			
			if(contextname.contains("NATIVE"))
			{
				driver.context(contextname);
				
			}
			
		}
		
		System.out.println("sambeet");
		WebDriverWait wait4= new WebDriverWait(driver, 50);
		WebElement ele_Signin= wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@index='33'][@content-desc='SIGN IN']")));
		System.out.println("Sign in element is displayed  "+ele_Signin.isDisplayed());
		//Appium stop server
		 if(process!=null) {
			 runtime.exec("taskkill /f /im node.exe");
			 runtime.exec("taskkill /f /im cmd.exe");
		 }
	
				
	}

}
