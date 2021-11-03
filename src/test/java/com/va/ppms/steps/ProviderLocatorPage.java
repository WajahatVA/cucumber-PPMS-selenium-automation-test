package com.va.ppms.steps;

import org.openqa.selenium.JavascriptExecutor;

import com.va.ppms.ExtentReportListener.WebConnector;

import cucumber.api.java.en.And;

public class ProviderLocatorPage extends WebConnector {
	WebConnector con;

	public ProviderLocatorPage(WebConnector con) {
		this.con = con;
	}

	public static JavascriptExecutor js = (JavascriptExecutor) driver;
	
	String ProviderLocator_xpath = "//span[contains(text(),'Provider Locator')]";
	
	String FullAddress_xpath=  "//*[@class=\"form-control required searchBox\"]";
	
	String SubServiceSearch_xpath= "//*[@id=\"subsvcsearch\"]";
	
	String Sub_Services_xpath= "//*[@id=\"Sub_Services\"]";
	
	String Specialties_xpath= "//*[@id=\"Specialties\"]";
	
	String SpecialtiesLocator_xpath = "//*[contains(text(),'1300 Gabel Road')]";
	
	String SubServiceLocator_xpath = "//*[contains(text(),'Telehealth Appointment By Email (WJ Telehealth Appointment By Email)')]";
	
	String TableDisplayed_xapth= "//*[@class=\"viewprofile\"]";

	
	String SearchBtn_xpath= "//*[@id=\"searchBtn\"]";
	
	String IFrame_xpath=  "//iframe[@id=\"FullPageWebResource\"]";
	
	String IFrame_xpath1=  "//iframe[@class=\"cke_wysiwyg_frame cke_reset\"]"; 

	

	
	@And("^I select the (.*) Option$")
    public void mouseOnElements(String elementName) throws Exception {
			con.mouseOver(elementName, ProviderLocator_xpath);
	}
	
	@And("^I Enter the FULL Address(.*)$")
    public void editFullAddress(String elementName) throws Exception {
			con.enter(FullAddress_xpath, elementName, "Enter full address");
	}
	
	@And("^I Enter (.*) and (.*) and (.*) search option$")
	   public void addressAndSubSearch(String elementName, String element, String SubServiceSearch ) throws Exception {
		       con.iFrame(IFrame_xpath);		
		       con.type(FullAddress_xpath, elementName);
		       if (element.contains("SubServiceSearch")) {
			   con.mouseOver(elementName, SubServiceSearch_xpath);
			   con.enter(Sub_Services_xpath, SubServiceSearch, "Sub Service Search");
			   con.mouseOver(elementName,SubServiceLocator_xpath);
		       } else {
		    	   con.enter(Specialties_xpath, SubServiceSearch, "Specialties Search");
				   con.mouseOver(elementName,SpecialtiesLocator_xpath);
		       }
			   con.buttonclick(SearchBtn_xpath);
			   
		}
	
	@And("^I Expand the Search Results$")
	   public void searchResults() throws Exception {
		      
			   con.Table(TableDisplayed_xapth, "Table after a search button");
			   
		}
	
}
