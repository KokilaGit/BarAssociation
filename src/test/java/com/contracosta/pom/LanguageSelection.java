package com.contracosta.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LanguageSelection {
	
	WebDriver driver;
	WebElement checkBox1;
	WebElement checkBox2;
	WebElement checkBox3;
	WebElement nextBtn;
	public  LanguageSelection(WebDriver driver) {
		super();
		this.driver = driver;
		this.checkBox1 = driver.findElement(By.id("ucLanguage_chkLanguage_15"));
		this.checkBox2 = driver.findElement(By.id("ucLanguage_chkLanguage_38"));
		this.checkBox3 = driver.findElement(By.id("ucLanguage_chkLanguage_6"));
		this.nextBtn = driver.findElement(By.id("cmdNext"));
		
	}
	
	public void setCheckBox() {
		this.checkBox1.click();
		this.checkBox2.click();
		this.checkBox3.click();
	}
	
	public void setNextBtn() {
		this.nextBtn.click();
	}

}
