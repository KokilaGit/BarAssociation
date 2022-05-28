package com.contracosta.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainMenu {
	WebDriver driver;
	WebElement mainMenu;
	WebElement subMenu;
	WebElement nextBtn;
	public MainMenu(WebDriver driver)  {
		super();
		this.driver = driver;
	}
	public void selectAddMember() {
		// Locating the Main Menu (Parent element)
		 mainMenu = driver.findElement(By.id("ucTopNavHomeBar_lnkAAM"));

		// Instantiating Actions class
		Actions actions = new Actions(driver);

		// Hovering on main menu
		actions.moveToElement(mainMenu).build().perform();

		// Locating the element from Sub Menu
		 subMenu = driver.findElement(By.xpath("//*[@id='ucTopNavHomeBar_limemAddMember']"));

		// To mousehover on sub menu
		actions.moveToElement(subMenu);
		actions.click().build().perform();
	}
	public void setNextBtn() {
		this.nextBtn = driver.findElement(By.id("cmdNext"));
		this.nextBtn.click();
	}

}
