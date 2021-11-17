package com.va.ppms.steps;

import org.openqa.selenium.JavascriptExecutor;

import com.va.ppms.ExtentReportListener.WebConnector;

import cucumber.api.java.en.And;

public class ProviderServicesPage extends WebConnector {
	WebConnector con;

	public ProviderServicesPage(WebConnector con) {
		this.con = con;
	}

	public static JavascriptExecutor js = (JavascriptExecutor) driver;
	
	String ProviderService_xpath = "//span[contains(text(),'Provider Service')]";
	
	String Provider_xpath =  "//*[@aria-label=\"Provider, Lookup\"]";
	String Providerselect_xpath = "//span[contains(text(),'Automation Test Provider')]";
	
	String ProviderNetwork_xpath =  "//*[@aria-label=\"Provider Network, Lookup\"]";
	String ProviderNetworkselect_xpath = "//*[contains(text(),'Local Contract')]";
	
	String Specialty_xpath = "//*[@aria-label=\"Specialty, Lookup\"]";
	String Specialtyselect_xpath = "//*[contains(text(),'Meditation Therapy')]";
	
	String Caresite_xpath = "//*[@aria-label=\"Caresite, Lookup\"]";
	
	String Caresiteselect_xpath = "//*[contains(text(),'New Care Site')]";
	
	String CaresiteName_xpath =  "//*[@aria-label=\"Name\"]";
	String CaresiteStreet_xpath =  "//*[@aria-label=\"Street\"]";
	String CaresiteCity_xpath =  "//*[@aria-label=\"City\"]";
	String CaresiteState_xpath =  "//*[@aria-label=\"State, Lookup\"]";
	String CaresiteStatelookup_xpath =  "//*[@aria-label=\"Search records for State, Lookup field\"]";
	
	String FacilitiesLocator_xpath = "//span[contains(text(),'Facilities')]";
	
	String CaresiteZipCode_xpath =  "//*[@aria-label=\"Zip Code\"]";
	String CaresiteMainSitePhone_xpath =  "//*[@aria-label=\"Main Site Phone\"]";

	String IFrame_xpath= "//input[starts-with(@id, 'ClientApiFrame_id')]";
	
	@And("^I pick (.*) option from the left panel$")
    public void mouseOnElements(String elementName) throws Exception {
		if (elementName.contains("Provider Service")) {	
		con.mouseOver(elementName, ProviderService_xpath);
	} else if (elementName.contains("Facilities")) {
		con.mouseOver(elementName, FacilitiesLocator_xpath);
	}		
		
	}

	
	@And("^I On the general Tab enter input for the (.*) field (.*)$")
	    public void Elements(String elementName, String data) throws Exception {
		 
		 if (elementName.contains("Provider")) {
		 con.mouseOver(data, Provider_xpath);
		 con.mouseOver(data, Providerselect_xpath);
		 } else if (elementName.contains("Network")) {
			 
			 con.mouseOver(data, ProviderNetwork_xpath);
			 con.type(ProviderNetwork_xpath, data);
			
			 //con.enter( ProviderNetworkselect_xpath, data, "Provider Network");
			 con.mouseOver(data, ProviderNetworkselect_xpath);
			 
		 }else if (elementName.contains("Specialty")) {
			 con.mouseOver(data, Specialty_xpath);
			 con.enter( Specialty_xpath, data, "Provider Network");
			 con.mouseOver(data, Specialtyselect_xpath);
		 } 
	 
}
	
	 @And("^I click Care Site input box and select (.*) option$")
	 public void Lookup(String elementName) throws Exception {
		 con.mouseOver(elementName, Caresite_xpath);
		 con.mouseOver(elementName, Caresiteselect_xpath);
		 
		
	 }
	 
	 
	 @And("^I Enter all required input on the Quick Create: Care Site input page (.*), (.*), (.*),(.*), (.*), (.*)$")
	 public void caresite(String Name, String Street, String City, String State, String Zip, String Phone) throws Exception {
		 con.enter(CaresiteName_xpath, Name, Name);
		 con.enter(CaresiteStreet_xpath, Street, Street);
		 con.enter(CaresiteCity_xpath, City, City);
		 con.mouseOver(State,CaresiteState_xpath);
		 con.mouseOver( State, CaresiteStatelookup_xpath);
		 con.enter(CaresiteState_xpath, State, State);	 
		 con.enter(CaresiteZipCode_xpath, Zip, Zip);
		 con.enter(CaresiteMainSitePhone_xpath, Phone, Phone);
		 
		 
		 
	 }
	 
	 }
