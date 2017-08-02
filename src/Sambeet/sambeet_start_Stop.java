package Sambeet;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class sambeet_start_Stop {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Strat server
		Process process = Runtime.getRuntime().exec("cmd /c start /min appium");
		Thread.sleep(15000);
		
		if(process != null)
			System.out.println("Appium Server is Started");
		else
			System.out.println("NOT Started the Appium server");
		
		//test case
		System.out.println("sambeet");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("deviceName","Redmi");
		 capabilities.setCapability("platformName", "Android");
	 capabilities.setCapability("platformVersion", "4.4.4");
	 capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		 //app details
		 
		 capabilities.setCapability("appPackage","com.mobeta.android.demodslv");
		 
		 capabilities.setCapability("appActivity","com.mobeta.android.demodslv.Launcher");
		 //lunch the appium browser
		 AndroidDriver  driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.findElementById("com.mobeta.android.demodslv:id/activity_desc").click();
		List<WebElement> ele_listCount= driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle");
		System.out.println(ele_listCount.size());
		  Dimension size = driver.manage().window().getSize();
		  System.out.println(size);
		  
		 int starty=(int) (size.height*0.90);
		  int endsy=(int) (size.height*0.10);
		  
		int x=(int)(size.width*0.50);
		driver.swipe(x, starty, x, endsy, 2000);

		List<WebElement> ele= driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle");
		 
		System.out.println(ele.size());
		new TouchAction(driver).longPress(ele_listCount.get(8)).moveTo(ele_listCount.get(2)).release().perform();
		
		driver.pressKeyCode(AndroidKeyCode.HOME);
		//stop server
		if(process!=null) {
			 process.destroy();
			 Thread.sleep(5000);
				Runtime.getRuntime().exec("taskkill /F /IM node.exe");
				
				
				System.out.println("stop");
		}
		 
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
		
	}

}
