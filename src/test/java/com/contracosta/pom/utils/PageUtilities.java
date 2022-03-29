package com.contracosta.pom.utils;

import org.openqa.selenium.WebElement;

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

}
