package Sambeet;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Rediif_webbased_APP {

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
	 capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
	 AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	 
	 Thread.sleep(5000);
	 

		driver.get("http://books.rediff.com/");
		//Thread.sleep(13000);	
		
		driver.findElementById("srchword").sendKeys("Modi");
		driver.findElementByClassName("srchbtn_n").click();
		Thread.sleep(8000);
		
		List<WebElement> ele_bookcont = driver.findElementsByTagName("a");
		System.out.println(ele_bookcont.size());
		
		for(WebElement ele:ele_bookcont)
		{
			if((ele.getText()).contains("Gamechanger"))
			{
				ele.click();
				break;
				
			}
			
			
		}//end of for loop
		
		Thread.sleep(12000);
		
		driver.findElementByXPath("//input[@class='buynowbtn'][@type='button']").click();
		Thread.sleep(7000);
		
		WebElement ele_bookcart = driver.findElementByCssSelector("#currentcartdiv > div.cart_prd_row > div.prddetail > span:nth-child(1)");
		String Actual_Result = ele_bookcart.getText();
		Thread.sleep(4000);
		
		if(Actual_Result.contains("Gamechanger"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
	}

}
