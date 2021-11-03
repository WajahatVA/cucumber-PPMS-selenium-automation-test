package com.va.ppms.methods;
//package com.va.eprs.methods;
//
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import com.va.eprs.ExtentReportListener.WebConnector;
//import com.va.eprs.util.ReadExcelData;
//import com.va.eprs.util.TakeScreenShots;
//
//public class commonpageActions extends WebConnector {
//
//	// Click link please use this
//	public static JavascriptExecutor js = (JavascriptExecutor) driver;
//
//	public commonpageActions(WebDriver driver) {
//		WebConnector.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
//
//	public static void click(WebDriver driver, WebElement link, int Timeouts) throws Exception {
//		waitForPageToLoad();
//
//		new WebDriverWait(driver, Timeouts).until(ExpectedConditions.elementToBeClickable(link));
//		js.executeScript("arguments[0].click()", link);
//		Thread.sleep(1000);
//	}
//
//	@SuppressWarnings("deprecation")
//	public static void ccn_Wavier_Add_form(String excelFilePath, String sheetName,
//			WebElement cCN_Waiver_search_criteria, WebElement cCN_Add_ProviderOrganizationName,
//			WebElement cCN_Add_ServiceType, WebElement cCN_Add_Region, WebElement CCN_Add_VAMC_Station_Number,
//			WebElement CCN_Add_VISN_hold_down) throws Exception {
//		String pageTitle = "Add Waiver";
//
//		waitForPageToLoad();
//
//		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(1000, TimeUnit.SECONDS)
//				.pollingEvery(1000, TimeUnit.MILLISECONDS);
//		wait.until(ExpectedConditions.titleContains(pageTitle));
//
//		if (driver.getTitle().equals("Add Waiver")) {
//
//			System.out.println("Validation - In Waiver Add");
//
//			FluentWait<WebDriver> wait2 = new FluentWait<WebDriver>(driver).withTimeout(1000, TimeUnit.SECONDS)
//					.pollingEvery(1000, TimeUnit.MILLISECONDS);
//			wait2.until(ExpectedConditions.titleContains(pageTitle));
//			// until(ExpectedConditions.visibilityOf(cCN_Add_Region));
//			// Read all data rows from excel file for CCN Waivers and store in map object
//			Map<String, Map<String, String>> QualityCheckExcelData = ReadExcelData.readExcelFile(excelFilePath,
//					sheetName);
//
//			System.out.println("Before excel loop");
//
//			// Loop through the map object
//			if (QualityCheckExcelData != null) {
//				for (int k = 1; k < QualityCheckExcelData.size() + 1; k++) {
//
//					System.out.println("In For loop");
//					// Execute the script only if Run Script is set to Yes
//					if (QualityCheckExcelData.get(String.valueOf(k)).get("RunScript").equals("Yes")) {
//
//						if (QualityCheckExcelData.get(String.valueOf(k)).get("Region") != null) {
//							System.out.println("CCN_Add is -Inside->"
//									+ QualityCheckExcelData.get(String.valueOf(k)).get("Region"));
////Get Region Number
//							waitForPageToLoad();
//
//							FluentWait<WebDriver> wait3 = new FluentWait<WebDriver>(driver)
//									.withTimeout(1000, TimeUnit.SECONDS).pollingEvery(1000, TimeUnit.MILLISECONDS);
//							wait3.until(ExpectedConditions.elementToBeClickable(cCN_Add_Region));
//							dropDownSelect(cCN_Add_Region, QualityCheckExcelData.get(String.valueOf(k)).get("Region"));
//							System.out.println("After Region");
//
//						}
//
////Validate for ServiceProviderType
//						if (QualityCheckExcelData.get(String.valueOf(k)).get("ServiceProviderType") != null) {
//							String ServiceProviderType = QualityCheckExcelData.get(String.valueOf(k))
//									.get("ServiceProviderType");
//							System.out.println(ServiceProviderType);
//							waitForPageToLoad();
//
//							FluentWait<WebDriver> wait4 = new FluentWait<WebDriver>(driver)
//									.withTimeout(1000, TimeUnit.SECONDS).pollingEvery(1000, TimeUnit.MILLISECONDS);
//							wait4.until(ExpectedConditions.elementToBeClickable(cCN_Add_ServiceType));
//							dropDownSelect(cCN_Add_ServiceType,
//									QualityCheckExcelData.get(String.valueOf(k)).get("ServiceProviderType"));
//							System.out.println("After ServiceProviderType");
//						}
//
//						// Validate for ProviderOrganizationName
//						if (QualityCheckExcelData.get(String.valueOf(k)).get("ProviderOrganizationName") != null) {
//							String ProviderOrganizationName = QualityCheckExcelData.get(String.valueOf(k))
//									.get("ProviderOrganizationName");
//							System.out.println(ProviderOrganizationName);
//							waitForPageToLoad();
//							FluentWait<WebDriver> wait5 = new FluentWait<WebDriver>(driver)
//									.withTimeout(1000, TimeUnit.SECONDS).pollingEvery(1000, TimeUnit.MILLISECONDS);
//							wait5.until(ExpectedConditions.elementToBeClickable(cCN_Add_ProviderOrganizationName));
//							// cCN_Add_ProviderOrganizationName.clear();
//							cCN_Add_ProviderOrganizationName.sendKeys(
//									QualityCheckExcelData.get(String.valueOf(k)).get("ProviderOrganizationName"));
//
//							System.out.println("After ProviderOrganizationName");
//
//							String VAMCVAMCStationNumber_UI = CCN_Add_VAMC_Station_Number.getText();
//							String boolCompareExcelAndForm = (QualityCheckExcelData.get(String.valueOf(k))
//									.get("VAMC_Station_Number"));
//							System.out.println("Excel Values->" + boolCompareExcelAndForm);
//							System.out.println("UI-->" + VAMCVAMCStationNumber_UI);
//							Assert.assertEquals(VAMCVAMCStationNumber_UI, boolCompareExcelAndForm);
//							System.out.println("Excel Values->" + boolCompareExcelAndForm);
//							System.out.println("UI-->" + VAMCVAMCStationNumber_UI);
//
//							Thread.sleep(2000);
//
//							String CCNAddVISNholddown_UI = CCN_Add_VISN_hold_down.getText();
//							String CompareExcelAndForm = (QualityCheckExcelData.get(String.valueOf(k))
//									.get("VISN_hold_down"));
//							Assert.assertEquals(CCNAddVISNholddown_UI, CompareExcelAndForm);
//							System.out.println("Excel Values->" + CompareExcelAndForm);
//							System.out.println("UI-->" + CCNAddVISNholddown_UI);
//							Thread.sleep(2000);
//
//						}
//
//						TakeScreenShots.TakesScreenshot(cCN_Waiver_search_criteria);
//
//					}
//				}
//
//			}
//		}
//	}
//
//	public static void dropDownSelect(WebElement element, String value) throws Exception {
//		Select rdrpdwn1 = new Select(element);
//		rdrpdwn1.selectByVisibleText(value);
//
//	}
//
//	@SuppressWarnings("deprecation")
//	public static void waitforelementToBeClickable(WebElement element) throws Exception {
//		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(1450, TimeUnit.SECONDS)
//				.pollingEvery(1000, TimeUnit.MILLISECONDS);
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//
//	}
//
//	@SuppressWarnings("deprecation")
//	public static void waitToVerifyPageTitle(String element) throws Exception {
//		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(1000, TimeUnit.SECONDS)
//				.pollingEvery(500, TimeUnit.MILLISECONDS);
//		wait.until(ExpectedConditions.titleContains(element));
//	}
//
//	public void waitForPageToLoad() {
//
//		int i = 0;
//		while (i != 10) {
//
//			String state = (String) js.executeScript("return document.readyState;");
//			System.out.println(state);
//			if (state.equals("complete"))
//				break;
//			else
//				try {
//					Thread.sleep(4000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			i++;
//		}
//
//	}
//
//}