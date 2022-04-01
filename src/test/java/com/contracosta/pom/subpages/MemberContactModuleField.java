package com.contracosta.pom.subpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MemberContactModuleField {
	WebDriver driver;
	WebElement moduleField;
	
	public MemberContactModuleField(WebDriver driver) throws InterruptedException {
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
		
		this.moduleField = driver.findElement(By.id("CF_25"));
	}
	
	/**
	 * @param moduleField the moduleField to set
	 */
	public void setmoduleField(String moduleTxt) {
		this.moduleField.sendKeys(moduleTxt);
	}


}
