package com.contracosta.pom;

import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.contracosta.pom.utils.PageUtilities;

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
	
	WebElement memberId;
	WebElement imisTxt;
	WebElement notesTxt;
	
	WebElement publishNameOnlinechbx;
	WebElement publishNamePrintchbx;
	WebElement publishEmailOnlinechbx;
	WebElement publishEmailPrintchbx;
	WebElement publishPhoneOnlinechbx;
	WebElement publishPhonePrintchbx;
	WebElement publishPhotoOnlinechbx;
	WebElement publishPhotoPrintchbx;
	WebElement publishBioOnlinechbx;
	WebElement publishBioPrintchbx;
	WebElement conactEmailRadioBtn;
	WebElement conactPhoneRadioBtn;
	WebElement conactFaxRadioBtn;
	WebElement conactMailRadioBtn;
	WebElement magazineOnlineRadioBtn;
	WebElement magazineMailRadioBtn;
	WebElement magazineNoneRadioBtn;
	WebElement eventBroadcastYesRadioBtn;
	WebElement eventBroadcastNoRadioBtn;
	WebElement committeBroadcastYesRadioBtn;
	WebElement committeBroadcastNoRadioBtn;
	WebElement mailingOptionYesRadioBtn;
	WebElement mailingOptionNoRadioBtn;
	WebElement stuWantMentorChbx;
	WebElement attWantMentorChbx;
	WebElement mentorToStuChbx;
	WebElement menToAttorneyChbx;
	
	WebElement moduleField;
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
		this.memberId = driver.findElement(By.id("ucContact_txtUQIDTitle"));
		this.imisTxt = driver.findElement(By.id("ucContact_txtIMIS"));
		this.notesTxt = driver.findElement(By.id("ucContact_txtNote"));
		this.publishNameOnlinechbx = driver.findElement(By.id("ucContact_chkMyListingO"));
		this.publishNamePrintchbx = driver.findElement(By.id("ucContact_chkMyListingP"));
		this.publishEmailOnlinechbx = driver.findElement(By.id("ucContact_chkMyEmailAddressO"));
		this.publishEmailPrintchbx = driver.findElement(By.id("ucContact_chkMyEmailAddressP"));
		this.publishPhoneOnlinechbx = driver.findElement(By.id("ucContact_chkMyPhoneNumberO"));
		this.publishPhonePrintchbx = driver.findElement(By.id("ucContact_chkMyPhoneNumberP"));
		this.publishPhotoOnlinechbx = driver.findElement(By.id("ucContact_chkMyPhotoO"));
		this.publishPhotoPrintchbx = driver.findElement(By.id("ucContact_chkMyPhotoP"));
		this.publishBioOnlinechbx = driver.findElement(By.id("ucContact_chkMyBIOO"));
		this.publishBioPrintchbx = driver.findElement(By.id("ucContact_chkMyBIOP"));
		this.conactEmailRadioBtn = driver.findElement(By.id("ucContact_optEmail"));
		this.conactPhoneRadioBtn = driver.findElement(By.id("ucContact_optPhone"));
		this.conactFaxRadioBtn = driver.findElement(By.id("ucContact_optFax"));
		this.conactMailRadioBtn = driver.findElement(By.id("ucContact_optUSmail"));
		this.magazineOnlineRadioBtn = driver.findElement(By.id("ucContact_optDownload"));
		this.magazineMailRadioBtn = driver.findElement(By.id("ucContact_optUSEmail"));
		this.magazineNoneRadioBtn = driver.findElement(By.id("ucContact_optNone"));
		this.eventBroadcastYesRadioBtn = driver.findElement(By.id("ucContact_optDirectoryY"));
		this.eventBroadcastNoRadioBtn = driver.findElement(By.id("ucContact_optDirectoryN"));
		this.committeBroadcastYesRadioBtn = driver.findElement(By.id("ucContact_optCommitteeEBY"));
		this.committeBroadcastNoRadioBtn = driver.findElement(By.id("ucContact_optCommitteeEBN"));
		this.mailingOptionYesRadioBtn = driver.findElement(By.id("ucContact_optMailY"));
		this.mailingOptionNoRadioBtn = driver.findElement(By.id("ucContact_optMailN"));
		this.stuWantMentorChbx = driver.findElement(By.id("ucContact_chkSMentor"));
		this.attWantMentorChbx = driver.findElement(By.id("ucContact_chkAMentor"));
		this.mentorToStuChbx = driver.findElement(By.id("ucContact_chkASMentor"));
		this.menToAttorneyChbx = driver.findElement(By.id("ucContact_chkAAMentor"));
		this.moduleField = driver.findElement(By.id("CF_25"));
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
		// select1.selectByValue("1");
		select1.selectByVisibleText(salutationDropdownTxt);
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
	public void setDateOfBirth(String dob) {
		String[] dobArray = dob.split("/");
		this.setdobMonthDropdown(dobArray[0]);
		this.setdobDateDropdown(dobArray[1]);
		this.setdobYearDropdown(dobArray[2]);
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
	 * @param countryDropDown the countryDropDownText to set
	 */
	public void setCountryDropDown(String countryDropDownSelect) {
		this.country.click();
		Select select = new Select(country);
		select.selectByVisibleText(countryDropDownSelect);

	}
	public void setPhone1(String phoneNum) {
		//phone number is in the format of 123-456-3845
		 String[] phoneNumArray = phoneNum.split("-");
		 this.setphone1Part1(phoneNumArray[0]);
		 this.setphone1Part2(phoneNumArray[1]);
		 this.setphone1Part3(phoneNumArray[2]);
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
	public void setPhone2(String phoneNum) {
		//phone number is in the format of 123-456-3845
		 String[] phoneNumArray = phoneNum.split("-");
		 this.setphone2Part1(phoneNumArray[0]);
		 this.setphone2Part2(phoneNumArray[1]);
		 this.setphone2Part3(phoneNumArray[2]);
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
	public void setCell(String cellNum) {
		//phone number is in the format of 123-456-3845
		 String[] cellNumArray = cellNum.split("-");
		 this.setcellPart1(cellNumArray[0]);
		 this.setcellPart2(cellNumArray[1]);
		 this.setcellPart3(cellNumArray[2]);
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
	public void setFax(String faxNum) {
		//phone number is in the format of 123-456-3845
		 String[] faxNumArray = faxNum.split("-");
		 this.setfaxPart1(faxNumArray[0]);
		 this.setfaxPart2(faxNumArray[1]);
		 this.setfaxPart3(faxNumArray[2]);
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
	 * @param cityText the cityText to set
	 */
	public void setCityText(String cityText) {
		this.cityText.clear();
		this.cityText.sendKeys(cityText);
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

	/**
	 * @param memberId the memberId to set
	 */
	public void setmemberId(String memberIdtxt) {
		this.memberId.sendKeys(memberIdtxt);
		;
	}

	/**
	 * @param imisTxt the imisTxt to set
	 */
	public void setimisTxt(String imisTxt) {
		this.imisTxt.sendKeys(imisTxt);
	}

	/**
	 * @param notesTxt the notesTxt to set
	 */
	public void setnotesTxt(String notesTxt) {
		this.notesTxt.sendKeys(notesTxt);
	}

	/**
	 * @param publishNameOnlinechbx the publishNameOnlinechbx to set
	 */
	public void setPublishNameOnlinechbx(String value) {
		PageUtilities.setCheckBox(value,this.publishNameOnlinechbx);
	}

	/**
	 * @param publishNamePrintchbx the publishNamePrintchbx to set
	 */
	public void setPublishNamePrintchbx(String value) {
		PageUtilities.setCheckBox(value,this.publishNamePrintchbx);
	}

	/**
	 * @param publishEmailOnlinechbx the publishEmailOnlinechbx to set
	 */
	public void setPublishEmailOnlinechbx(String value) {
		PageUtilities.setCheckBox(value,this.publishEmailOnlinechbx);
	}

	/**
	 * @param publishEmailPrintchbx the publishEmailPrintchbx to set
	 */
	public void setPublishEmailPrintchbx(String value) {
		PageUtilities.setCheckBox(value,this.publishEmailPrintchbx);
	}

	/**
	 * @param publishPhoneOnlinechbx the publishPhoneOnlinechbx to set
	 */
	public void setPublishPhoneOnlinechbx(String value) {
		PageUtilities.setCheckBox(value,this.publishPhoneOnlinechbx);
	}

	/**
	 * @param publishPhonePrintchbx the publishPhonePrintchbx to set
	 */
	public void setPublishPhonePrintchbx(String value) {
		PageUtilities.setCheckBox(value,this.publishPhonePrintchbx);
	}

	/**
	 * @param publishPhotoOnlinechbx the publishPhotoOnlinechbx to set
	 */
	public void setPublishPhotoOnlinechbx(String value) {
		PageUtilities.setCheckBox(value,this.publishPhotoOnlinechbx);
	}

	/**
	 * @param publishPhotoPrintchbx the publishPhotoPrintchbx to set
	 */
	public void setPublishPhotoPrintchbx(String value) {
		PageUtilities.setCheckBox(value,this.publishPhotoPrintchbx);
	}

	/**
	 * @param publishBioOnlinechbx the publishBioOnlinechbx to set
	 */
	public void setPublishBioOnlinechbx(String value) {
		PageUtilities.setCheckBox(value,this.publishBioOnlinechbx);
	}
	
	public void setPublishBioPrintchbx(String value) {
		PageUtilities.setCheckBox(value,this.publishBioPrintchbx);
	}

	
	public void setContactPrefference(String value) {

		switch (value.toLowerCase()) {
		case "email":
			this.setConactEmailRadioBtn();
			break;
		case "phone":
			this.setContactPhoneRadioBtn();
			break;
		case "fax":
			this.setContactFaxRadioBtn();
			break;
		case "mail":
			this.setAttorneyNoRadioBtn();
			break;	
		default:

			break;
		}

	}

	/**
	 * @param conactTypeRadioBtn the conactTypeRadioBtn to set
	 */
	public void setConactEmailRadioBtn() {
		this.conactEmailRadioBtn.click();
	}
	public void setContactPhoneRadioBtn() {
		this.conactPhoneRadioBtn.click();
	}
	public void setContactFaxRadioBtn() {
		this.conactFaxRadioBtn.click();
	}
	public void setContactMailRadioBtn() {
		this.conactMailRadioBtn.click();
	}
	

	public void setMagazinePrefference(String value) {

		switch (value.toLowerCase()) {
		case "online":
			this.setMagazineOnlineRadioBtn();
			break;
		case "mail":
			this.setMagazineMailRadioBtn();
			break;
		case "none":
			this.setMagazineNoneRadioBtn();
			break;
		default:

			break;
		}

	}


	/**
	 * @param magazineRadioBtn the magazineRadioBtn to set
	 */
	public void setMagazineOnlineRadioBtn() {
		this.magazineOnlineRadioBtn.click();
	}
	public void setMagazineMailRadioBtn() {
		this.magazineMailRadioBtn.click();
	}
	public void setMagazineNoneRadioBtn() {
		this.magazineNoneRadioBtn.click();
	}
	
	public void setEventBroadcast(String value) {

		switch (value.toLowerCase()) {
		case "yes":
			this.setEventBroadcastYesRadioBtn();
			break;
		case "no":
			this.setEventBroadcastNoRadioBtn();
			break;
		default:

			break;
		}

	}


	/**
	 * @param eventBroadcastRadioBtn the eventBroadcastRadioBtn to set
	 */
	public void setEventBroadcastYesRadioBtn() {
		this.eventBroadcastYesRadioBtn.click();
	}
	
	public void setEventBroadcastNoRadioBtn() {
		this.eventBroadcastNoRadioBtn.click();
	}
	
	
	public void setCommitteBroadcast(String value) {

		switch (value.toLowerCase()) {
		case "yes":
			this.setCommitteBroadcastYesRadioBtn();
			break;
		case "no":
			this.setCommitteBroadcastNoRadioBtn();
			break;
		default:

			break;
		}

	}
	
	/**
	 * @param committeBroadcastRadioBtn the committeBroadcastRadioBtn to set
	 */
	public void setCommitteBroadcastYesRadioBtn() {
		this.committeBroadcastYesRadioBtn.click();
	}
	
	public void setCommitteBroadcastNoRadioBtn() {
		this.committeBroadcastNoRadioBtn.click();
	}
	
	public void setMailingList(String value) {

		switch (value.toLowerCase()) {
		case "yes":
			this.setMailingOptionYesRadioBtn();
			break;
		case "no":
			this.setMailingOptionNoRadioBtn();
			break;
		default:

			break;
		}

	}

	/**
	 * @param mailingOptionRadioBtn the mailingOptionRadioBtn to set
	 */
	public void setMailingOptionYesRadioBtn() {
		this.mailingOptionYesRadioBtn.click();
	}
	
	public void setMailingOptionNoRadioBtn() {
		this.mailingOptionNoRadioBtn.click();
	}
	
	
	public void setStudentMentorCheckBox(String value)
	{
		PageUtilities.setCheckBox(value, this.stuWantMentorChbx);
		
	}


	/**
	 * @param attWantMentorChbx the attWantMentorChbx to set
	 */
	public void setAttWantMentorChbx(String value) {
		PageUtilities.setCheckBox(value,this.attWantMentorChbx);
	}

	/**
	 * @param mentorToStuChbx the mentorToStuChbx to set
	 */
	public void setMentorToStuChbx(String value) {
		PageUtilities.setCheckBox(value,this.mentorToStuChbx);
	}

	/**
	 * @param menToAttorneyChbx the menToAttorneyChbx to set
	 */
	public void setMenToAttorneyChbx(String value) {
		PageUtilities.setCheckBox(value,this.menToAttorneyChbx);
	}

	/**
	 * @param moduleField the moduleField to set
	 */
	public void setmoduleField(String moduleTxt) {
		this.moduleField.sendKeys(moduleTxt);
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
