package com.contracosta.pom.subpages.Contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.contracosta.pom.utils.PageUtilities;

public class MemeberContactMemberInfo {
	WebDriver driver;
	WebElement salutationDropdown;
	WebElement firstNameText;
	WebElement initialTxt;
	WebElement lastNameText;
	WebElement nickNameText;
	WebElement suffixDropDown;
	WebElement dobMonthDropDown;
	WebElement dobDateDropDown;
	WebElement dobYearDropDown;
	WebElement ethnicity;
	WebElement genderDropDown;
	WebElement country;
	WebElement phone1Part1;
	WebElement phone1Part2;
	WebElement phone1Part3;
	WebElement phone2Part1;
	WebElement phone2Part2;
	WebElement phone2Part3;
	WebElement cellPart1;
	WebElement cellPart2;
	WebElement cellPart3;
	WebElement faxPart1;
	WebElement faxPart2;
	WebElement faxPart3;
	WebElement extText;
	WebElement emailText;
	WebElement address1Text;
	WebElement address2Text;
	WebElement cityText;
	WebElement stateDropDown;
	WebElement zipcodeText;
	WebElement websiteText;
	WebElement attorneyYesRadioBtn;
	WebElement attorneyNoRadioBtn;

	public MemeberContactMemberInfo(WebDriver driver)  {
		super();
		this.driver = driver;
		this.salutationDropdown = driver.findElement(By.id("ucContact_cboSalut"));
		this.firstNameText = driver.findElement(By.id("ucContact_txtFN"));
		this.initialTxt = driver.findElement(By.id("ucContact_txtMN"));
		this.lastNameText = driver.findElement(By.id("ucContact_txtLN"));
		this.nickNameText = driver.findElement(By.id("ucContact_txtNickName"));
		this.suffixDropDown = driver.findElement(By.id("ucContact_cboSuffix"));
		this.dobMonthDropDown = driver.findElement(By.id("ucContact_dtPicker_cboMM"));
		this.dobDateDropDown = driver.findElement(By.id("ucContact_dtPicker_cboDD"));
		this.dobYearDropDown = driver.findElement(By.id("ucContact_dtPicker_cboYY"));
		this.ethnicity = driver.findElement(By.id("ucContact_cboRace"));
		this.genderDropDown = driver.findElement(By.id("ucContact_cboGender"));
		this.country = driver.findElement(By.id("ucContact_cboCountry"));
		this.phone1Part1 = driver.findElement(By.id("ucContact_ucContactLeft_txtPH1"));
		this.phone1Part2 = driver.findElement(By.id("ucContact_ucContactLeft_txtPH2"));
		this.phone1Part3 = driver.findElement(By.id("ucContact_ucContactLeft_txtPH3"));
		this.phone2Part1 = driver.findElement(By.id("ucContact_ucContactLeft_txtPH21"));
		this.phone2Part2 = driver.findElement(By.id("ucContact_ucContactLeft_txtPH22"));
		this.phone2Part3 = driver.findElement(By.id("ucContact_ucContactLeft_txtPH23"));
		this.cellPart1 = driver.findElement(By.id("ucContact_ucContactLeft_txtCell1"));
		this.cellPart2 = driver.findElement(By.id("ucContact_ucContactLeft_txtCell2"));
		this.cellPart3 = driver.findElement(By.id("ucContact_ucContactLeft_txtCell3"));
		this.faxPart1 = driver.findElement(By.id("ucContact_ucContactLeft_txtFax1"));
		this.faxPart2 = driver.findElement(By.id("ucContact_ucContactLeft_txtFax2"));
		this.faxPart3 = driver.findElement(By.id("ucContact_ucContactLeft_txtFax3"));
		this.extText = driver.findElement(By.id("ucContact_ucContactLeft_txtExt"));
		this.emailText = driver.findElement(By.id("ucContact_ucContactLeft_txtEM"));
		this.address1Text = driver.findElement(By.id("ucContact_ucContactLeft_txtADR1"));
		this.address2Text = driver.findElement(By.id("ucContact_ucContactLeft_txtADR2"));
		this.cityText = driver.findElement(By.id("ucContact_ucContactLeft_txtCity"));
		this.stateDropDown = driver.findElement(By.id("ucContact_ucContactLeft_cboST"));
		this.zipcodeText = driver.findElement(By.id("ucContact_ucContactLeft_txtZip"));
		this.websiteText = driver.findElement(By.id("ucContact_txtWeb"));
		this.attorneyYesRadioBtn = driver.findElement(By.id("ucContact_optAttorneyYes"));
		this.attorneyNoRadioBtn = driver.findElement(By.id("ucContact_optAttorneyNo"));
	}

