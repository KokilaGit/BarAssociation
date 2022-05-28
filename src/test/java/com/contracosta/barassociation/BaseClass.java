package com.contracosta.barassociation;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	//Static driver is used so that it can be shared across multiple test cases / page objects
	protected static WebDriver driver = null;
}
