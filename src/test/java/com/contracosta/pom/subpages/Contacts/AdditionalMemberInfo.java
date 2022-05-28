package com.contracosta.pom.subpages.Contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdditionalMemberInfo {
	WebDriver driver;
	WebElement memberId;
	WebElement imisTxt;
	WebElement notesTxt;
	
	public AdditionalMemberInfo(WebDriver driver)  {
		super();
		this.driver = driver;
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
