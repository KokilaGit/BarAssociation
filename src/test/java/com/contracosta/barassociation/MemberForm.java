package com.contracosta.barassociation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.contracosta.pom.AddMemberContact;
import com.contracosta.pom.LanguageSelection;
import com.contracosta.pom.LoginPage;
import com.contracosta.pom.MembershipCategories;
import com.contracosta.pom.PaymentPage;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MemberForm extends DriverSetUp {

	@Test(dataProvider = "create",dataProviderClass= DataProviderMemberForm.class,priority = 1)
	public void loginTest(HashMap<String, String> data) throws InterruptedException {

		LoginPage login = new LoginPage(driver);

		login.setUserName(data.get("UserName"));
		login.setPassword(data.get("Password"));
		login.clickLogin();

	}

	@Test(dataProvider = "memberInfo",dataProviderClass= DataProviderMemberForm.class,priority = 2)
	public void contactForm(HashMap<String, String> data) throws InterruptedException {

		// build()- used to compile all the actions into a single step

		AddMemberContact contact = new AddMemberContact(driver);
		contact.setSalutationDropdown(data.get("Salutation"));
		contact.setFirstNameText(data.get("FirstName"));
		contact.setInitialTxt(data.get("Initial"));
		contact.setLastNameText(data.get("LastName"));
		contact.setnickNameText(data.get("NickName"));
		contact.setSuffixDropdown(data.get("Suffix"));
		contact.setDateOfBirth(data.get("DOB"));
		contact.setEthnicity(data.get("Ethnicity"));
		contact.setGenderDropDown(data.get("Gender"));
		contact.setCountryDropDown(data.get("Country"));
		contact.setPhone1(data.get("Phone1"));
		contact.setPhone2(data.get("Phone2"));
		contact.setCell(data.get("Cell"));
		contact.setFax(data.get("Fax"));
		contact.setEmailText(data.get("Email"));
		contact.setAddress1Text(data.get("Address1"));
		contact.setAddress2Text(data.get("Address2"));
		contact.setCityText(data.get("City"));
		contact.setStateDropDown(data.get("State"));
		contact.setZipcodeText(data.get("Zip"));
		contact.setwebsiteText(data.get("Website"));
		contact.setAttorney(data.get("Attorney"));
		
		contact.setpwdText(data.get("MemberPwd"));
		contact.setmemberId(data.get("MemberId"));
		contact.setimisTxt(data.get("IMIS"));
		contact.setnotesTxt(data.get("NotesText"));
		
		contact.setContactPrefference(data.get("ContactPrefference"));
		contact.setMagazinePrefference(data.get("MagazinePrefference"));
		contact.setEventBroadcast(data.get("EventBroadcastPrefference"));
		contact.setCommitteBroadcast(data.get("CommitteBroadcastPrefference"));
		contact.setMailingList(data.get("MailingOption"));
		contact.setPublishNameOnlinechbx(data.get("PublishNameOnline"));
		contact.setPublishNamePrintchbx(data.get("PublishNamePrint"));
		contact.setPublishEmailOnlinechbx(data.get("PublishEmailOnline"));
		contact.setPublishEmailPrintchbx(data.get("PublishEmailPrint"));
		contact.setPublishPhoneOnlinechbx(data.get("PublishPhoneOnline"));
		contact.setPublishPhonePrintchbx(data.get("PublishPhonePrint"));
		contact.setPublishPhotoOnlinechbx(data.get("PublishPhotoOnline"));
		contact.setPublishPhotoPrintchbx(data.get("PublishPhotoPrint"));
		contact.setPublishBioOnlinechbx(data.get("PublishBioOnline"));
		contact.setPublishBioPrintchbx(data.get("PublishBioPrint"));
		contact.setStudentMentorCheckBox(data.get("StudentMentor"));
		contact.setAttWantMentorChbx(data.get("AttorneyMentor"));
		contact.setMentorToStuChbx(data.get("MentorToStudent"));
		contact.setMenToAttorneyChbx(data.get("MentorToAttorney"));
		contact.setmoduleField("125abhy");
		contact.setFirmNameRadioBtn();
		contact.setDateText("02/15/8888");
		contact.setstateAdmittedText();
		contact.setdateAdmittedText("03/18/1111");
		Thread.sleep(5000);
		contact.setNextBtn();

		

	}

	@Test(priority = 3)
	public void memberCategory() throws InterruptedException {
		MembershipCategories category = new MembershipCategories(driver);
		category.settestRadioBtn();
		// Thread.sleep(2000);
		category.setnextBtn();
	}

	@Test(priority = 4)
	public void languageCategory() throws InterruptedException {
		LanguageSelection language = new LanguageSelection(driver);
		language.setCheckBox();
		// Thread.sleep(3000);
		language.setNextBtn();
	}

	@Test(priority = 5)
	public void paymentCategory() throws InterruptedException {
		PaymentPage payment = new PaymentPage(driver);
		payment.setCashRadioBtn();
		payment.setCheckBox();
		payment.setNotesTextField("Test Payment Note.");
		// Thread.sleep(13000);
		payment.setSubmitBtn();
		payment.setSuccessMsg();
	}

}
