package com.contracosta.pom.subpages.Membership;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.contracosta.pom.utils.PageUtilities;

public class MembershipProductsServices {
	WebDriver driver;
	WebElement newMember1;
	WebElement newProduct1;
	WebElement lawTest1;

	public MembershipProductsServices(WebDriver driver) {
		super();
		this.driver = driver;
		this.lawTest1 = driver.findElement(By.id("aaProduct_rptrProduct_chkProd_8"));
		this.newMember1 = driver.findElement(By.id("aaProduct_rptrProduct_chkProd_20"));
		this.newProduct1 = driver.findElement(By.id("aaProduct_rptrProduct_chkProd_17"));
	}

	public void setLawTest1(String value) {
		PageUtilities.setCheckBox(value, this.lawTest1);
	}

	public void setNewMember1(String value) {
		PageUtilities.setCheckBox(value, this.newMember1);
	}

	public void setNewProduct1(String value) {
		PageUtilities.setCheckBox(value, this.newProduct1);
	}

	public void setProductInfo(String producLabel, String quantity, String amount) {

		JavascriptExecutor ex = (JavascriptExecutor) driver;

		System.out.println("CheckBox " + producLabel + " Qty = " + quantity + " Amount =" + amount);

		String checkBoxXpath = "//input[@id=//table[@id='tblAAProduct']//label[normalize-space()='" + producLabel
				+ "']/@for]";
		WebElement checkBox;
		checkBox = driver.findElement(By.xpath(checkBoxXpath));
		PageUtilities.setCheckBox("Yes", checkBox);

		String qtyXpath = "//table[@id='tblAAProduct']//label[normalize-space()='" + producLabel
				+ "']//following::td[1]//input";
		WebElement qty;
		if (PageUtilities.elementExists(driver, By.xpath(qtyXpath))) {
			qty = driver.findElement(By.xpath(qtyXpath));
			ex.executeScript("arguments[0].value='" + quantity + "';", qty);
			Actions builder = new Actions(driver);
			builder.moveToElement(qty).build().perform();
			(builder.sendKeys(Keys.TAB)).build().perform();

			System.out.println("quantity from input box =" + qty.getAttribute("value"));
		}

		String amtXpath = "//table[@id='tblAAProduct']//label[normalize-space()='" + producLabel
				+ "']//following::td[3]//input";
		WebElement amtInput;
		amtInput = driver.findElement(By.xpath(amtXpath));
		ex.executeScript("arguments[0].value='" + amount + "';", amtInput);

		Actions builder = new Actions(driver);
		(builder.sendKeys(Keys.TAB)).build().perform();
		(builder.sendKeys(Keys.TAB)).build().perform();

		System.out.println("Amount from input box =" + amtInput.getAttribute("value"));

	}

	public void setProductsServices(String products) {
		if (PageUtilities.valueNotEmpty(products)) {

			// data will come as (jfjdk|200,test|100,)
			String[] arrOfProdcustsTriple = products.split(",", 0);

			// each tuple will contain (jfjdk|200) checkboxtext and amount.
			for (String triple : arrOfProdcustsTriple) {
				String[] listChbxQtyAmount = triple.split("[|]", 0);
				System.out.println(listChbxQtyAmount[0] + " " + listChbxQtyAmount[1] + " " + listChbxQtyAmount[2]);
				if (listChbxQtyAmount.length == 3) {
					this.setProductInfo(listChbxQtyAmount[0], listChbxQtyAmount[1], listChbxQtyAmount[2]);
				}

			}
		}
	}

}