	/**
	 * @param salutationDropdown the salutationDropdown to set
	 */
	public void setSalutationDropdown(String salutationDropdownTxt) {

		PageUtilities.setDropDown(this.salutationDropdown, salutationDropdownTxt);
	}

	/**
	 * @param firstNameText the firstNameText to set
	 */
	public void setFirstNameText(String firstNameText) {
		PageUtilities.setInputText(this.firstNameText, firstNameText);
	}

	/**
	 * @param initialTxt the initialTxt to set
	 */
	public void setInitialTxt(String initialTxt) {
		PageUtilities.setInputText(this.initialTxt, initialTxt);
	}

	/**
	 * @param lastNameText the lastNameText to set
	 */
	public void setLastNameText(String lastNameText) {
		PageUtilities.setInputText(this.lastNameText, lastNameText);
	}

	/**
	 * @param nickNameText the nickNameText to set
	 */
	public void setnickNameText(String nickNameText) {
		PageUtilities.setInputText(this.nickNameText, nickNameText);
	}

	/**
	 * @param salutationDropdown the salutationDropdown to set
	 */
	public void setSuffixDropdown(String suffixDropdownTxt) {
		PageUtilities.setDropDown(this.suffixDropDown, suffixDropdownTxt);
	}

	public void setDateOfBirth(String dob) {
		if (PageUtilities.valueNotEmpty(dob)) {
			String[] dobArray = dob.split("/");
			this.setdobMonthDropdown(dobArray[0]);
			this.setdobDateDropdown(dobArray[1]);
			this.setdobYearDropdown(dobArray[2]);
		}
	}

	/**
	 * @param dobMonthDropdown the dobMonthDropdown to set
	 */
	public void setdobMonthDropdown(String dobMonthDropdownTxt) {
		PageUtilities.setDropDown(this.dobMonthDropDown, dobMonthDropdownTxt);
	}

	/**
	 * @param dobDateDropdown the dobDateDropdown to set
	 */
	public void setdobDateDropdown(String dobDateDropdownTxt) {
		PageUtilities.setDropDown(this.dobDateDropDown, dobDateDropdownTxt);
	}

	/**
	 * @param dobYearDropdown the dobYearDropdown to set
	 */
	public void setdobYearDropdown(String dobYearDropdownTxt) {
		PageUtilities.setDropDown(this.dobYearDropDown, dobYearDropdownTxt);
	}

	/**
	 * @param ethnicity the ethnicity to set
	 */
	public void setEthnicity(String ethnicitySelect) {
		PageUtilities.setDropDown(this.ethnicity, ethnicitySelect);
	}

	/**
	 * @param genderDropDown the genderDropDown to set
	 */
	public void setGenderDropDown(String genderDropDownselect) {
		PageUtilities.setDropDown(this.genderDropDown, genderDropDownselect);
	}

	/**
	 * @param countryDropDown the countryDropDownText to set
	 */
	public void setCountryDropDown(String countryDropDownSelect) {
		PageUtilities.setDropDown(this.country, countryDropDownSelect);

	}

	public void setPhone1(String phoneNum) {
		// phone number is in the format of 123-456-3845
		if (PageUtilities.valueNotEmpty(phoneNum)) {
			String[] phoneNumArray = phoneNum.split("-");
			this.setphone1Part1(phoneNumArray[0]);
			this.setphone1Part2(phoneNumArray[1]);
			this.setphone1Part3(phoneNumArray[2]);
		}
	}

	/**
	 * @param phoneText the phoneText to set
	 */
	public void setphone1Part1(String phone1Part1) {
		PageUtilities.setInputText(this.phone1Part1, phone1Part1);
	}

	/**
	 * @param phoneText the phoneText to set
	 */
	public void setphone1Part2(String phone1Part2) {
		PageUtilities.setInputText(this.phone1Part2, phone1Part2);
	}

	/**
	 * @param phoneText the phoneText to set
	 */
	public void setphone1Part3(String phone1Part3) {
		PageUtilities.setInputText(this.phone1Part3, phone1Part3);
	}

	public void setPhone2(String phoneNum) {
		// phone number is in the format of 123-456-3845
		if (PageUtilities.valueNotEmpty(phoneNum)) {
			String[] phoneNumArray = phoneNum.split("-");
			this.setphone2Part1(phoneNumArray[0]);
			this.setphone2Part2(phoneNumArray[1]);
			this.setphone2Part3(phoneNumArray[2]);
		}
	}

