package com.contracosta.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	WebElement userName;
	WebElement password;
	WebElement loginbtn;
	WebElement forgotLink;
	String url = "https://dev-colo-2.intouchondemand.com/barlanding.aspx";
	WebElement logoutLnk;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		this.driver.get(url);
		this.userName = driver.findElement(By.id("LG"));
		this.password = driver.findElement(By.id("PWD"));
		this.loginbtn = driver.findElement(By.id("btnSubmit"));
	}



	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		
		this.userName.sendKeys(userName); 
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password.sendKeys(password); 
	}
	
	public void clickLogin() {	
		this.loginbtn.click();
	}
	
	//Logout link
	
	public void clickLogout() {
		this.logoutLnk = driver.findElement(By.xpath("//a[text()='Logout']"));
		this.logoutLnk.click();
	}

}
