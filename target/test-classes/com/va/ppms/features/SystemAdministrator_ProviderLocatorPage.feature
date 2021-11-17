@BeforeeveryTest @PPMS @SystemAdministrator
Feature: Provider locator page validation
  Background: 
    Given I open CHROME
    And I go to URL
    
  ## Description
  #As a PPMS user I need an option to display only "At home services" using provider details drop down , so I know all At home services available in my area.
  #Display At home services as a 2nd option/filter under Provider details driop down -> Care Type
  #Pre-Conditions
  #Create Pre-ConditionAssociate Pre-Conditions
  #This test is not associated with Pre-Conditions yet.
  @SystemAdministrator
  Scenario Outline: TC001: (PPMS-1002) PPMS-821_System Administrator Role: An option to display At home services only using provider details drop down
    And I Logon to PPMS as a Basic and select the "Home" option from the left panel
    And I mouseover and select the "Provider Locator" Option
    And I verify page <PageName> is displayed
    And I Enter <Full Address> and "specialty search" and <specialty search> search option
    And I Expand the Search Results

    Examples: 
      | PageName                                                                                                    | Full Address                                                 | specialty search |
      | Note:  VA Facilities will always display on the locator. PPMS does not define specialties for VA Facilities | 1065 N Sterling Ave, Palatine, Illinois 60067, United States |  Meditation Therapy  |

  ## Description
  #As a PPMS user I need all services including at home services included with the specialty search results so I know all services available in my area
  #A full address is required to conduct a search
  #Display all At home search results as top of search results and display Home Icon in the first column for At home services.
  #Change label : Search Location (Required) -> change to -> Search Location (Full Address is required), and display error message if full address is not provided.
  #Miles and Mins are not applicable for At home service: display N/A
  #A full address is required to conduct a search
  #At Home Services are included with the specialty search results
  #Pre-Conditions
  #Create Pre-ConditionAssociate Pre-Conditions
  #This test is not associated with Pre-Conditions yet.
  @SystemAdministrator
  Scenario Outline: TC002: (PPMS-998) PPMS-820_System Administrator Role: At Home Services are included with the specialty search results in Provider Locator UI
    And I Logon to PPMS as a Basic and select the "Home" option from the left panel
    And I mouseover and select the "Provider Locator" Option
    And I verify page <PageName> is displayed
    And I Enter <Full Address> and "specialty search" and <specialty search> search option
    And I Expand the Search Results

    Examples: 
      | PageName                                                                                                    | Full Address                                                 | specialty search |
      | Note:  VA Facilities will always display on the locator. PPMS does not define specialties for VA Facilities | 1065 N Sterling Ave, Palatine, Illinois 60067, United States | 1300 Gabel Road  |