	/**
	 * @param phoneText the phoneText to set
	 */
	public void setphone2Part1(String phone2Part1) {
		PageUtilities.setInputText(this.phone2Part1, phone2Part1);
	}

	/**
	 * @param phoneText the phoneText to set
	 */
	public void setphone2Part2(String phone2Part2) {
		PageUtilities.setInputText(this.phone2Part2, phone2Part2);

	}

	/**
	 * @param phoneText the phoneText to set
	 */
	public void setphone2Part3(String phone2Part3) {
		PageUtilities.setInputText(this.phone2Part3, phone2Part3);

	}

	public void setCell(String cellNum) {
		// phone number is in the format of 123-456-3845
		if (PageUtilities.valueNotEmpty(cellNum)) {
		String[] cellNumArray = cellNum.split("-");
		this.setcellPart1(cellNumArray[0]);
		this.setcellPart2(cellNumArray[1]);
		this.setcellPart3(cellNumArray[2]);
		}
	}

	/**
	 * @param cellText the cellText to set
	 */
	public void setcellPart1(String cellPart1) {
		PageUtilities.setInputText(this.cellPart1, cellPart1);

	}

	/**
	 * @param cellText the cellText to set
	 */
	public void setcellPart2(String cellPart2) {
		PageUtilities.setInputText(this.cellPart2, cellPart2);

	}

	/**
	 * @param cellText the cellText to set
	 */
	public void setcellPart3(String cellPart3) {
		PageUtilities.setInputText(this.cellPart3, cellPart3);

	}

	public void setFax(String faxNum) {
		// phone number is in the format of 123-456-3845
		if (PageUtilities.valueNotEmpty(faxNum)) {
		String[] faxNumArray = faxNum.split("-");
		this.setfaxPart1(faxNumArray[0]);
		this.setfaxPart2(faxNumArray[1]);
		this.setfaxPart3(faxNumArray[2]);
		}
	}

	/**
	 * @param faxText the faxText to set
	 */
	public void setfaxPart1(String faxPart1) {
		PageUtilities.setInputText(this.faxPart1, faxPart1);

	}

	/**
	 * @param faxText the faxText to set
	 */
	public void setfaxPart2(String faxPart2) {
		PageUtilities.setInputText(this.faxPart2, faxPart2);

	}

	/**
	 * @param faxText the faxText to set
	 */
	public void setfaxPart3(String faxPart3) {
		PageUtilities.setInputText(this.faxPart3, faxPart3);

	}

	/**
	 * @param emailText the emailText to set
	 */
	public void setEmailText(String emailText) {
		PageUtilities.setInputText(this.emailText, emailText);
	}

	/**
	 * @param address1Text the address1Text to set
	 */
	public void setAddress1Text(String address1Text) {
		PageUtilities.setInputText(this.address1Text, address1Text);
	}

	/**
	 * @param address1Text the address1Text to set
	 */
	public void setAddress2Text(String address2Text) {
		PageUtilities.setInputText(this.address2Text, address2Text);
	}

	/**
	 * @param cityText the cityText to set
	 */
	public void setCityText(String cityText) {
		PageUtilities.setInputText(this.cityText, cityText);
	}

	/**
	 * @param stateDropDown the stateDropDown to set
	 */
	public void setStateDropDown(String stateDropDown) {
		PageUtilities.setDropDown(this.stateDropDown, stateDropDown);
	}

	/**
	 * @param zipcodeText the zipcodeText to set
	 */
	public void setZipcodeText(String zipcodeText) {
		PageUtilities.setInputText(this.zipcodeText, zipcodeText);
	}

	/**
	 * @param websiteText the websiteText to set
	 */
	public void setwebsiteText(String websiteText) {
		PageUtilities.setInputText(this.websiteText, websiteText);
	}

	public void setAttorney(String value) {

		switch (value.toLowerCase()) {
		case "yes":
			this.setAttorneyYesRadioBtn();
			break;
		case "no":
			this.setAttorneyNoRadioBtn();
			break;
		default:

			break;
		}

	}

	/**
	 * @param attorneyRadioBtn the attorneyRadioBtn to set
	 */
	public void setAttorneyYesRadioBtn() {
		this.attorneyYesRadioBtn.click();
	}

	public void setAttorneyNoRadioBtn() {
		this.attorneyNoRadioBtn.click();
	}

}
