@BeforeeveryTest @PPMS 
Feature: Providers page validation

  Background: 
    Given I open CHROME
    And I go to URL

  # As a PPMS user I need the ability to update notes in the activities field located on the provider information page so additional information
  # can be added for the provider Ensuring data is available, then follow story of provider available, provider not available, so most recent is showing first.
  # Roles: All users
  # Pre-Conditions: This test is not associated with Pre-Conditions yet.
  
  @SystemAdministrator
  Scenario Outline: TC001: (PPMS-1019) PPMS-160_Basic User: Update notes in the activities field
    And I Logon to PPMS as a Basic and select the "Home" option from the left panel
    And I select the "Provider" option from the left panel
    And I verify page <PageName> is displayed
    And I Select a "Provider" from the list
    And I From the Provider details page, select the "Contact/Activities" option at the top of the page
    And I Scroll down the page to the Activities session and select the "Enter a Note" option
    And I Enter a Note in the note input field and click "Add Note"
    # And I Open an existing note
    # And I Edit existing note; confirm note update and order
  
    Examples: 
      | PageName         |
      | Active Providers |
      
      

##Description    
#As a PPMS provider locator user I need the ability to search for a specialty and be able to query the search results for the subservice from the search results so I can find the provider I am looking for
#Add subservice column to grid and allow search from grid
#The provider locator returns the subspecialty (subspecialties) if any with the specialty search results
#The subspecialties are searchable from the original PL search results (this may already be available)
  #Pre-Conditions
  #Create Pre-ConditionAssociate Pre-Conditions
  #This test is not associated with Pre-Conditions yet.
  
  @SystemAdministrator
  Scenario Outline: TC002: (PPMS-1015) PPMS-563_System Administrator Role: Query the specialty search results in PL for the subservice
    And I Logon to PPMS as a Basic and select the "Home" option from the left panel
    And I select the "Provider Locator" Option
    And I verify page <PageName> is displayed
    And I Enter <Full Address> and "SubServiceSearch" and <Sub Service> search option
    And I Expand the Search Results

    Examples: 
      | PageName                                                                                                    |Full Address| Sub Service|
      | Note:  VA Facilities will always display on the locator. PPMS does not define specialties for VA Facilities |1065 N Sterling Ave, Palatine, Illinois 60067, United States|Telehealth Appointment By Email (WJ Telehealth Appointment By Email)|
      
      
      ## Description
#As a PPMS user I need an option to display only "At home services" using provider details drop down , so I know all At home services available in my area.
#Display At home services as a 2nd option/filter under Provider details driop down -> Care Type
     #Pre-Conditions
  #Create Pre-ConditionAssociate Pre-Conditions
  #This test is not associated with Pre-Conditions yet.
  
      @SystemAdministrator
  Scenario Outline: TC004: (PPMS-1002) PPMS-821_System Administrator Role: An option to display At home services only using provider details drop down
    And I Logon to PPMS as a Basic and select the "Home" option from the left panel
    And I select the "Provider Locator" Option
    And I verify page <PageName> is displayed
    And I Enter <Full Address> and "specialty search" and <specialty search> search option
    And I Expand the Search Results

    Examples: 
      | PageName                                                                                                    |Full Address| specialty search|
      | Note:  VA Facilities will always display on the locator. PPMS does not define specialties for VA Facilities |1065 N Sterling Ave, Palatine, Illinois 60067, United States|1300 Gabel Road|
      
      
      