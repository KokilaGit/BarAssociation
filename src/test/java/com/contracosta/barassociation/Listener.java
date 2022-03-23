package com.contracosta.barassociation;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener extends BaseClass implements ITestListener{
	public void onTestFailure(ITestResult result) {
		LocalDateTime currentTime = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		String fileName = new File(System.getProperty("user.dir")).getAbsolutePath() + "/target/surefire_reports";
		// Resources//ScreenShot " + dtf.format(currentTime) + ".png";

		// Type Casting driver to screen shot
		TakesScreenshot screenShot = ((TakesScreenshot) driver);
		// Getting the screen shot file in byte form
		File srcFile = screenShot.getScreenshotAs(OutputType.FILE);
		// creating a destination file for the screen shot
		try {
			File destinationFile = new File(
					fileName + "failure_screenshots/ScreenShot " + dtf.format(currentTime) + ".png");
			// copying the source file to destination file
			FileUtils.copyFile(srcFile, destinationFile);
			Reporter.log("<a href='" + destinationFile.getAbsolutePath() + "'> <img src='"
					+ destinationFile.getAbsolutePath() + "' height='100' width='100'/> </a>");
		} catch (IOException e) {
			e.printStackTrace();

		}
		
	}
	public void	onTestSuccess(ITestResult result) {
		LocalDateTime currentTime = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		String fileName = new File(System.getProperty("user.dir")).getAbsolutePath() + "/target/surefire_reports";
		// Resources//ScreenShot " + dtf.format(currentTime) + ".png";

		// Type Casting driver to screen shot
		TakesScreenshot screenShot = ((TakesScreenshot) driver);
		// Getting the screen shot file in byte form
		File srcFile = screenShot.getScreenshotAs(OutputType.FILE);
		// creating a destination file for the screen shot
		try {
			File destinationFile = new File(
					fileName + "success_screenshots/ScreenShot " + dtf.format(currentTime) + ".png");
			// copying the source file to destination file
			FileUtils.copyFile(srcFile, destinationFile);
			Reporter.log("<a href='" + destinationFile.getAbsolutePath() + "'> <img src='"
					+ destinationFile.getAbsolutePath() + "' height='100' width='100'/> </a>");
		} catch (IOException e) {
			e.printStackTrace();

		}
		
	}

}
