package com.contracosta.pom.subpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MemberContactAttorneyInfo {
	WebDriver driver;
	WebElement dateText;
	WebElement stateAdmittedText;
	WebElement dateAdmittedText;
	
	public MemberContactAttorneyInfo(WebDriver driver) throws InterruptedException {
		super();
		this.driver = driver;
		// Locating the Main Menu (Parent element)
		WebElement mainMenu = driver.findElement(By.id("ucTopNavHomeBar_lnkAAM"));

		// Instantiating Actions class
		Actions actions = new Actions(driver);

		// Hovering on main menu
		actions.moveToElement(mainMenu).build().perform();

		// Locating the element from Sub Menu
		WebElement subMenu = driver.findElement(By.xpath("//*[@id='ucTopNavHomeBar_limemAddMember']"));

		// To mouseover on sub menu
		actions.moveToElement(subMenu);
		actions.click().build().perform();
		this.dateText = driver.findElement(By.id("ucContact_txtFirstAdmitPracticeDt"));
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
	public void setDateText(String dateText) {
		this.dateText.sendKeys(dateText);
	}

}
