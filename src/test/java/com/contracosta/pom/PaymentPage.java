package com.contracosta.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PaymentPage {
	
	WebDriver driver;
	WebElement cashRadioBtn;
	WebElement checkBox;
	WebElement notesTextField;
	WebElement submitBtn;
	WebElement successMsg;
	public PaymentPage(WebDriver driver) {
		super();
		this.driver = driver;
		this.cashRadioBtn = driver.findElement(By.id("optPayType_3"));
		this.checkBox = driver.findElement(By.id("chknotsend"));
		this.notesTextField = driver.findElement(By.id("txtPaymentNote"));
		this.submitBtn = driver.findElement(By.id("cmdAdd"));
		
	}
	
	public void setCashRadioBtn() {
		this.cashRadioBtn.click();
	}
	
	public void setCheckBox() {
		this.checkBox = driver.findElement(By.id("chknotsend"));
		this.checkBox.click();
	}
	
	public void setNotesTextField(String paymentNotes) {
		//getting the element again because of page reload to avoid stale element reference: element is not attached to the page document
		this.notesTextField = driver.findElement(By.id("txtPaymentNote"));
		this.notesTextField.sendKeys(paymentNotes);
	}
	
	public void setSubmitBtn() {
		this.submitBtn = driver.findElement(By.id("cmdAdd"));
		this.submitBtn.click();
		
	}
	public void setSuccessMsg() {
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("InTouchOnDemand: Membership List"));
		this.successMsg = driver.findElement(By.id("divMsg"));
		String message = this.successMsg.getText();
		Assert.assertEquals(message,"Member was successfully added.");
		
		
	}

}
