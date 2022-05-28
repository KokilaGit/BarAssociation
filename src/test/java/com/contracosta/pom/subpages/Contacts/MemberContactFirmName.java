package com.contracosta.pom.subpages.Contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MemberContactFirmName {
	WebDriver driver;
	WebElement firmNameRadioBtn;
	
	public MemberContactFirmName(WebDriver driver)  {
		super();
		this.driver = driver;
		this.firmNameRadioBtn = driver.findElement(By.id("ucContact_optFirmNo"));
	}
	
	/**
	 * @param firmNameRadioBtn the firmNameRadioBtn to set
	 */
	public void setFirmNameRadioBtn() {
		this.firmNameRadioBtn.click();
	}

}
