@BeforeeveryTest @PPMS @SystemADMINRole
Feature: Providers page validation

  Background: 
    Given I open CHROME
    And I go to URL

      @SystemADMINRole 
  Scenario Outline: TC001: (PPMS-1019)=
    And I Logon to PPMS as a Basic and select the "Home" option from the left panel
    And I select the "Provider" option from the left panel
    And I verify page <PageName> is displayed
    And I click the "New" button found in upper tool bar
    And I From the provider type field select <Group Practice/Agency>
    
  
    Examples: 
      | PageName         |Group Practice/Agency |
      | Active Providers |Group Practice / Agency|
      
