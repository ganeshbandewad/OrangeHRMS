package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass {
	//driver obj
	public static WebDriver driver;
	//openapp
	public static void openApplication() {
		System.setProperty("webdriver.chrome.driver","D://Softwares//Driver//chromedriver.exe" );
		driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.manage().window().maximize();
		System.out.println("Applicaton Opened");
		Reporter.log("Application open");
}
	public static void closeApplication() {
		driver.close();
			System.out.println("Application Clossed");
			Reporter.log("Application closed");

			}
}