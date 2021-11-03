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
	
	String EditNote_xpath = "//button[@title=\"Edit this note\"]"; 
	//String EditNote_xpath = "//span[@class=\"symbolFont Edit-symbol  \"]"; 
	
	String MouseOverOnNoteEdited_xpath ="//*[contains(text(),'Note modified by')]";
	
	String NoteEdited_xpath = "//*[@class=\"cke_editable cke_editable_themed cke_contents_ltr\"]"; 
	
	String IFrame_xpath=  "//iframe[@title=\"Designer\"]";
	
	String IFrame_xpath1=  "//iframe[@class=\"cke_wysiwyg_frame cke_reset\"]"; 
	
	String AddnoteButton_xpath ="//*[contains(text(),'Add note')]"; 
	
	
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
//		con.waitAndClick(HomeLink_xpath, elementName ,300);
//		con.mouseOver(elementName, Providers_xpath);
//		con.mouseOver(elementName,ProviderName_xpath);
//		con.mouseOver(elementName,ContactActivities_xpath);
		con.scrollToPage(MouseOverOnNoteEdited_xpath, elementName);
		con.mouseOver(elementName, MouseOverOnNoteEdited_xpath);
		con.mouseOver(elementName, EditNote_xpath);
		con.buttonclick1(MouseOverOnNoteEdited_xpath);
		con.elementIsPresent(EditNote_xpath);
		//"Test Automation Note2", "Note");
		
	}

	
	
}
