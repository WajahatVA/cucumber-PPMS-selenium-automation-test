package com.va.ppms.steps;

import org.openqa.selenium.JavascriptExecutor;

import com.va.ppms.ExtentReportListener.WebConnector;

import cucumber.api.java.en.And;

public class Facilities extends WebConnector {
	WebConnector con;

	public Facilities(WebConnector con) {
		this.con = con;
	}

	public static JavascriptExecutor js = (JavascriptExecutor) driver;

	String deActivateBtn_xpath= "//*[@data-icon-name=\"StatusCircleCheckmark\"]";
	String facility1Locator_xpath = "//*[contains(text(),'Aberdeen MS CBOC (438GD)')]";
	String facility2Locator_xpath = "//*[contains(text(),'Abilene MS CBOC (519HC)')]";
	String EditBtn_xpath= "//*[@aria-label=\"Edit\"]";
	String LatitudeEdit_xpath= "//*[@aria-label=\"Latitude\"]";
	String LongitudeEdit_xpath= "//*[@aria-label=\"Longitude\"]";
	String SaveBtn_xpath= "//*[@aria-label=\"Save\"]";
	
	String BackBtn_xpath= "//*[@aria-label=\"Press Enter to go back.\"]";
	

	@And("^I Select multiple facilities on the Facilities page and click on Edit option$")
	public void selectActive() throws Exception {	
		con.onlyMouseOver(facility1Locator_xpath);
			con.RadioButton( deActivateBtn_xpath, 1);
			
			con.onlyMouseOver(facility2Locator_xpath);
			con.RadioButton( deActivateBtn_xpath, 2);
			
			con.mouseOver("Edit button", EditBtn_xpath);
		}
	
	
	@And("^I Enter a new value in the Latitude and Longitude field and click Change$")
	public void input() throws Exception {	
		
		con.scrollToPage(LatitudeEdit_xpath, "Latitude Edith");
		con.type(LatitudeEdit_xpath, "200");
		con.type(LongitudeEdit_xpath, "500");
		con.mouseOver("Save", SaveBtn_xpath);
		}
	
	@And("^I Open each facility included in the Bulk Update and confirm the new assigned Latitude and Longitude is saved and is the same for each facility included in the Bulk facility update$")
	public void verify() throws Exception {	
		con.mouseOver("Aberdeen MS CBOC (438GD)", facility1Locator_xpath);
		con.scrollToPage(LatitudeEdit_xpath, "Latitude Edith");
		con.mouseOver("Back button", BackBtn_xpath);

		con.mouseOver("Abilene MS CBOC (519HC)", facility2Locator_xpath);
		con.scrollToPage(LatitudeEdit_xpath, "Latitude Edith");
		}
	
}
