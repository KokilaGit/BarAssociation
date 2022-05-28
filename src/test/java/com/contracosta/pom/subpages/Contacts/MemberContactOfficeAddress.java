package com.contracosta.pom.subpages.Contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.contracosta.pom.utils.PageUtilities;

public class MemberContactOfficeAddress {
	WebDriver driver;
	WebElement sameMailingChbx;
	WebElement officePhonePart1;
	WebElement officePhonePart2;
	WebElement officePhonePart3;
	WebElement officeFaxPart1;
	WebElement officeFaxPart2;
	WebElement officeFaxPart3;
	WebElement officeEmail1;
	WebElement officeEmail2;
	WebElement officeAddress1;
	WebElement officeAddress2;
	WebElement officeAddressCity;
	WebElement officeAddressState;
	WebElement officeAddressZipcode;
	WebElement officeAddressCounty;
	public MemberContactOfficeAddress(WebDriver driver)  {
		super();
		this.driver = driver;
		this.sameMailingChbx = driver.findElement(By.id("chkFirm"));
		this.officePhonePart1 = driver.findElement(By.id("ucContact_ucContactRight_txtFirmPH1"));
		this.officePhonePart2 = driver.findElement(By.id("ucContact_ucContactRight_txtFirmPH2"));
		this.officePhonePart3 = driver.findElement(By.id("ucContact_ucContactRight_txtFirmPH3"));
		this.officeFaxPart1 = driver.findElement(By.id("ucContact_ucContactRight_txtFirmFax1"));
		this.officeFaxPart2 = driver.findElement(By.id("ucContact_ucContactRight_txtFirmFax2"));
		this.officeFaxPart3 = driver.findElement(By.id("ucContact_ucContactRight_txtFirmFax3"));
		this.officeEmail1 = driver.findElement(By.id("ucContact_ucContactRight_txtFirmEM"));
		this.officeEmail2 = driver.findElement(By.id("ucContact_ucContactRight_txtEMCSR"));
		this.officeAddress1 = driver.findElement(By.id("ucContact_ucContactRight_txtFirmADR1"));
		this.officeAddress2 = driver.findElement(By.id("ucContact_ucContactRight_txtFirmADR2"));
		this.officeAddressCity = driver.findElement(By.id("ucContact_ucContactRight_txtFirmCity"));
		this.officeAddressState = driver.findElement(By.id("ucContact_ucContactRight_cboFirmST"));
		this.officeAddressZipcode = driver.findElement(By.id("ucContact_ucContactRight_txtFirmZip"));
		this.officeAddressCounty = driver.findElement(By.id("ucContact_ucContactRight_txtFirmCounty"));
		}
	public void setSameMailingChbx(String value) {
		PageUtilities.setCheckBox(value, this.sameMailingChbx);
	}
	
	public void setOfficePhone(String phoneNum) {
		// phone number is in the format of 123-456-3845
		if (PageUtilities.valueNotEmpty(phoneNum)) {
			String[] phoneNumArray = phoneNum.split("-");
			this.setOfficePhonePart1(phoneNumArray[0]);
			this.setOfficePhonePart2(phoneNumArray[1]);
			this.setOfficePhonePart3(phoneNumArray[2]);
		}
	}

	/**
	 * @param phoneText the phoneText to set
	 */
	public void setOfficePhonePart1(String officePhonePart1) {
		PageUtilities.setInputText(this.officePhonePart1, officePhonePart1);
		
	}

	/**
	 * @param phoneText the phoneText to set
	 */
	public void setOfficePhonePart2(String officePhonePart2) {
		
		PageUtilities.setInputText(this.officePhonePart2, officePhonePart2);

	}

	/**
	 * @param phoneText the phoneText to set
	 */
	public void setOfficePhonePart3(String officePhonePart3) {
		PageUtilities.setInputText(this.officePhonePart3, officePhonePart3);

	}
	
	public void setOfficeFax(String faxNum) {
		// phone number is in the format of 123-456-3845
		if (PageUtilities.valueNotEmpty(faxNum)) {
			String[] faxNumArray = faxNum.split("-");
			this.setOfficeFaxPart1(faxNumArray[0]);
			this.setOfficeFaxPart2(faxNumArray[1]);
			this.setOfficeFaxPart3(faxNumArray[2]);
		}
	}

	/**
	 * @param phoneText the phoneText to set
	 */
	public void setOfficeFaxPart1(String officeFaxPart1) {
		PageUtilities.setInputText(this.officeFaxPart1, officeFaxPart1);
		
	}

	/**
	 * @param phoneText the phoneText to set
	 */
	public void setOfficeFaxPart2(String officeFaxPart2) {
		
		PageUtilities.setInputText(this.officeFaxPart2, officeFaxPart2);

	}

	/**
	 * @param phoneText the phoneText to set
	 */
	public void setOfficeFaxPart3(String officeFaxPart3) {
		PageUtilities.setInputText(this.officeFaxPart3, officeFaxPart3);

	}
	
	public void setOfficeEmail1(String officeEmail1) {
		PageUtilities.setInputText(this.officeEmail1, officeEmail1);
	}
	
	public void setOfficeEmail2(String officeEmail2) {
		PageUtilities.setInputText(this.officeEmail2, officeEmail2);
	}
	
	public void setOfficeAddress1(String officeAddress1) {
		PageUtilities.setInputText(this.officeAddress1, officeAddress1);
	}
	public void setOfficeAddress2(String officeAddress2) {
		PageUtilities.setInputText(this.officeAddress2, officeAddress2);
	}
	
	public void setOfficeAddressCity(String officeAddressCity) {
		PageUtilities.setInputText(this.officeAddressCity, officeAddressCity);
	}
	public void setOfficeAddressStateDropDown(String officeAddressstateDropDown) {
		PageUtilities.setDropDown(this.officeAddressState, officeAddressstateDropDown);
	}
	public void setOfficeAddressZipcode(String officeAddressZipcode) {
		PageUtilities.setInputText(this.officeAddressZipcode, officeAddressZipcode);
	}
	
	public void setOfficeAddressCounty(String officeAddressCounty) {
		PageUtilities.setInputText(this.officeAddressCounty, officeAddressCounty);
	}

}
