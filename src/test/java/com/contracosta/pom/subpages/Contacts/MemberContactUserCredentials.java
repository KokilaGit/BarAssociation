package com.contracosta.pom.subpages.Contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MemberContactUserCredentials {
	WebDriver driver;
	WebElement pwdText;
	public MemberContactUserCredentials(WebDriver driver)  {
		super();
		this.driver = driver;
		this.pwdText = driver.findElement(By.id("ucContact_txtPWD"));
	}
	public void setpwdText(String pwdText) {
		this.pwdText.sendKeys(pwdText);
	}

	

}
