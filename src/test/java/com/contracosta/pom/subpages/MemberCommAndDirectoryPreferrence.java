package com.contracosta.pom.subpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.contracosta.pom.utils.PageUtilities;

public class MemberCommAndDirectoryPreferrence {
	
	WebDriver driver;
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
	
	public MemberCommAndDirectoryPreferrence(WebDriver driver) throws InterruptedException {
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
			this.setContactMailRadioBtn();
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


}
