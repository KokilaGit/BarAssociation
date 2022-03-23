package com.contracosta.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddMemberContact {
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
	WebElement conactTypeEmailRadioBtn;
	WebElement magazineRadioBtn;
	WebElement eventBroadcastRadioBtn;
	WebElement committeBroadcastRadioBtn;
	WebElement mailingOptionRadioBtn;
	WebElement firmNameRadioBtn;
	WebElement dateText;
	WebElement stateAdmittedText;
	WebElement dateAdmittedText;
	WebElement pwdText;
	WebElement nextBtn;

	public AddMemberContact(WebDriver driver) throws InterruptedException {
		super();
		this.driver = driver;
		// Locating the Main Menu (Parent element)
		WebElement mainMenu = driver.findElement(By.id("ucTopNavHomeBar_lnkAAM"));

		// Instantiating Actions class
		Actions actions = new Actions(driver);

		// Hovering on main menu
		actions.moveToElement(mainMenu).build().perform();
		

		// Locating the element from Sub Menu
		WebElement subMenu = driver.findElement(By.xpath("//*[@id='ucTopNavHomeBar_limemAddMember']"));

		// To mouseover on sub menu
		actions.moveToElement(subMenu);
		actions.click().build().perform();
		this.salutationDropdown = driver.findElement(By.id("ucContact_cboSalut"));
		this.firstNameText = driver.findElement(By.id("ucContact_txtFN"));
		this.initialTxt= driver.findElement(By.id("ucContact_txtMN"));
		this.lastNameText = driver.findElement(By.id("ucContact_txtLN"));
		this.nickNameText = driver.findElement(By.id("ucContact_txtNickName"));
		this.suffixDropDown = driver.findElement(By.id("ucContact_cboSuffix"));
		this.dobMonthDropDown = driver.findElement(By.id("ucContact_dtPicker_cboMM"));
		this.dobDateDropDown = driver.findElement(By.id("ucContact_dtPicker_cboDD"));
		this.dobYearDropDown = driver.findElement(By.id("ucContact_dtPicker_cboYY"));
		this.ethnicity = driver.findElement(By.id("ucContact_cboRace"));
		this.genderDropDown = driver.findElement(By.id("ucContact_cboGender"));
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
		this.conactTypeEmailRadioBtn = driver.findElement(By.id("ucContact_optEmail"));
		this.magazineRadioBtn = driver.findElement(By.id("ucContact_optUSEmail"));
		this.eventBroadcastRadioBtn = driver.findElement(By.id("ucContact_optDirectoryY"));
		this.committeBroadcastRadioBtn = driver.findElement(By.id("ucContact_optCommitteeEBY"));
		this.mailingOptionRadioBtn = driver.findElement(By.id("ucContact_optMailY"));
		this.firmNameRadioBtn = driver.findElement(By.id("ucContact_optFirmNo"));
		this.dateText = driver.findElement(By.id("ucContact_txtFirstAdmitPracticeDt"));
		this.stateAdmittedText = driver.findElement(By.id("ucContact_cboBarST"));
		this.dateAdmittedText = driver.findElement(By.id("ucContact_txtBarAdmDt"));
		this.pwdText = driver.findElement(By.id("ucContact_txtPWD"));
		this.nextBtn = driver.findElement(By.id("cmdNext"));

	}

	/**
	 * @param salutationDropdown the salutationDropdown to set
	 */
	public void setSalutationDropdown(String salutationDropdownTxt) {
		this.salutationDropdown.click();
		Select select1 = new Select(salutationDropdown);	
		//select1.selectByValue("1");
		select1.selectByVisibleText(salutationDropdownTxt);
	}

	/**
	 * @return the dateText
	 */
	public WebElement getDateText() {
		return dateText;
	}

	/**
	 * @param dateText the dateText to set
	 */
	public void setDateText(String dateText) {
		this.dateText.sendKeys(dateText);
	}

	/**
	 * @param firstNameText the firstNameText to set
	 */
	public void setFirstNameText(String firstNameText) {
		this.firstNameText.clear();
		this.firstNameText.sendKeys(firstNameText);
	}
	/**
	 * @param initialTxt the initialTxt to set
	 */
	public void setInitialTxt(String initialTxt) {
		this.initialTxt.clear();
		this.initialTxt.sendKeys(initialTxt);
	}

	/**
	 * @param lastNameText the lastNameText to set
	 */
	public void setLastNameText(String lastNameText) {
		this.lastNameText.clear();
		this.lastNameText.sendKeys(lastNameText);
	}
	/**
	 * @param nickNameText the nickNameText to set
	 */
	public void setnickNameText(String nickNameText) {
		this.nickNameText.clear();
		this.nickNameText.sendKeys(nickNameText);
	}
	/**
	 * @param salutationDropdown the salutationDropdown to set
	 */
	public void setSuffixDropdown(String suffixDropdownTxt) {
		this.suffixDropDown.click();
		Select select1 = new Select(suffixDropDown);	
		select1.selectByVisibleText(suffixDropdownTxt);
	}
	 /** 
	  * @param dobMonthDropdown the dobMonthDropdown to set
	 */
	public void setdobMonthDropdown(String dobMonthDropdownTxt) {
		this.dobMonthDropDown.click();
		Select select1 = new Select(dobMonthDropDown);	
		select1.selectByVisibleText(dobMonthDropdownTxt);
	}
	 /** 
	  * @param dobDateDropdown the dobDateDropdown to set
	 */
	public void setdobDateDropdown(String dobDateDropdownTxt) {
		this.dobDateDropDown.click();
		Select select1 = new Select(dobDateDropDown);	
		select1.selectByVisibleText(dobDateDropdownTxt);
	}
	 /** 
	  * @param dobYearDropdown the dobYearDropdown to set
	 */
	public void setdobYearDropdown(String dobYearDropdownTxt) {
		this.dobYearDropDown.click();
		Select select1 = new Select(dobYearDropDown);	
		select1.selectByVisibleText(dobYearDropdownTxt);
	}
	

	/**
	 * @param ethnicity the ethnicity to set
	 */
	public void setEthnicity(String ethnicitySelect) {
		this.ethnicity.click();
		Select select = new Select(ethnicity);
		select.selectByVisibleText(ethnicitySelect);
	}
	

	/**
	 * @param genderDropDown the genderDropDown to set
	 */
	public void setGenderDropDown(String genderDropDownselect) {
		this.genderDropDown.click(); 
		Select select = new Select(genderDropDown);
		select.selectByVisibleText(genderDropDownselect);

	}

	/**
	 * @param phoneText the phoneText to set
	 */
	public void setphone1Part1(String phone1Part1) {
		this.phone1Part1.clear();
		this.phone1Part1.sendKeys(phone1Part1);	
		
	}

	/**
	 * @param phoneText the phoneText to set
	 */
	public void setphone1Part2(String phone1Part2) {
		this.phone1Part2.clear();
		this.phone1Part2.sendKeys(phone1Part2);
		
	}

	/**
	 * @param phoneText the phoneText to set
	 */
	public void setphone1Part3(String phone1Part3) {
		this.phone1Part3.clear();
		this.phone1Part3.sendKeys(phone1Part3);
		
	}
	/**
	 * @param phoneText the phoneText to set
	 */
	public void setphone2Part1(String phone2Part1) {
		this.phone2Part1.clear();
		this.phone2Part1.sendKeys(phone2Part1);	
		
	}

	/**
	 * @param phoneText the phoneText to set
	 */
	public void setphone2Part2(String phone2Part2) {
		this.phone2Part2.clear();
		this.phone2Part2.sendKeys(phone2Part2);
		
	}

	/**
	 * @param phoneText the phoneText to set
	 */
	public void setphone2Part3(String phone2Part3) {
		this.phone2Part3.clear();
		this.phone2Part3.sendKeys(phone2Part3);
		
	}
	/**
	 * @param cellText the cellText to set
	 */
	public void setcellPart1(String cellPart1) {
		
		this.cellPart1.sendKeys(cellPart1);	
		
	}

	/**
	 * @param cellText the cellText to set
	 */
	public void setcellPart2(String cellPart2) {
		
		this.cellPart2.sendKeys(cellPart2);
		
	}

	/**
	 * @param cellText the cellText to set
	 */
	public void setcellPart3(String cellPart3) {
		
		this.cellPart3.sendKeys(cellPart3);
		
	}
	/**
	 * @param faxText the faxText to set
	 */
	public void setfaxPart1(String faxPart1) {
		
		this.faxPart1.sendKeys(faxPart1);	
		
	}

	/**
	 * @param faxText the faxText to set
	 */
	public void setfaxPart2(String faxPart2) {
		
		this.faxPart2.sendKeys(faxPart2);
		
	}

	/**
	 * @param faxText the faxText to set
	 */
	public void setfaxPart3(String faxPart3) {
		
		this.faxPart3.sendKeys(faxPart3);
		
	}


	/**
	 * @param emailText the emailText to set
	 */
	public void setEmailText(String emailText) {
		this.emailText.clear();
		this.emailText.sendKeys(emailText);
	}

	/**
	 * @param address1Text the address1Text to set
	 */
	public void setAddress1Text(String address1Text) {
		this.address1Text.clear();
		this.address1Text.sendKeys(address1Text);
	}
	/**
	 * @param address1Text the address1Text to set
	 */
	public void setAddress2Text(String address2Text) {
		this.address2Text.clear();
		this.address2Text.sendKeys(address2Text);
	}

	/**
	 * @return the cityText
	 */
	public WebElement getCityText() {
		return cityText;
	}

	/**
	 * @param cityText the cityText to set
	 */
	public void setCityText(String cityText) {
		this.cityText.clear();
		this.cityText.sendKeys(cityText);
	}

	/**
	 * @return the stateDropDown
	 */
	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	/**
	 * @param stateDropDown the stateDropDown to set
	 */
	public void setStateDropDown(String stateDropDown) {
		Select state = new Select(this.stateDropDown);
		state.selectByVisibleText(stateDropDown);

	}

	

	/**
	 * @param zipcodeText the zipcodeText to set
	 */
	public void setZipcodeText(String zipcodeText) {
		this.zipcodeText.clear();
		this.zipcodeText.sendKeys(zipcodeText);
	}
	/**
	 * @param websiteText the websiteText to set
	 */
	public void setwebsiteText(String websiteText) {
		this.websiteText.clear();
		this.websiteText.sendKeys(websiteText);
	}

	

	/**
	 * @param attorneyRadioBtn the attorneyRadioBtn to set
	 */
	public void setAttorneyYesRadioBtn() {
		this.attorneyYesRadioBtn.click();
	}

	/**
	 * @return the conactTypeRadioBtn
	 */
	public WebElement getConactTypeEmailRadioBtn() {
		return conactTypeEmailRadioBtn;
	}

	/**
	 * @param conactTypeRadioBtn the conactTypeRadioBtn to set
	 */
	public void setConactTypeEmailRadioBtn() {
		this.conactTypeEmailRadioBtn.click();
	}

	/**
	 * @return the magazineRadioBtn
	 */
	public WebElement getMagazineRadioBtn() {
		return magazineRadioBtn;
	}

	/**
	 * @param magazineRadioBtn the magazineRadioBtn to set
	 */
	public void setMagazineRadioBtn() {
		this.magazineRadioBtn.click();
	}

	/**
	 * @return the eventBroadcastRadioBtn
	 */
	public WebElement getEventBroadcastRadioBtn() {
		return eventBroadcastRadioBtn;
	}

	/**
	 * @param eventBroadcastRadioBtn the eventBroadcastRadioBtn to set
	 */
	public void setEventBroadcastRadioBtn() {
		this.eventBroadcastRadioBtn.click();
	}

	/**
	 * @return the committeBroadcastRadioBtn
	 */
	public WebElement getCommitteBroadcastRadioBtn() {
		return committeBroadcastRadioBtn;
	}

	/**
	 * @param committeBroadcastRadioBtn the committeBroadcastRadioBtn to set
	 */
	public void setCommitteBroadcastRadioBtn() {
		this.committeBroadcastRadioBtn.click();
	}

	/**
	 * @return the mailingOptionRadioBtn
	 */
	public WebElement getMailingOptionRadioBtn() {
		return mailingOptionRadioBtn;
	}

	/**
	 * @param mailingOptionRadioBtn the mailingOptionRadioBtn to set
	 */
	public void setMailingOptionRadioBtn() {
		this.mailingOptionRadioBtn.click();
	}

	/**
	 * @return the firmNameRadioBtn
	 */
	public WebElement getFirmNameRadioBtn() {
		return firmNameRadioBtn;
	}

	/**
	 * @param firmNameRadioBtn the firmNameRadioBtn to set
	 */
	public void setFirmNameRadioBtn() {
		this.firmNameRadioBtn.click();
	}
	
	public void setstateAdmittedText() {
		this.stateAdmittedText.click();
	}
	
	public void setdateAdmittedText(String dateAdmittedText) {
		this.dateAdmittedText.sendKeys(dateAdmittedText);
	}
	
	public void setpwdText(String pwdText) {
		this.pwdText.sendKeys(pwdText);
	}

	/**
	 * @return the nextBtn
	 */
	public WebElement getNextBtn() {
		return nextBtn;
	}

	/**
	 * @param nextBtn the nextBtn to set
	 */
	public void setNextBtn() {
		this.nextBtn.click();
	}

}
