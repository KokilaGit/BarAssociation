package com.contracosta.barassociation;


import java.util.HashMap;

import org.testng.annotations.Test;

import com.contracosta.pom.LanguageSelection;
import com.contracosta.pom.LoginPage;
import com.contracosta.pom.MainMenu;
import com.contracosta.pom.PaymentPage;
import com.contracosta.pom.subpages.Contacts.AdditionalMemberInfo;
import com.contracosta.pom.subpages.Contacts.MemberCommAndDirectoryPreferrence;
import com.contracosta.pom.subpages.Contacts.MemberContactAttorneyInfo;
import com.contracosta.pom.subpages.Contacts.MemberContactFirmName;
import com.contracosta.pom.subpages.Contacts.MemberContactModuleField;
import com.contracosta.pom.subpages.Contacts.MemberContactOfficeAddress;
import com.contracosta.pom.subpages.Contacts.MemberContactUserCredentials;
import com.contracosta.pom.subpages.Contacts.MemeberContactMemberInfo;
import com.contracosta.pom.subpages.Membership.MembershipCategories;
import com.contracosta.pom.subpages.Membership.MembershipDonationContribution;
import com.contracosta.pom.subpages.Membership.MembershipProductsServices;

public class MemberForm extends DriverSetUp {

	@Test(dataProvider = "create",dataProviderClass= DataProviderMemberForm.class,priority = 1)
	public void loginTest(HashMap<String, String> data)  {

		LoginPage login = new LoginPage(driver);
		login.setUserName(data.get("UserName"));
		login.setPassword(data.get("Password"));
		login.clickLogin();

	}

	@Test(dataProvider = "memberInfo",dataProviderClass= DataProviderMemberForm.class,priority = 2)
	public void contactForm(HashMap<String, String> data)  {

		MainMenu menu = new MainMenu(driver);
		menu.selectAddMember();
		
		MemeberContactMemberInfo contact = new MemeberContactMemberInfo(driver);
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
		
		MemberContactUserCredentials credentials = new MemberContactUserCredentials(driver);
		credentials.setpwdText(data.get("MemberPwd"));
		
		AdditionalMemberInfo additionalInfo = new AdditionalMemberInfo(driver);
		additionalInfo.setmemberId(data.get("MemberId"));
		additionalInfo.setimisTxt(data.get("IMIS"));
		additionalInfo.setnotesTxt(data.get("NotesText"));
		
		MemberCommAndDirectoryPreferrence memberPreferrence = new MemberCommAndDirectoryPreferrence(driver);	
		memberPreferrence.setContactPrefference(data.get("ContactPrefference"));
		memberPreferrence.setMagazinePrefference(data.get("MagazinePrefference"));
		memberPreferrence.setEventBroadcast(data.get("EventBroadcastPrefference"));
		memberPreferrence.setCommitteBroadcast(data.get("CommitteBroadcastPrefference"));
		memberPreferrence.setMailingList(data.get("MailingOption"));
		memberPreferrence.setPublishNameOnlinechbx(data.get("PublishNameOnline"));
		memberPreferrence.setPublishNamePrintchbx(data.get("PublishNamePrint"));
		memberPreferrence.setPublishEmailOnlinechbx(data.get("PublishEmailOnline"));
		memberPreferrence.setPublishEmailPrintchbx(data.get("PublishEmailPrint"));
		memberPreferrence.setPublishPhoneOnlinechbx(data.get("PublishPhoneOnline"));
		memberPreferrence.setPublishPhonePrintchbx(data.get("PublishPhonePrint"));
		memberPreferrence.setPublishPhotoOnlinechbx(data.get("PublishPhotoOnline"));
		memberPreferrence.setPublishPhotoPrintchbx(data.get("PublishPhotoPrint"));
		memberPreferrence.setPublishBioOnlinechbx(data.get("PublishBioOnline"));
		memberPreferrence.setPublishBioPrintchbx(data.get("PublishBioPrint"));
		memberPreferrence.setStudentMentorCheckBox(data.get("StudentMentor"));
		memberPreferrence.setAttWantMentorChbx(data.get("AttorneyMentor"));
		memberPreferrence.setMentorToStuChbx(data.get("MentorToStudent"));
		memberPreferrence.setMenToAttorneyChbx(data.get("MentorToAttorney"));
		
		MemberContactModuleField module = new MemberContactModuleField(driver);
		module.setmoduleField("125abhy");
		
		MemberContactFirmName firm = new MemberContactFirmName(driver);
		firm.setFirmNameRadioBtn();
		
		MemberContactOfficeAddress officeAddress = new MemberContactOfficeAddress(driver);
		officeAddress.setSameMailingChbx(data.get("SameMailinfInfo"));
		officeAddress.setOfficePhone(data.get("OfficePhone"));
		officeAddress.setOfficeFax(data.get("OfficeFax"));
		officeAddress.setOfficeEmail1(data.get("Email1"));
		officeAddress.setOfficeEmail2(data.get("Email2"));
		officeAddress.setOfficeAddress1(data.get("OfficeAddress1"));
		officeAddress.setOfficeAddressCity(data.get("OfficeAddressCity"));
		officeAddress.setOfficeAddressStateDropDown(data.get("OfficeAddressState"));
		officeAddress.setOfficeAddressZipcode(data.get("OfficeAddressZipcode"));
		
		MemberContactAttorneyInfo attorneyContact = new MemberContactAttorneyInfo(driver);
		attorneyContact.setDateFirstAdmittedToStateText(data.get("DateFirstAdmittedToState"));
		attorneyContact.setstateAdmittedText();
		attorneyContact.setdateAdmittedText(data.get("DateAdmitted"));
		
		
		menu.setNextBtn();

		

	}

	@Test(dataProvider = "membership",dataProviderClass= DataProviderMemberForm.class,priority = 3)
	public void memberCategory(HashMap<String, String> data)  {
		MainMenu menu = new MainMenu(driver);
		MembershipCategories category = new MembershipCategories(driver);
		category.setCategorybtn(data.get("MemberCategory"));
		MembershipDonationContribution donation = new MembershipDonationContribution(driver);
		donation.setDonationInfo(data.get("DonationInformation"));
		MembershipProductsServices productServices = new MembershipProductsServices(driver);
		productServices.setProductsServices(data.get("ProductServices"));
		menu.setNextBtn();
		
	}

	@Test(dataProvider = "language",dataProviderClass = DataProviderMemberForm.class,priority = 4)
	public void languageCategory(HashMap<String, String> data)  {
		LanguageSelection language = new LanguageSelection(driver);
		language.setLanguageCheckBoxes(data.get("Languages"));
		MainMenu menu = new MainMenu(driver);
		menu.setNextBtn();
	}

	@Test(dataProvider = "payment",dataProviderClass = DataProviderMemberForm.class,priority = 5)
	public void paymentCategory(HashMap<String, String> data)  {
		PaymentPage payment = new PaymentPage(driver);
		payment.setPaymentRadioBtn(data.get("PaymentType"));
		payment.setNotesTextField(data.get("PaymentNotes"));
		payment.setSubmitBtn();
		payment.setSuccessMsg();
		
	}

}
