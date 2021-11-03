package com.va.ppms.ExtentReportListener;


import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.StringTokenizer;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class WebConnector {
	
	public static WebDriver driver;
	public String name;
	public Properties prop;
	public ExtentReports rep;
	public ExtentTest scenario;
	
	@FindBy(how =How.XPATH, using = "//*[contains(text(),'SANDBOX')]")
	private static WebElement PPMSHome;
	

	public WebConnector() {
//name="A";
		if (prop == null) {
			try {
				prop = new Properties();
				FileInputStream fs = new FileInputStream(
						System.getProperty("user.dir") + "\\resources\\config.properties");
				prop.load(fs);
			} catch (Exception e) {
				e.printStackTrace();
// report
			}
		}
	}

	public WebDriver openBrowser(String browserName) throws InterruptedException {
		if (browserName.toUpperCase().equals("EDGE"))
			return edgeDriver();

		if (browserName.toUpperCase().equals("CHROME")) {
			System.out.println("Return Chrome Driver");

			return chromeDriver();
		}

		if (browserName.toUpperCase().equals("IE")) {
			System.out.println("Return IE Driver");
			// reportPass("Web browser is open --", browserName);
			return ieDriver();
		}

		throw new RuntimeException("invalid browser name");
	}

	// Chrome Driver
	public static WebDriver chromeDriver() {
		try {
			System.setProperty("webdriver.chrome.driver", getDriverPath("CHROME"));

			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");// maximize window
			options.addArguments("disable-infobars"); // disable infobars
			options.addArguments("--disable-extensions"); // disable extensions
			options.addArguments("--disable-gpu");// applicable to windows os only
			options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
			options.addArguments("--no-sandbox"); // Bypass OS security model
			options.addArguments("--remote-debugging-port=9222");
			options.setExperimentalOption("useAutomationExtension", false);

			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			return driver;

		}

		catch (Exception ex) {
			throw new RuntimeException("could not create chrome driver");
		}
	}

	// Edge Driver
	public static WebDriver edgeDriver() {
		try {
			System.setProperty("webdriver.edge.driver", getDriverPath("EDGE"));
			return new EdgeDriver();
		} catch (Exception ex) {
			throw new RuntimeException("could not create the edge driver");
		}
	}

	// IE Driver
	public static WebDriver ieDriver() {
		try {
			@SuppressWarnings("unused")
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			System.setProperty("webdriver.ie.driver", getDriverPath("IE"));
			InternetExplorerOptions options = new InternetExplorerOptions();
			options.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
			options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

			driver = new InternetExplorerDriver(options);
			driver.manage().window().maximize();
			return driver;
		} catch (Exception ex) {
			throw new RuntimeException("could not create the IE driver");
		}

	}

	// Read location of driver path
	private static String getDriverPath(String browserName) {

		File file = new File("resources/config.properties");
		FileInputStream fileInput = null;
		String driverPath = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Properties prop = new Properties();
		// load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (browserName.toUpperCase().equals("EDGE"))
			driverPath = prop.getProperty("edgedriverpath");

		if (browserName.toUpperCase().equals("CHROME"))
			driverPath = prop.getProperty("chromedriverpath");

		if (browserName.toUpperCase().equals("IE"))
			driverPath = prop.getProperty("iedriverpath");

		return driverPath;
	}

	public void navigate(String urlKey) throws InterruptedException {
		
		System.out.println(prop.getProperty(urlKey));
		
		driver.get(prop.getProperty(urlKey));
		
	}

	public void click(String objectKey) throws InterruptedException {
		waitForPageToLoad();
		try {
			getObject(objectKey).click();
			reportPass("link is clicked", objectKey);

		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Unable to extract Object " + ex);
		}

	}

	public void buttonclick(String objectKey) throws InterruptedException {
		waitForPageToLoad();
		try {
			getObjectfromClass(objectKey).click();
			waitForPageToLoad();
			reportPass("link is clicked", objectKey);

		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Unable to extract Object " + ex);
		}

	}
	
	
	public void buttonclick1(String objectKey) throws InterruptedException {
		waitForPageToLoad();
		try {
			getObjectfromClass(objectKey).click();
			reportPass("link is clicked", objectKey);

		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Unable to extract Object " + ex);
		}

	}
	
	public void type(String objectKey, String data) throws InterruptedException {
		waitForPageToLoad();
		Thread.sleep(1000);
		try {
			getObjectfromClass(objectKey).click();
			getObjectfromClass(objectKey).sendKeys(data);
			reportPass(objectKey, data);
			waitForPageToLoad();

		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Unable to extract Object " + ex);
		}

	}

	public void enter(String objectKey, String data, String elementname) throws InterruptedException {
		waitForPageToLoad();
		try {
			getObjectfromClass(objectKey).sendKeys(data);
			Thread.sleep(100);
			reportPass(elementname, data);
			
		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Unable to extract Object " + ex);
		}

	}
	
	
	public void Uploadfile(String objectKey, String data, String elementname) throws InterruptedException {
		waitForPageToLoad();
		Thread.sleep(1000);
		try {
			Actions actions = new Actions(driver);
			WebElement element = getObjectfromClass(objectKey);
			//Action mouseOverHome = builder.moveToElement(element).build();
			actions.moveToElement(element);
			//actions.click();
			actions.sendKeys("C:\\Users\\oithouawanw\\Desktop\\testFile.docx");
			actions.build().perform();
			Thread.sleep(1000);
			reportPass(elementname, data);
			
		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Unable to extract Object " + ex);
		}

	}

	public void select(String objectKey, String data) throws InterruptedException {
		waitForPageToLoad();
		try {
			Select s = new Select(getObject(objectKey));
			s.selectByVisibleText(data);
			reportPass(objectKey, data);
			waitForPageToLoad();
		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Unable to extract Object " + ex);
		}

	}

	public void selectTrim(String objectKey, String data) throws InterruptedException {
		waitForPageToLoad();

		Select CCNAddVISNholddown_UI = new Select(getObject(objectKey));
		StringTokenizer visnTokenizer = new StringTokenizer(data, ",");
		while (visnTokenizer.hasMoreTokens()) {
			CCNAddVISNholddown_UI.selectByValue(visnTokenizer.nextToken().trim());
		}
	}

	public void selectBy(String objectKey, String data, String elementName) throws InterruptedException {
		waitForPageToLoad();
		
		Thread.sleep(1000);
		try {
			Select s = new Select(getObjectfromClass(objectKey));
			s.selectByVisibleText(data);
			Thread.sleep(1000);
			reportPass(elementName, data);
			waitForPageToLoad();
		
		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Unable to extract Object " + ex);
		}

	}
	
	
	public void selectfromDropDown(String objectKey, String data, String elementName) throws InterruptedException {
		waitForPageToLoad();
		
		Thread.sleep(1000);
		try {
		
			
			WebElement requestDropDown = getObjectfromClass(objectKey);
			requestDropDown.sendKeys(data);
			reportPass(elementName, data);
			reportPass("Mouse over" + elementName + "and set --", data);
			waitForPageToLoad();
		
		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Unable to extract Object " + ex);
		}

	}
	
	public void clear(String objectKey) {
		getObject(objectKey).clear();
	}

// central function to extract objects
	public WebElement getObject(String objectKey) {
		WebElement e = null;
		WebDriverWait wait = new WebDriverWait(driver, 30);

		try {
			if (objectKey.endsWith("_xpath")) {
				e = driver.findElement(By.xpath(prop.getProperty(objectKey)));// present
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(prop.getProperty(objectKey))));
				System.out.println(objectKey);
			} else if (objectKey.endsWith("_id")) {
				e = driver.findElement(By.id(prop.getProperty(objectKey)));// present
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(prop.getProperty(objectKey))));
			} else if (objectKey.endsWith("_name")) {
				e = driver.findElement(By.name(prop.getProperty(objectKey)));// present
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name(prop.getProperty(objectKey))));
			} else if (objectKey.endsWith("_css")) {
				e = driver.findElement(By.cssSelector(prop.getProperty(objectKey)));// present
				wait.until(ExpectedConditions
						.visibilityOfAllElementsLocatedBy(By.cssSelector(prop.getProperty(objectKey))));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Unable to extract Object " + objectKey);
		}
		return e;
	}

	// central function to extract objects
	public WebElement getObjectfromClass(String objectKey) {
		WebElement e = null;
		WebDriverWait wait = new WebDriverWait(driver, 30);

		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(objectKey)));
			e = driver.findElement(By.xpath((objectKey)));// present
			
			System.out.println(objectKey);

		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Unable to extract Object " + objectKey);
		}
		return e;
	}

