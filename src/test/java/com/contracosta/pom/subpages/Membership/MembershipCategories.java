package com.contracosta.pom.subpages.Membership;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.contracosta.pom.utils.PageUtilities;

public class MembershipCategories {
	WebDriver driver;
	WebElement testRadioBtn;
	WebElement testingRadioBtn;
	WebElement lawStuRadioBtn;

	public MembershipCategories(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void setCategorybtn(String value) {
		if (PageUtilities.valueNotEmpty(value)) {
			WebElement membercategoryRadioBtn = PageUtilities.getInputByLabel(driver, value);
			membercategoryRadioBtn.click();
		}

	}
}
