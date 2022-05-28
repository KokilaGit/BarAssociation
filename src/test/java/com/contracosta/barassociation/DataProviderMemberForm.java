package com.contracosta.barassociation;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataProviderMemberForm {
	public static final String loginDataSheetName = "Login";
	public static final String memberInfoSheet = "MemberContact";
	public static final String membershipSheet = "MembershipCategories";
	public static final String languageCategoriesSheet = "LanguageCategories";
	public static final String paymentSheet = "PaymentCategory";
	public static final String excelTestDataFile = new File(System.getProperty("user.dir")).getAbsolutePath()
			+ "/src/test/resources/TestData.xlsx";

	@DataProvider(name = "create")
	public Object[][] dataset() {

		return loadDataFromExcel(loginDataSheetName);

	}

	@DataProvider(name = "memberInfo")
	public Object[][] memberData() {

		return loadDataFromExcel(memberInfoSheet);
	}

	@DataProvider(name = "membership")
	public Object[][] membershipData() {

		return loadDataFromExcel(membershipSheet);
	}

	@DataProvider(name = "language")
	public Object[][] languageData() {

		return loadDataFromExcel(languageCategoriesSheet);
	}

	@DataProvider(name = "payment")
	public Object[][] paymentData() {

		return loadDataFromExcel(paymentSheet);
	}

	public static Object[][] loadDataFromExcel(String sheetName) {
		// This method reads data from excel sheet and returns data hash map.
		Workbook book;
		Sheet sheet;
		Object[][] dataHash = null;

		// Create an object of File class to open xlsxfile
		File file = new File(excelTestDataFile);

		try {

			// Create an object of FileInputStream class to read excel file

			FileInputStream inputStream = new FileInputStream(file);

			book = WorkbookFactory.create(inputStream);
			sheet = book.getSheet(sheetName);
			dataHash = new Object[sheet.getLastRowNum()][1];
			for (int i = 0; i < sheet.getLastRowNum(); i++) {
				HashMap<String, String> data = new HashMap<String, String>();
				for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
					data.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i + 1).getCell(j).toString());

				}
				dataHash[i][0] = data;
			}
			book.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return dataHash;

	}
}
