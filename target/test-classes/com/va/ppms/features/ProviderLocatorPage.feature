@BeforeeveryTest @PPMS
Feature: Providers page validation

  Background: 
    Given I open CHROME
    And I go to URL

  #As a PPMS provider locator user I need the ability to search for a specialty and be able to query
  #the search results for the subservice from the search results so I can find the provider I am looking for
  #Add subservice column to grid and allow search from grid
  #Pre-Conditions
  #Create Pre-ConditionAssociate Pre-Conditions
  #This test is not associated with Pre-Conditions yet.
  Scenario Outline: TC001: (PPMS-1017) PPMS-563_Basic User: Query the specialty search results in PL for the subservice
    And I Logon to PPMS as a Basic and select the "Home" option from the left panel
    And I select the "Provider Locator" Option
    And I verify page <PageName> is displayed
    And I Enter the FULL Address <FullAddress>

    Examples: 
      | PageName                                                                                                    |Full Address|
      | Note:  VA Facilities will always display on the locator. PPMS does not define specialties for VA Facilities |1207 N BROADWAY ST|
