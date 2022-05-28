package com.contracosta.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.contracosta.pom.utils.PageUtilities;

public class LanguageSelection {
	
	WebDriver driver;
	WebElement languageBox;
	
	public  LanguageSelection(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void setLanguageCheckBox(String value) {
		this.languageBox = PageUtilities.getInputByLabel(this.driver, value);
		PageUtilities.setCheckBox("Yes", languageBox);
	}
	
	public void setLanguageCheckBoxes(String multipleLanguages) {
		
		
		System.out.println("Input = " + multipleLanguages);
		
	    String[] arrOfLanguages = multipleLanguages.split(",", 0);
	    
	    System.out.println("Array = " + arrOfLanguages.toString());
	    for (String value : arrOfLanguages)
	    {
	    	System.out.println(value);
	    	this.setLanguageCheckBox(value);
		
	    }
	}
	
	
}
