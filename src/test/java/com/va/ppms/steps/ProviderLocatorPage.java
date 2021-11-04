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
	String ActiveProvider_xpath = "//span[contains(text(),'VCA1003066812')]";
	
	String AgreementServices_xpath=  "//*[@title=\"Agreement Services\"]";
	
	String ServiceInactive_xpath=  "//*[@title=\"Inactive\"]";
	
	String ServicePending_xpath=  "//*[@title=\"Pending\"]";

	
	String Activate_xpath= "//span[starts-with(@class, 'symbolFont Activate-symbol')]";
	
	String ActivateBtn_xpath= "//*[starts-with(@id, 'dialogButtonText_id-')]";
	
	String deActivateBtn_xpath= "//*[ends-with(@id, 'Deactivate2id-563-button')]";


	String ProviderLocator_xpath = "//span[contains(text(),'Provider Locator')]";
	
	String AgreementsLocator_xpath = "//span[contains(text(),'Agreements')]";
		
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
	
	String QuickSearch_xapth= "//*[@title=\"Select to enter data\"]";
	
	String QuickSearchBtn_xapth= "//*[@title=\"Start search\"]";
	

	

	
	@And("^I select the (.*) Option$")
    public void mouseOnElements(String elementName) throws Exception {
		if (elementName.contains("Provider Locator")) {
			con.mouseOver(elementName, ProviderLocator_xpath);
		}else if (elementName.contains("Agreements")) {
			con.mouseOver(elementName, AgreementsLocator_xpath);
		}
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
	@And("^I search (.*) in quick search$")
	   public void quickSearchResults(String element) throws Exception {  
			   con.type(QuickSearch_xapth, element);
			   con.buttonclick(QuickSearchBtn_xapth);
			   
		}
	
	@And("^I Select an (.*) from the list$")
	public void selectActive(String elementName) throws Exception {	
			con.mouseOver(elementName, ActiveProvider_xpath);
		}
	
	@And("^I Scroll down to the bottom of the VCA Agreement details page and locate the associated agreement Services$")
	public void scrollDownOnActive() throws Exception {	
		con.scrollToPage(AgreementServices_xpath, "Agreement Services");
		}
	
	@And("^I Select and Agreement Service with status(.*)$")
	public void selectInActive(String element) throws Exception {	
		con.mouseOver(element, ServiceInactive_xpath );
		}
	
	@And("^I Click(.*)$")
	public void clickActive(String element) throws Exception {	
		con.mouseOver(element, Activate_xpath );
		con.mouseOver(element, ActivateBtn_xpath);
		con.mouseOver(element, ServicePending_xpath);
	//	con.mouseOver(element, deActivateBtn_xpath);
		
		}
	
}
