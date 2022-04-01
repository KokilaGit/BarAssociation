package com.contracosta.pom.subpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AdditionalMemberInfo {
	WebDriver driver;
	WebElement memberId;
	WebElement imisTxt;
	WebElement notesTxt;
	
	public AdditionalMemberInfo(WebDriver driver) throws InterruptedException {
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
		
		this.memberId = driver.findElement(By.id("ucContact_txtUQIDTitle"));
		this.imisTxt = driver.findElement(By.id("ucContact_txtIMIS"));
		this.notesTxt = driver.findElement(By.id("ucContact_txtNote"));
	}
	
	public void setmemberId(String memberIdtxt) {
		this.memberId.sendKeys(memberIdtxt);
		;
	}

	/**
	 * @param imisTxt the imisTxt to set
	 */
	public void setimisTxt(String imisTxt) {
		this.imisTxt.sendKeys(imisTxt);
	}

	/**
	 * @param notesTxt the notesTxt to set
	 */
	public void setnotesTxt(String notesTxt) {
		this.notesTxt.sendKeys(notesTxt);
	}

}
