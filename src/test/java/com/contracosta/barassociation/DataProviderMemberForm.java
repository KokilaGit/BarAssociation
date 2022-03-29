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
	public static final String  memberInfoSheet = "MemberContact";
	public static final String excelTestDataFile = new File(System.getProperty("user.dir")).getAbsolutePath()
			+ "/src/test/resources/TestData.xlsx";

	@DataProvider(name = "create")
	public Object[][] dataset() {
		/*
		 * Object[][]dataset = new Object[1][2]; dataset[0][0] =
		 * "itodadmin19@intellinx.com"; dataset[0][1] = "itoddev96"; return dataset;
		 * 
		 * return new Object[][] { { "itodadmin19@intellinx.com", "itoddev96" } };
		 */
		return loadDataFromExcel(loginDataSheetName);

	}
	@DataProvider(name = "memberInfo")
	public Object[][]memberData(){
		
		return loadDataFromExcel(memberInfoSheet);
	}

	public static Object[][] loadDataFromExcel(String sheetName) {

		Workbook book;
		Sheet sheet;
		// Object[][] dataset = null;
		Object[][] dataHash = null;
		// Read test data from Excel // Create an object of File class to open xlsxfile

		File file = new File(excelTestDataFile);
		try {

			// Create an object of FileInputStream class to read excel file

			FileInputStream inputStream = new FileInputStream(file);

			book = WorkbookFactory.create(inputStream);

			sheet = book.getSheet(sheetName);

			// dataset = new
			// Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			dataHash = new Object[sheet.getLastRowNum()][1];
			for (int i = 0; i < sheet.getLastRowNum(); i++) {
				HashMap<String, String> data = new HashMap<String, String>();
				for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
					// dataset[i][j] = sheet.getRow(i + 1).getCell(j).toString();
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
