package com.contracosta.barassociation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetUp extends BaseClass {
	@BeforeSuite
	public void setUp() {
		Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
        Reporter.log("Launching Google Chrome Driver  for this test"); 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterSuite
	public void closeUp() 
	{
		driver.close();
		driver.quit();
		Reporter.log("Driver Closed After Testing");
	}
	

}
