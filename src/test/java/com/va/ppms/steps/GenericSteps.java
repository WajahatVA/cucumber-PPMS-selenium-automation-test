package com.va.ppms.steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.va.ppms.ExtentReportListener.WebConnector;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
// pico container
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GenericSteps {

	WebConnector con;

	public GenericSteps(WebConnector con) {
		this.con = con;
	}

  String SigIn_xpath= "//*[@id=\"lightbox\"]";
  String HomeLink_xpath = "//span[@title='Go to home page']";
	
  @Before
	public void before(Scenario s) throws Exception {
		System.out.println("***Bef*** " + s.getName());
		con.initReports(s.getName());

	}

	@After
	public void after() {
		System.out.println("***Aft***");

		con.quit();
	}

	@Given("^I open (.*)$")
	public void openBrowser(String browserName) throws InterruptedException {

//System.out.println("Opening Browser "+con.name);
		con.infoLog("Opening Browser " + browserName);
		con.openBrowser(browserName);
	}

	@And("^I go to (.*)$")
	public void navigate(String URL) throws InterruptedException {
System.out.println("Navigating to "+ URL);
	    con.infoLog("Navigating to " + URL);
		con.navigate(URL);
	}

	public static void dropDownSelect(WebElement element, String value) throws Exception {
		Select drpdwn = new Select(element);
		drpdwn.selectByVisibleText(value);

	}

	@And("^I type (.*) in (.*) field$")
	public void type(String data, String locatorKey) throws InterruptedException {
		con.infoLog("Typing in " + locatorKey + ". Data " + data);
		con.type(locatorKey, data);
	}

	@And("^I clear (.*)$")
	public void clear(String locatorKey) {
		con.infoLog("Clearing in " + locatorKey);
		con.clear(locatorKey);
	}

	@And("^I click on (.*)$")
	public void click(String locatorKey) throws Exception {
		con.infoLog("Clicking on " + locatorKey);
		Thread.sleep(100);
		con.click(locatorKey);

	}

	@And("^I click (.*) and wait for (.*)$")
	public void clickAndWait(String src, String target) {
		con.infoLog("Clicking on " + src);
		con.clickAndWait(target,src, 350);

	}

//	@And("I select (.*) from (.*)")
//	public void select(String data, String locatorKey) throws InterruptedException {
//		con.infoLog("Selecting from " + locatorKey);
//		con.select(locatorKey, data);
//	}

	@And("^I wait for page to load$")
	public void waitForPageToLoad() throws InterruptedException {
		WebConnector.waitForPageToLoad();
	}

	@And("^I verify page (.*) is displayed$")
	public void verifyPageTitle(String locatorKey) throws InterruptedException {
		con.PageTitle(locatorKey);
	}
	
	@And("^I Logon to PPMS as a Basic and select the (.*) option from the left panel$")
	public void mouseOnElement(String elementName) throws Exception {
	if(con.PageTitleVerify("My VAMC Agreement Dashboard - Dynamics 365")== true) {
		con.waitAndClick(HomeLink_xpath, elementName ,300);
	}else {
			con.overAndClick(elementName, SigIn_xpath);
			con.waitAndClick(HomeLink_xpath, elementName ,300);
	}
	}

	@When("^I accept alert$")
	public void iAcceptAlert() {
		con.acceptAlertIfPresent(null, null);
	}
}
