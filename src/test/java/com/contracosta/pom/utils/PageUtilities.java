package com.contracosta.pom.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtilities {
	public static void setCheckBox(String flag, WebElement elem) {
		/* Flag= True select the checkbox */
		if (flag.toLowerCase().equals("yes")) {
			if (!elem.isSelected()) {
				elem.click();
			}
			/* Flag= False unselect the checkbox */
			else {
				if (elem.isSelected()) {
					elem.click();
				}
			}
		}
	}

	public static WebElement getInputByLabel(WebDriver driver, String label) {
		String labelLocator = "//input[@id=//label[contains(text(),'" + label + "')]/@for]";
		return driver.findElement(By.xpath(labelLocator));

	}

	public static WebElement getInputFollowingLabel(WebDriver driver, String label) {
		String labelLocator = "//label[contains(text(),'" + label + "')]/following::input[1]";
		return driver.findElement(By.xpath(labelLocator));

	}

	public static boolean elementExists(WebDriver driver, By locator) {
		return !driver.findElements(locator).isEmpty();
	}

	// return true if the element is not empty
	public static boolean valueNotEmpty(String val) {
		return (!val.trim().isEmpty());
	}

	// set textbox value
	public static void setInputText(WebElement element, String value) {
		if (valueNotEmpty(value)) {
			element.clear();
			element.sendKeys(value);
		}
	}

	// Set Dropdown Box
	public static void setDropDown(WebElement element, String value) {
		if (valueNotEmpty(value)) {
			element.click();
			Select select1 = new Select(element);
			select1.selectByVisibleText(value);
		}
	}

}
