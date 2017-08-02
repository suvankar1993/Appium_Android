package Sambeet;

import java.io.IOException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class Ola_App extends Base_class {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
	
	//device details
DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName","Redmi");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.4.4");
		//capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		
		//app details
		capabilities.setCapability("appPackage","com.olacabs.customer");
		capabilities.setCapability("appActivity","com.olacabs.customer.ui.SplashActivity");
		
		//lunch app
		 AndroidDriver<WebElement> androidDriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		 Set<String> contextHandles = androidDriver.getContextHandles();
		 for (String string1 : contextHandles) {
			System.out.println(string1);
		}
		 System.out.println(androidDriver.getContext());
		String text = androidDriver.findElementById("com.olacabs.customer:id/splash_sliding_subtext").getText();
		System.out.println(text);
		androidDriver.findElementById("com.olacabs.customer:id/login_btn").click();
		
		Thread.sleep(5000); 
		 for (String string1 : contextHandles) {
				System.out.println(string1);
			}
		System.out.println(androidDriver.getContext());
		androidDriver.findElementById("com.olacabs.customer:id/login_id").sendKeys("9980641155");
	    androidDriver.findElementById("com.olacabs.customer:id/login_password_txt").sendKeys("sagar14feb");
	    androidDriver.findElementById("com.olacabs.customer:id/background_image").click();
	    Thread.sleep(5000);
	    androidDriver.pressKeyCode(AndroidKeyCode.BACK);
	    Thread.sleep(5000);
	    System.out.println(androidDriver.getContext());
		
	    for (String string1 : contextHandles) {
			System.out.println(string1);
		}
		 
		

	}

}
