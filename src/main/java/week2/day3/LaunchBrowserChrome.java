package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchBrowserChrome {
	public static void main(String[] args) {
		
		//To Launch chrome Browser
		//ChromeDriver driver = new ChromeDriver();
		
		EdgeDriver driver = new EdgeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		
	
		// To Maximise the browser launch
		//object.method.what action need to be done
		
		driver.manage().window().maximize();
		
		// To Load the Application URL
		//object.method is get(string URL)
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//driver.get("https://www.facebook.com/"); 
		
		//http(hyper text protocol) is mandatory if not then browser will launch but application is not loaded.
	}

}
