package com.contracosta.barassociation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

	String ExcelFilePath = new File(System.getProperty("user.dir")).getAbsolutePath() + "/src/test/resources";
	String fileName = "TestData.xlsx";

	@Test(priority = 1)
	public void loginTest() throws InterruptedException {
		
		// Read test data from Excel
		// Create an object of File class to open xlsx file

		File file = new File(ExcelFilePath + "/" + fileName);
		try {

			// Create an object of FileInputStream class to read excel file

			FileInputStream inputStream = new FileInputStream(file);

			// Find the file extension by splitting file name in substring and getting only
			// extension name

			String fileExtensionName = fileName.substring(fileName.indexOf("."));
			Workbook TestDataWorkBook = null;

			// Check condition if the file is xlsx file

			if (fileExtensionName.equals(".xlsx")) {

				// If it is xlsx file then create object of XSSFWorkbook class

				TestDataWorkBook = new XSSFWorkbook(inputStream);

			}

			// Check condition if the file is xls file

			else if (fileExtensionName.equals(".xls")) {

				// If it is xls file then create object of HSSFWorkbook class

				TestDataWorkBook = new HSSFWorkbook(inputStream);
			}

			Sheet loginSheet = TestDataWorkBook.getSheet("Login");
			// Find number of rows in excel file

			int rowCount = loginSheet.getLastRowNum() - loginSheet.getFirstRowNum();
			for (int i = 1; i < rowCount + 1; i++) {
				LoginPage login = new LoginPage(driver);

				String uname = loginSheet.getRow(i).getCell(0).getStringCellValue();
				String passwd = loginSheet.getRow(i).getCell(1).getStringCellValue();
				login.setUserName(uname);
				login.setPassword(passwd);
				login.clickLogin();
				login.clickLogout();
				Thread.sleep(2000);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 2)
	public void contactForm() throws InterruptedException {

		// build()- used to compile all the actions into a single step

		AddMemberContact contact = new AddMemberContact(driver);
		contact.setSalutationDropdown("Judge");
		contact.setFirstNameText("Michael");
		contact.setInitialTxt("R");
		contact.setLastNameText("Bob");
		contact.setnickNameText("Mike");
		contact.setSuffixDropdown("Esq.");
		contact.setdobMonthDropdown("03");
		contact.setdobDateDropdown("18");
		contact.setdobYearDropdown("1990");
		contact.setEthnicity("Latino");
		contact.setGenderDropDown("Male");
		contact.setphone1Part1("456");
		contact.setphone1Part2("763");
		contact.setphone1Part3("1097");
		contact.setphone2Part1("123");
		contact.setphone2Part2("456");
		contact.setphone2Part3("7890");
		contact.setcellPart1("708");
		contact.setcellPart2("567");
		contact.setcellPart3("2146");
		contact.setfaxPart1("543");
		contact.setfaxPart2("189");
		contact.setfaxPart3("9065");
		contact.setEmailText("contracosta@abc18.com");
		contact.setAddress1Text("15,abc street");
		contact.setAddress2Text("Suite101");
		contact.setCityText("Wilmington");
		// Thread.sleep(3000);
		contact.setStateDropDown("Delaware");
		// Thread.sleep(3000);
		contact.setZipcodeText("19804");
		contact.setwebsiteText("www.avf.com");
		contact.setAttorneyYesRadioBtn();
		contact.setpwdText("high12");
		contact.setConactTypeEmailRadioBtn();
		contact.setMagazineRadioBtn();
		// Thread.sleep(3000);
		contact.setEventBroadcastRadioBtn();
		contact.setCommitteBroadcastRadioBtn();
		contact.setMailingOptionRadioBtn();
		contact.setFirmNameRadioBtn();
		contact.setDateText("02/15/8888");
		// Thread.sleep(3000);
		contact.setstateAdmittedText();
		// Thread.sleep(3000);
		contact.setdateAdmittedText("03/18/1111");
		contact.setNextBtn();

		Thread.sleep(5000);

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