// true - present
// false - not present
	public boolean isElementPresent(String objectKey) {
		List<WebElement> e = null;
		if (objectKey.endsWith("_xpath")) {
			e = driver.findElements(By.xpath(prop.getProperty(objectKey)));// present
		} else if (objectKey.endsWith("_id")) {
			e = driver.findElements(By.id(prop.getProperty(objectKey)));// present
		} else if (objectKey.endsWith("_name")) {
			e = driver.findElements(By.name(prop.getProperty(objectKey)));// present
		} else if (objectKey.endsWith("_css")) {
			e = driver.findElements(By.cssSelector(prop.getProperty(objectKey)));// present
		}
		if (e.size() == 0)
			return false;
		else
			return true;
	}

	public void acceptAlertIfPresent(String element, String element1) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
			String getText = driver.switchTo().alert().getText();
			
			Assert.assertEquals(getText, element);
			
			System.out.println(getText);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		} catch (Exception e) {
// not present
		}
	}

	
	
	public void clickAndWait(String xpathExpTarget, String xpathExpWait, int maxTime) {
		for (int i = 0; i < maxTime; i++) {
// click
			getObjectfromClass(xpathExpTarget).click();
// check presence of other ele
			if (isElementPresent(xpathExpWait)
					&& driver.findElement(By.id(prop.getProperty(xpathExpWait))).isDisplayed()) {
// if present - success.. return
				return;
			} else {
// else wait for 1 sec
				wait(20);
			}
		}
// 10 seconds over - for loop - comes here
		reportFailure("Target element coming after clicking on " + xpathExpTarget);
	}

	public static boolean waitForPageToLoad() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int i = 0;
		while (i != 1000) {
			String state = (String) js.executeScript("return document.readyState;");
			System.out.println(state);
			if (state.equals("complete"))
				break;
			else
				Thread.sleep(500);
			i++;
		}

		return false;

	}

	public void wait(int time) {
		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void PageTitle(String locatorKey) throws InterruptedException {
		waitForPageToLoad();
		try {
			driver.getTitle().equals(locatorKey);
			String pageTitle = locatorKey.toString();
			reportPass("Page title is --->", pageTitle);

		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Page didn't didplay " + ex);
		}
	}

	public void elementValue(String element_xpath, String data) throws InterruptedException {
		waitForPageToLoad();
		Thread.sleep(1000);
		try {
			Select s = new Select(getObjectfromClass(element_xpath));
			List<WebElement> element = s.getOptions();
			StringBuilder sb2 = new StringBuilder();
			element.size();
			for (int i = 0; i < element.size(); i++) {
				String Option = element.get(i).getText();

				sb2.append(Option);

			}
			String values = sb2.toString();
			System.out.println("Actual   values" + "--" + values);
			System.out.println("Expected values" + "--" + data);

			Assert.assertEquals(values, data);

			reportPass("Values in a dropdown field ", values);

		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Page didn't didplay " + ex);
		}
	}
			
			public void elementValueValidation(String element_xpath, String data) throws InterruptedException {
				waitForPageToLoad();
				try {
					
					Date date = new Date();
					SimpleDateFormat formatter = new SimpleDateFormat("M/dd/yyyy");
					String currDate = formatter.format(date);
					System.out.println(currDate);
				
					Select s = new Select(getObjectfromClass(element_xpath));
					List<WebElement> element = s.getOptions();
					StringBuilder sb2 = new StringBuilder();
					element.size();
					for (int i = 0; i < element.size(); i++) {
						String Option = element.get(i).getText();

						sb2.append(Option);

					}
					String values = sb2.toString();
					System.out.println("Actual   values" + "--" + values);
					System.out.println("Expected values" + "--" + currDate);

					Assert.assertEquals(values, currDate);

					reportPass("Values in a dropdown field ", values);

				} catch (Exception ex) {
					ex.printStackTrace();
					reportFailure("Page didn't didplay " + ex);
				}
			}
			
			

	public void mouseOver(String elementName, String field_element) throws InterruptedException {
		waitForPageToLoad();
		Thread.sleep(1000);
		
		try {
			Actions builder = new Actions(driver);
			WebElement element = getObjectfromClass(field_element);
			Action mouseOverHome = builder.moveToElement(element).build();
			mouseOverHome.perform();
			Thread.sleep(100);
			element.click();
			Thread.sleep(1000);
			waitForPageToLoad();
			reportPass("Mouse over and click on --", elementName);
		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Page didn't didplay " + ex);
		}
	}

	
	public void mouseOverAndClick2(String elementName, String field_element) throws InterruptedException {
		waitForPageToLoad();
		Thread.sleep(1000);
		
		try {
			Actions builder = new Actions(driver);
			WebElement element = getObjectfromClass(field_element);
//			Action mouseOverHome = builder.moveToElement(element).build();
//			mouseOverHome.perform();
			element.click();
			Thread.sleep(100);
			captureScreenshot(element);
			Thread.sleep(100);
			element.click();
			reportPass("Mouse over and click on --", elementName);
			Thread.sleep(100);
		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Page didn't didplay " + ex);
		}
	}
	
	public void scrollTo(String field_element, String element) throws InterruptedException {
		waitForPageToLoad();
		Thread.sleep(100);
		try {
			WebElement webelement = getObjectfromClass(field_element);
			JavascriptExecutor jse = ((JavascriptExecutor) driver);
			jse.executeScript("arguments[0].scrollIntoView(true);", webelement);
			Thread.sleep(100);
		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Page didn't didplay " + ex);
		}
	}
	
	
	public void scrollToPage(String field_element, String element) throws InterruptedException {
		waitForPageToLoad();
		Thread.sleep(1000);
		try {
			WebElement webelement = getObjectfromClass(field_element);
			JavascriptExecutor jse = ((JavascriptExecutor) driver);
			jse.executeScript("arguments[0].scrollIntoView(true);", webelement);
			Thread.sleep(100);
			reportPass("Scroll down on the page and take screenshot --", field_element);
		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Page didn't didplay " + ex);
		}
	}

	public void mouseOverAndClick(String elementName, String field_element) throws InterruptedException {
		waitForPageToLoad();
		Thread.sleep(100);
		try {
			Actions builder = new Actions(driver);
			WebElement element = getObjectfromClass(field_element);
			Action mouseOverHome = builder.moveToElement(element).build();
			mouseOverHome.perform();
			element.click();
			reportPass("Mouse over and click on -->", elementName);
		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Page didn't didplay " + ex);
		}

	}

	
	public void verifyText(String locatorKey, String expectedText) throws InterruptedException, Exception {
		waitForPageToLoad();
		try {
			String SuccessWaiverAddedText = getObjectfromClass(locatorKey).getText().toString();
			assertEquals(SuccessWaiverAddedText, expectedText);
			reportPass(" text is displayed on the page --",
					SuccessWaiverAddedText + "Expected text---> " + expectedText);

		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Page didn't didplay " + ex);
		}
	}

	/********** logging **************/
	public void infoLog(String msg) {
		scenario.log(Status.INFO, msg);
	}

	public void reportFailure(String errMsg) {
// fail in extent reports
		scenario.log(Status.FAIL, errMsg);

		// fileName of the screenshot
		Date d = new Date();
		String screenshotFile = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		// take screenshot
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			// get the dynamic folder name
			FileUtils.copyFile(srcFile, new File(ExtentManager.screenshotFolderPath + screenshotFile));
			// put screenshot file in reports
			// scenario.log(Status.PASS, "Screenshot-> "
			scenario.log(Status.FAIL, "Screenshot-> "
					+ scenario.addScreenCaptureFromPath(ExtentManager.screenshotFolderPath + screenshotFile));

		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

	public void reportPass(String elementselected, String data) throws InterruptedException, HeadlessException, AWTException {
		// pass in extent reports
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		scenario.log(Status.PASS, elementselected + "-->" + data);
		// fileName of the screenshot
		
		Date d = new Date();
		String screenshotFile = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		
		try {
			// get the dynamic folder name
			//BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			FileUtils.copyFile(srcFile, new File(ExtentManager.screenshotFolderPath + screenshotFile));
			// put screenshot file in reports
			scenario.log(Status.PASS, "Screenshot-> "
					+ scenario.addScreenCaptureFromPath(ExtentManager.screenshotFolderPath + screenshotFile));
			Thread.sleep(100);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	

	public static void captureScreenshot(WebElement element) throws IOException {
		try {
			String dirPath = ExtentManager.screenshotFolderPath;
			String scenarioName = null;
			Date d = new Date();
			System.out.println(d.toString());

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");

			// Create folder/directory if not exist.
			File file = new File("screenshots");
			if (!file.exists()) {
				if (file.mkdir()) {
					System.out.println("Directory is created!");
				} else {
					System.out.println("Failed to create directory!");
				}
			}

			XWPFDocument docx = new XWPFDocument();
			XWPFRun run = docx.createParagraph().createRun();
			FileOutputStream out = new FileOutputStream(dirPath + "Screenshots_" + sdf.format(d) +  scenarioName +".docx");
		//	String screenshotFile = d.toString().replace(":", "_").replace(" ", "_") + ".png";

			//Take Screenshot
			captureScreenShot(run, out, dirPath,scenarioName);
			//captureScreenShot2(screenshotFile, dirPath);
			
			//File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		   
			
			System.out.println("Write to doc file sucessfully...");

			docx.write(out);
			out.flush();
			out.close();
			docx.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void captureScreenShot(XWPFRun run, FileOutputStream out, String dirPath, String scenarioName) throws Exception {
		ExtentReports rep;
		ExtentTest scenario;
		String projectdir = System.getProperty("user.dir");
		System.out.println(projectdir);
		String report = projectdir + "//" + "results//";
		System.out.println(report);
		rep = ExtentManager.getInstance(report);
		scenario = rep.createTest(scenarioName);
		scenario.log(Status.INFO, "Starting " + scenarioName);
		
		String screenshot_name = System.currentTimeMillis() + ".png";
		//String screenshotFile = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		//File file2 = new File(dirPath + screenshotFile);
		File file = new File(dirPath + screenshot_name);
	
		// put screenshot file in reports
		ImageIO.write(image, "png", file);
		InputStream pic = new FileInputStream(dirPath + screenshot_name + scenarioName);
		run.addBreak();
		run.addPicture(pic, XWPFDocument.PICTURE_TYPE_PNG, screenshot_name, Units.toEMU(500), Units.toEMU(350));
		pic.close();
		file.delete();
	}
	
	
//	public static void captureScreenShot2(String out, String dirPath) throws Exception {
//		Date d = new Date();
//
//		String screenshot_name = System.currentTimeMillis() + ".png";
//		String screenshotFile = d.toString().replace(":", "_").replace(" ", "_") + ".png";
//		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//		File file = new File(dirPath + screenshotFile);
//
//		ImageIO.write(image, "png",file );
//		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		//FileUtils.copyFile(srcFile, new File(ExtentManager.screenshotFolderPath + screenshotFile));
//		// put screenshot file in reports
//	//	ImageIO.write(image, "png", file);
//		InputStream pic = new FileInputStream(dirPath + screenshotFile);
//		pic.close();
//		//file.delete();
//	}
	
	


	/************** Reporting ******************/
	public void quit() {
		if (rep != null)
			rep.flush();
		if (driver != null)
			driver.quit();
	}

	public void initReports(String scenarioName) {
		String projectdir = System.getProperty("user.dir");
		System.out.println(projectdir);
		String report = projectdir + "//" + "results//";
		System.out.println(report);
		rep = ExtentManager.getInstance(report);
		scenario = rep.createTest(scenarioName);
		scenario.log(Status.INFO, "Starting " + scenarioName);
	}

	
	public void waitAndClick(String xpathExpTarget, String Element, int maxTime) throws Exception, InterruptedException  {
		for (int i = 0; i < maxTime; i++) {
// click
			getObjectfromClass(xpathExpTarget).click();
// check presence of other ele
			if (elementIsPresent(xpathExpTarget)
					&& getObjectfromClass(xpathExpTarget).isDisplayed()) {
// if present - success.. return
				//wait(100);
				waitForPageToLoad();
				reportPass("Mouse over and click on -->", Element);
				return;
			} else {
// else wait for 1 sec
				wait(100);
			}
		}
// 10 seconds over - for loop - comes here
		reportFailure("Target element coming after clicking on " + xpathExpTarget);
	}
	
	public boolean elementIsPresent(String objectKey) {
		List<WebElement> e = null;
		
			e = driver.findElements(By.xpath(objectKey));// present
		
		if (e.size() == 0)
			return false;
		else
			return true;
	}
	
	public void overAndClick(String elementName, String field_element) throws InterruptedException {
		waitForPageToLoad();
		Thread.sleep(100);
		
		try {
			Actions builder = new Actions(driver);
			WebElement element = getObjectfromClass(field_element);
			Action mouseOverHome = builder.moveToElement(element).build();
			mouseOverHome.perform();
			element.click();
			reportPass("Mouse over and click on -->", elementName);
		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Page didn't didplay " + ex);
		}

	}
	
	public boolean PageTitleVerify(String locatorKey) throws InterruptedException {
		waitForPageToLoad();
		
			String pageTitle1 =driver.getTitle();
			System.out.print(pageTitle1);
			if (driver.getTitle().equals(locatorKey)) {
			
			String pageTitle = locatorKey.toString();
			System.out.print(pageTitle);
			} else {
				System.out.print("est faled");
				return false;
			}
		
		
		return true;
	}

	public void iFrame (String locatorKey) throws InterruptedException {
	
		WebElement element = getObjectfromClass(locatorKey);
	driver.switchTo().frame(element);

	
}
	
	public void iFrameDefault () throws InterruptedException {
	driver.switchTo().defaultContent();
	
}
	
	// central function to extract objects
	public WebElement getObjectfromClass2(String objectKey) {
		WebElement e = null;
		WebDriverWait wait = new WebDriverWait(driver, 30);

		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(objectKey)));
			e = driver.findElement(By.xpath((objectKey)));// present
			System.out.println(objectKey);
			

		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Unable to extract Object " + objectKey);
		}
		return e;
	}

	public void Table (String objectKey, String elementname) throws InterruptedException {
		waitForPageToLoad();
		try {
			getObjectfromClass2(objectKey);
			waitForPageToLoad();
			reportPass("Table diplayed" + elementname, elementname);
			
		} catch (Exception ex) {
			ex.printStackTrace();
			reportFailure("Unable to extract Object " + ex);
		}

	}

}

