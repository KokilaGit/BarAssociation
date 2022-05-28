package com.contracosta.pom.subpages.Contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MemberContactAttorneyInfo {
	WebDriver driver;
	WebElement dateFirstAdmittedToStateText;
	WebElement stateAdmittedText;
	WebElement dateAdmittedText;

	public MemberContactAttorneyInfo(WebDriver driver)  {
		super();
		this.dateFirstAdmittedToStateText = driver.findElement(By.id("ucContact_txtFirstAdmitPracticeDt"));
		this.stateAdmittedText = driver.findElement(By.id("ucContact_cboBarST"));
		this.dateAdmittedText = driver.findElement(By.id("ucContact_txtBarAdmDt"));
	}

	public void setstateAdmittedText() {
		this.stateAdmittedText.click();
	}

	public void setdateAdmittedText(String dateAdmittedText) {
		this.dateAdmittedText.sendKeys(dateAdmittedText);
	}

	/**
	 * @param dateText the dateText to set
	 */
	public void setDateFirstAdmittedToStateText(String dateText) {
		this.dateFirstAdmittedToStateText.sendKeys(dateText);
	}

}
