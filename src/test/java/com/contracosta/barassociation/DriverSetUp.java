package com.contracosta.barassociation;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetUp extends BaseClass {
	public static ExtentReports extent = null;
	ExtentTest test = null;

	// Method to create screenshot
	public static String getScreenhot(String screenshotName, int testStatus) {
		String destination = null;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		LocalDateTime currentTime = LocalDateTime.now();
		try {
			// Type Casting driver to screen shot
			TakesScreenshot screenShot = ((TakesScreenshot) driver);

			File source = screenShot.getScreenshotAs(OutputType.FILE);
			// After execution, you could see a folder "SuccessTestsScreenshots" under
			// project folder.
			if (testStatus == ITestResult.SUCCESS) {
				destination = System.getProperty("user.dir") + "/target/SucessTestsScreenshots/" + screenshotName
						+ dtf.format(currentTime) + ".png";
			} else {
				// After execution, you could see a folder "FailedTestsScreenshots" under
				// project folder.
				destination = System.getProperty("user.dir") + "/target/FailedTestsScreenshots/" + screenshotName
						+ dtf.format(currentTime) + ".png";
			}
			File finalDestination = new File(destination);
			FileUtils.copyFile(source, finalDestination);
		} catch (IOException e) {
			e.printStackTrace();

		}
		return destination;
	}

	@BeforeSuite
	public void setUp() {
		// Initialize extent report.
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(
				new File(System.getProperty("user.dir")).getAbsolutePath() + "/target/Spark.html");
		// Html file will be generated.
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		spark.config().setReportName("Extent Report");
		extent.attachReporter(spark);

		// Initializing WebDriver.
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@BeforeMethod
	public void beforeReport(Method context) {
		test = extent.createTest(context.getName());// Create a test node in the report.
		test.info("Starting " + context.getName());// Create test step node in the report.
	}

	@AfterMethod
	public void afterReport(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			String screenshotPath = getScreenhot(result.getName(), result.getStatus());
			test.pass(
					"Test case is passed " + result.getStatus() + " " + result.getTestClass() + "  " + result.getName())
					.addScreenCaptureFromPath(screenshotPath);
		}
		if (result.getStatus() == ITestResult.FAILURE) {
			String screenshotPath = getScreenhot(result.getName(), result.getStatus());
			test.log(Status.FAIL, "Test case is failed at below location " + result.getThrowable())
					.addScreenCaptureFromPath(screenshotPath);
		}
		extent.flush();
	}

	@AfterSuite
	public void closeUp() {
		driver.close();
		driver.quit();
		extent.flush();

	}

}
