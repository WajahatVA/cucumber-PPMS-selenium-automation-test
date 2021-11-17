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
  Scenario Outline: TC001: (PPMS-1019) PPMS-160_System Administrator Role: Update notes in the activities field
    And I Logon to PPMS as a Basic and select the "Home" option from the left panel
    And I select the "Provider" option from the left panel
    And I verify page <PageName> is displayed
    And I Select a "Provider" from the list
    And I From the Provider details page, select the "Contact/Activities" option at the top of the page
    And I Scroll down the page to the Activities session and select the "Enter a Note" option
    And I Enter a Note in the note input field and click "Add Note"
    And I Open an existing note

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
    And I select the "Provider Locator" option from the left panel
    And I verify page <PageName> is displayed
    And I Enter <Full Address> and "SubServiceSearch" and <Sub Service> search option
    And I Expand the Search Results

    Examples: 
      | PageName                                                                                                    | Full Address                                                 | Sub Service                                                          |
      | Note:  VA Facilities will always display on the locator. PPMS does not define specialties for VA Facilities | 1065 N Sterling Ave, Palatine, Illinois 60067, United States | Telehealth Appointment By Email (WJ Telehealth Appointment By Email) |

  ##Description
  #Agreement Status Any Other Than Active (US46504) - 
  #As a system administrator, I need the system to stop field users from modifying the status of a provider service so that the service status matches the agreement status.
  #Roles allowed to modify: System Administrator 
  #Pre-Conditions
  #Create Pre-ConditionAssociate Pre-Conditions
  #This test is not associated with Pre-Conditions yet.
  @SystemAdministrator
  Scenario Outline: TC003: (PPMS-1009) PPMS-454_System Administrator Role: Agreement Status Any Other Than Active
    And I Logon to PPMS as a Basic and select the "Home" option from the left panel
    And I select the "Agreements" Option
    And I verify page <PageName> is displayed
    And I search <Agreement No> in quick search
    And I Select an "active Provider" from the list
    And I Scroll down to the bottom of the VCA Agreement details page and locate the associated agreement Services
    And I Select and Agreement Service with status "Inactive"
    And I Click "Activate"

    Examples: 
      | PageName         | Agreement No  |
      | Active Providers | VCA1003066812 |

  #Add a mechanism to allow only digits into CountyFIPS fields on caresite form.
  #Rule applies to IWS ingestions or manual creation
  #Acceptance Criteria:
  #As PPMS user I can only enter 5digit code into CountyFips field
  @SystemAdministrator
  Scenario Outline: TC004: (PPMS-1364) PPMS-921_System Administrator _  No Special chars or spaces allowed for CountyFIPS Code
    And I Logon to PPMS as a Basic and select the "Home" option from the left panel
    And I pick "Provider Service" option from the left panel
    And I verify page <PageName> is displayed
    And I click the "New" button found in upper tool bar
    And I On the general Tab enter input for the "Provider" field <Provider>
    And I On the general Tab enter input for the "Network" field <Provider Network>
    And I On the general Tab enter input for the "Specialty" field <Specialty>
    And I click Care Site input box and select "New Care site" option
    And I Enter all required input on the Quick Create: Care Site input page <Name>, <Street>, <City>, <State>, <Zip>, <Phone>

    Examples: 
      | PageName                     | Provider                 | Provider Network | Specialty          | Name            | Street | City    | State | Zip   | Phone      |
      | All Active Provider Services | Automation Test Provider | Local Contract   | Meditation Therapy | Automation Test | test   | Houston | TX    | 77080 | 1111111111 |

  #As a PPMS System Administrator user I need the ability to bulk edit care sites to add the Latitude and longitude in the Change Multiple Records form so I can quickly edit a care sites location
  #Acceptance Criteria:
  #The Change Multiple Records form allows the Latitude and longitude to be edited by a System Administrator only
  #(example Care site Vanderbilt Medical Group, 3601 The Vanderbilt Clinic Nashville TN 37232)
  
  @SystemAdministrator
  Scenario Outline: TC005: (PPMS-1368) PPMS-930 _ System Administrator_ Bulk edit care site Lat/Long
    And I Logon to PPMS as a Basic and select the "Home" option from the left panel
    And I pick "Facilities" option from the left panel
    And I verify page <PageName> is displayed
    And I Select multiple facilities on the Facilities page and click on Edit option
    And I Enter a new value in the Latitude and Longitude field and click Change
    And I Open each facility included in the Bulk Update and confirm the new assigned Latitude and Longitude is saved and is the same for each facility included in the Bulk facility update
    Examples: 
      | PageName          | 
      | Active Facilities | 
