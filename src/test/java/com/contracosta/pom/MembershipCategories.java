package com.contracosta.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MembershipCategories {
	WebElement testRadioBtn;
	WebDriver driver;
	WebElement nextBtn;
	public MembershipCategories(WebDriver driver) {
		super();
		this.driver = driver;
		this.testRadioBtn = driver.findElement(By.id("rptrMembership_optMem_9"));
		this.nextBtn = driver.findElement(By.id("cmdNext"));
	}
public void settestRadioBtn() {
	this.testRadioBtn.click();
}

public void setnextBtn() {
	this.nextBtn.click();
}
	
}
