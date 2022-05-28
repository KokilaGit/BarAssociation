package com.contracosta.pom.subpages.Contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MemberContactModuleField {
	WebDriver driver;
	WebElement moduleField;
	
	public MemberContactModuleField(WebDriver driver)  {
		super();
		this.driver = driver;
		this.moduleField = driver.findElement(By.id("CF_25"));
	}
	
	/**
	 * @param moduleField the moduleField to set
	 */
	public void setmoduleField(String moduleTxt) {
		this.moduleField.sendKeys(moduleTxt);
	}


}
