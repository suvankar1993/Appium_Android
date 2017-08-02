package Sambeet;

import java.io.IOException;

public class Base_class {

	 public  void Start_server() throws IOException, InterruptedException {
		 Process pro = Runtime.getRuntime().exec("cmd /c /min appium");
		 Thread.sleep(15000);
		 if(pro!=null) {
			 System.out.println("Appium server start");
		 }
		 else {
			 System.out.println("Appium server not stared");
		 }
		 
	 }
	 public void Stop_server() throws IOException {
		 Runtime.getRuntime().exec("taskkill /f /im node.exe");
		 System.out.println("appium server stop");
		 
	 }
	

	

}
