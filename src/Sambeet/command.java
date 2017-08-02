package Sambeet;

import java.io.IOException;

public class command {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("cmd  /k start");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
