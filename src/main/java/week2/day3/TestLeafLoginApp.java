package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafLoginApp {
	
	public static void main(String[] args) {
		
		// launch chrome browser
		
		ChromeDriver browser=new ChromeDriver();
		
		//if need we can max browser
		
		browser.manage().window().maximize();
		
		//load the web page
		
		browser.get("http://leaftaps.com/opentaps/control/main");
		
		// enter the login creds in its tag label
		
		browser.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		
		//Enter the password in its  label
		
		browser.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		//Click on Login Button 
		
		browser.findElement(By.className("decorativeSubmit")).click();
		
		//print text browser.findElement(By.tagName("h2")).getText(); ctrl2l to get strng txt
		
		String text = browser.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
	//Click on crmsfa hyper link
		
	browser.findElement(By.linkText("CRM/SFA")).click();
		
	//Click on leads tap
	browser.findElement(By.linkText("Leads")).click();
		
		//Click create lead button
		browser.findElement(By.partialLinkText("Create")).click();
		
	}
}
