package com.va.ppms.steps;

import org.openqa.selenium.JavascriptExecutor;

import com.va.ppms.ExtentReportListener.WebConnector;

import cucumber.api.java.en.And;

public class Providers extends WebConnector {
	WebConnector con;

	public Providers(WebConnector con) {
		this.con = con;
	}

	public static JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	String Providers_xpath = "//span[contains(text(),'Providers')]";
	
	String ProviderName_xpath = "//span[contains(text(),'1 2 3 SPEECH')]";
	
	String ContactActivities_xpath = "//*[@title=\"Contact / Activities\"]";
	
	String Identifiers_xpath = "//*[@title=\"Identifiers / DEA / License\"]";
	
	String EnterANote_xpath = "//span[contains(text(),'Enter a note...')]";
	
	String EnternewNote_xpath = "//*[contains(text(),'Enter text...')]";
	
	String NewNote_xpath= "//input[@id=\"create_note_medium_title\"]";
	
	
	
	String eNewNote_xpath= "//input[starts-with(@id, 'create_note_medium_title')]";
	
	String EditNote_xpath = "//span[@class=\"symbolFont Edit-symbol  \"]"; 
	
	String DeleteNote_xpath ="//span[@class=\"symbolFont Delete-symbol  \"]"; 
	
	String MouseOverOnNoteEdited_xpath ="//*[contains(text(),'Note modified by')]";
	
	String NoteEdited_xpath = "//*[@class=\"cke_editable cke_editable_themed cke_contents_ltr\"]";
	
	String EditsNote_xpath = "//*[contains(text(),'Test Automation Note')]";
	
	String IFrame_xpath=  "//iframe[@title=\"Designer\"]";
	
	String IFrame_xpath1=  "//iframe[@class=\"cke_wysiwyg_frame cke_reset\"]"; 
	
	String AddnoteButton_xpath ="//*[contains(text(),'Add note')]"; 
	
	String SavenoteButton_xpath ="//*[contains(text(),'Cancel')]"; 
	
	String CancelnoteButton_xpath= "//*[starts-with(@id, 'id-3562fc31-58d9-4fd0-985f-') and contains(@id, 'save_button')]";
	
	String deleteokxpath= "//*[@id=\"confirmButton\"]";
	
	String New_xpath = "//*[@title=\"New\"]";
	
	String providertype_xpath = "//*[@aria-label=\"Provider Type\"]";

	
//***************************************************************************************************	
	@And("^I select the (.*) option from the left panel$")
    public void mouseOnElements(String elementName) throws Exception {
			con.mouseOver(elementName, Providers_xpath);
	}
	
	@And("^I Select a (.*) from the list$")
	public void selectElement(String elementName) throws Exception {	
			con.mouseOver(elementName,ProviderName_xpath);
		}

	@And("^I From the Provider details page, select the (.*) option at the top of the page$")
	public void selectanElement(String elementName) throws Exception {	
			con.mouseOver(elementName,ContactActivities_xpath);
		}
	@And("^I Scroll down the page to the Activities session and select the (.*) option$")
	public void clickElement(String elementName) throws Exception {	
		con.mouseOver(elementName, EnterANote_xpath);
	//	con.buttonclick(EnterANote_xpath);
	//	con.enter(NoteEdited_xpath, "Test", "Edit Notes");
	}

	@And("^I Enter a Note in the note input field and click(.*)$")
	public void EnterNote(String elementName) throws Exception {	
		con.enter(NewNote_xpath, "Test Automation Note", "Note");
		con.iFrame(IFrame_xpath);
		con.iFrame(IFrame_xpath1);
		con.enter(EnternewNote_xpath, "Test Automation Note", "Note");
		con.iFrameDefault();
		con.buttonclick(AddnoteButton_xpath);
		
	}
	

	@And("^I Open an existing note(.*)$")
	public void openNote(String elementName) throws Exception {	
		con.mouseOver(elementName,Identifiers_xpath);
		con.mouseOver(elementName,ContactActivities_xpath);
		con.scrollToPage(MouseOverOnNoteEdited_xpath, elementName);
		
		con.mouseOver(elementName, MouseOverOnNoteEdited_xpath);
		
		con.mouseOver(elementName, EditNote_xpath);
		con.enter(eNewNote_xpath, "Tes3t Automation Note", "Note");
		
		con.iFrame(IFrame_xpath);
		con.iFrame(IFrame_xpath1);
		con.enter(EditsNote_xpath, "T2st Automatio2n Note2", "Note");
		
		con.iFrameDefault();
		con.scrollToPage(SavenoteButton_xpath, elementName);
		con.buttonclick(CancelnoteButton_xpath);
		con.mouseOver(elementName, DeleteNote_xpath);
		con.mouseOver(elementName, deleteokxpath);
		

		
	}

	@And("^I click the (.*) button found in upper tool bar$")
	public void New(String elementName) throws Exception {	
		con.mouseOver(elementName, New_xpath);
		
	}
	
	@And("^I From the provider type field select (.*)$")
	public void practiceAgency(String elementName) throws Exception {	
		con.selectfromDropDown(providertype_xpath, elementName, "provider type field");
		
	}
	

}
