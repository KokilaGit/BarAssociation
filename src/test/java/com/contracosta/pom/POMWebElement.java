package com.contracosta.pom;

import org.openqa.selenium.WebElement;

public abstract class POMWebElement implements WebElement {

	public void click()
	{
		this.click();
	}
	
	public void setValue(String str)
	{
		this.clear();
		this.sendKeys(str); 
	}
	
}
