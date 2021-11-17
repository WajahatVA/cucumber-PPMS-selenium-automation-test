$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/va/ppms/features/System ADMIN Role.feature");
formatter.feature({
  "name": "Providers page validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@BeforeeveryTest"
    },
    {
      "name": "@PPMS"
    },
    {
      "name": "@SystemADMINRole"
    }
  ]
});
formatter.scenarioOutline({
  "name": "TC001: (PPMS-1019)\u003d",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SystemADMINRole"
    }
  ]
});
formatter.step({
  "name": "I Logon to PPMS as a Basic and select the \"Home\" option from the left panel",
  "keyword": "And "
});
formatter.step({
  "name": "I select the \"Provider\" option from the left panel",
  "keyword": "And "
});
formatter.step({
  "name": "I verify page \u003cPageName\u003e is displayed",
  "keyword": "And "
});
formatter.step({
  "name": "I click the \"New\" button found in upper tool bar",
  "keyword": "And "
});
formatter.step({
  "name": "I From the provider type field select \u003cGroup Practice/Agency\u003e",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "PageName",
        "Group Practice/Agency"
      ]
    },
    {
      "cells": [
        "Active Providers",
        "Group Practice / Agency"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open CHROME",
  "keyword": "Given "
});
formatter.match({
  "location": "GenericSteps.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to URL",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC001: (PPMS-1019)\u003d",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BeforeeveryTest"
    },
    {
      "name": "@PPMS"
    },
    {
      "name": "@SystemADMINRole"
    },
    {
      "name": "@SystemADMINRole"
    }
  ]
});
formatter.step({
  "name": "I Logon to PPMS as a Basic and select the \"Home\" option from the left panel",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.mouseOnElement(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the \"Provider\" option from the left panel",
  "keyword": "And "
});
formatter.match({
  "location": "Providers.mouseOnElements(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify page Active Providers is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.verifyPageTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the \"New\" button found in upper tool bar",
  "keyword": "And "
});
formatter.match({
  "location": "Providers.New(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I From the provider type field select Group Practice / Agency",
  "keyword": "And "
});
formatter.match({
  "location": "Providers.practiceAgency(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/java/com/va/ppms/features/SystemAdministrator_Locator.feature");
formatter.feature({
  "name": "Providers page validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@BeforeeveryTest"
    },
    {
      "name": "@PPMS"
    }
  ]
});
formatter.scenarioOutline({
  "name": "TC001: (PPMS-1019) PPMS-160_System Administrator Role: Update notes in the activities field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SystemAdministrator"
    }
  ]
});
formatter.step({
  "name": "I Logon to PPMS as a Basic and select the \"Home\" option from the left panel",
  "keyword": "And "
});
formatter.step({
  "name": "I select the \"Provider\" option from the left panel",
  "keyword": "And "
});
formatter.step({
  "name": "I verify page \u003cPageName\u003e is displayed",
  "keyword": "And "
});
formatter.step({
  "name": "I Select a \"Provider\" from the list",
  "keyword": "And "
});
formatter.step({
  "name": "I From the Provider details page, select the \"Contact/Activities\" option at the top of the page",
  "keyword": "And "
});
formatter.step({
  "name": "I Scroll down the page to the Activities session and select the \"Enter a Note\" option",
  "keyword": "And "
});
formatter.step({
  "name": "I Enter a Note in the note input field and click \"Add Note\"",
  "keyword": "And "
});
formatter.step({
  "name": "I Open an existing note",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "PageName"
      ]
    },
    {
      "cells": [
        "Active Providers"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open CHROME",
  "keyword": "Given "
});
formatter.match({
  "location": "GenericSteps.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to URL",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC001: (PPMS-1019) PPMS-160_System Administrator Role: Update notes in the activities field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BeforeeveryTest"
    },
    {
      "name": "@PPMS"
    },
    {
      "name": "@SystemAdministrator"
    }
  ]
});
formatter.step({
  "name": "I Logon to PPMS as a Basic and select the \"Home\" option from the left panel",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.mouseOnElement(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the \"Provider\" option from the left panel",
  "keyword": "And "
});
formatter.match({
  "location": "Providers.mouseOnElements(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify page Active Providers is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.verifyPageTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Select a \"Provider\" from the list",
  "keyword": "And "
});
formatter.match({
  "location": "Providers.selectElement(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I From the Provider details page, select the \"Contact/Activities\" option at the top of the page",
  "keyword": "And "
});
formatter.match({
  "location": "Providers.selectanElement(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Scroll down the page to the Activities session and select the \"Enter a Note\" option",
  "keyword": "And "
});
formatter.match({
  "location": "Providers.clickElement(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Enter a Note in the note input field and click \"Add Note\"",
  "keyword": "And "
});
formatter.match({
  "location": "Providers.EnterNote(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Open an existing note",
  "keyword": "And "
});
formatter.match({
  "location": "Providers.openNote(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC002: (PPMS-1015) PPMS-563_System Administrator Role: Query the specialty search results in PL for the subservice",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SystemAdministrator"
    }
  ]
});
formatter.step({
  "name": "I Logon to PPMS as a Basic and select the \"Home\" option from the left panel",
  "keyword": "And "
});
formatter.step({
  "name": "I mouseover and select the \"Provider Locator\" Option",
  "keyword": "And "
});
formatter.step({
  "name": "I verify page \u003cPageName\u003e is displayed",
  "keyword": "And "
});
formatter.step({
  "name": "I Enter \u003cFull Address\u003e and \"SubServiceSearch\" and \u003cSub Service\u003e search option",
  "keyword": "And "
});
formatter.step({
  "name": "I Expand the Search Results",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "PageName",
        "Full Address",
        "Sub Service"
      ]
    },
    {
      "cells": [
        "Note:  VA Facilities will always display on the locator. PPMS does not define specialties for VA Facilities",
        "1065 N Sterling Ave, Palatine, Illinois 60067, United States",
        "Telehealth Appointment By Email (WJ Telehealth Appointment By Email)"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open CHROME",
  "keyword": "Given "
});
formatter.match({
  "location": "GenericSteps.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to URL",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC002: (PPMS-1015) PPMS-563_System Administrator Role: Query the specialty search results in PL for the subservice",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BeforeeveryTest"
    },
    {
      "name": "@PPMS"
    },
    {
      "name": "@SystemAdministrator"
    }
  ]
});
formatter.step({
  "name": "I Logon to PPMS as a Basic and select the \"Home\" option from the left panel",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.mouseOnElement(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I mouseover and select the \"Provider Locator\" Option",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderLocatorPage.mouseOnElements(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify page Note:  VA Facilities will always display on the locator. PPMS does not define specialties for VA Facilities is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.verifyPageTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Enter 1065 N Sterling Ave, Palatine, Illinois 60067, United States and \"SubServiceSearch\" and Telehealth Appointment By Email (WJ Telehealth Appointment By Email) search option",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderLocatorPage.addressAndSubSearch(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Expand the Search Results",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderLocatorPage.searchResults()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC003: (PPMS-1009) PPMS-454_System Administrator Role: Agreement Status Any Other Than Active",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SystemAdministrator"
    }
  ]
});
formatter.step({
  "name": "I Logon to PPMS as a Basic and select the \"Home\" option from the left panel",
  "keyword": "And "
});
formatter.step({
  "name": "I mouseover and select the \"Agreements\" Option",
  "keyword": "And "
});
formatter.step({
  "name": "I verify page \u003cPageName\u003e is displayed",
  "keyword": "And "
});
formatter.step({
  "name": "I search \u003cAgreement No\u003e in quick search",
  "keyword": "And "
});
formatter.step({
  "name": "I Select an \"active Provider\" from the list",
  "keyword": "And "
});
formatter.step({
  "name": "I Scroll down to the bottom of the VCA Agreement details page and locate the associated agreement Services",
  "keyword": "And "
});
formatter.step({
  "name": "I Select and Agreement Service with status \"Inactive\"",
  "keyword": "And "
});
formatter.step({
  "name": "I Click \"Activate\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "PageName",
        "Agreement No"
      ]
    },
    {
      "cells": [
        "Active Providers",
        "VCA1003066812"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open CHROME",
  "keyword": "Given "
});
formatter.match({
  "location": "GenericSteps.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to URL",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC003: (PPMS-1009) PPMS-454_System Administrator Role: Agreement Status Any Other Than Active",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BeforeeveryTest"
    },
    {
      "name": "@PPMS"
    },
    {
      "name": "@SystemAdministrator"
    }
  ]
});
formatter.step({
  "name": "I Logon to PPMS as a Basic and select the \"Home\" option from the left panel",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.mouseOnElement(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I mouseover and select the \"Agreements\" Option",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderLocatorPage.mouseOnElements(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify page Active Providers is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.verifyPageTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search VCA1003066812 in quick search",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderLocatorPage.quickSearchResults(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Select an \"active Provider\" from the list",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderLocatorPage.selectActive(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Scroll down to the bottom of the VCA Agreement details page and locate the associated agreement Services",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderLocatorPage.scrollDownOnActive()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Select and Agreement Service with status \"Inactive\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderLocatorPage.selectInActive(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click \"Activate\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderLocatorPage.clickActive(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC004: (PPMS-1364) PPMS-921_System Administrator _  No Special chars or spaces allowed for CountyFIPS Code",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SystemAdministrator"
    }
  ]
});
formatter.step({
  "name": "I Logon to PPMS as a Basic and select the \"Home\" option from the left panel",
  "keyword": "And "
});
formatter.step({
  "name": "I pick \"Provider Service\" option from the left panel",
  "keyword": "And "
});
formatter.step({
  "name": "I verify page \u003cPageName\u003e is displayed",
  "keyword": "And "
});
formatter.step({
  "name": "I click the \"New\" button found in upper tool bar",
  "keyword": "And "
});
formatter.step({
  "name": "I On the general Tab enter input for the \"Provider\" field \u003cProvider\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I On the general Tab enter input for the \"Network\" field \u003cProvider Network\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I On the general Tab enter input for the \"Specialty\" field \u003cSpecialty\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I click Care Site input box and select \"New Care site\" option",
  "keyword": "And "
});
formatter.step({
  "name": "I Enter all required input on the Quick Create: Care Site input page \u003cName\u003e, \u003cStreet\u003e, \u003cCity\u003e, \u003cState\u003e, \u003cZip\u003e, \u003cPhone\u003e",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "PageName",
        "Provider",
        "Provider Network",
        "Specialty",
        "Name",
        "Street",
        "City",
        "State",
        "Zip",
        "Phone"
      ]
    },
    {
      "cells": [
        "All Active Provider Services",
        "Automation Test Provider",
        "Local Contract",
        "Meditation Therapy",
        "Automation Test",
        "test",
        "Houston",
        "TX",
        "77080",
        "1111111111"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open CHROME",
  "keyword": "Given "
});
formatter.match({
  "location": "GenericSteps.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to URL",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC004: (PPMS-1364) PPMS-921_System Administrator _  No Special chars or spaces allowed for CountyFIPS Code",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BeforeeveryTest"
    },
    {
      "name": "@PPMS"
    },
    {
      "name": "@SystemAdministrator"
    }
  ]
});
formatter.step({
  "name": "I Logon to PPMS as a Basic and select the \"Home\" option from the left panel",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.mouseOnElement(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I pick \"Provider Service\" option from the left panel",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderServicesPage.mouseOnElements(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify page All Active Provider Services is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.verifyPageTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the \"New\" button found in upper tool bar",
  "keyword": "And "
});
formatter.match({
  "location": "Providers.New(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I On the general Tab enter input for the \"Provider\" field Automation Test Provider",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderServicesPage.Elements(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I On the general Tab enter input for the \"Network\" field Local Contract",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderServicesPage.Elements(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I On the general Tab enter input for the \"Specialty\" field Meditation Therapy",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderServicesPage.Elements(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Care Site input box and select \"New Care site\" option",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderServicesPage.Lookup(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Enter all required input on the Quick Create: Care Site input page Automation Test, test, Houston, TX, 77080, 1111111111",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderServicesPage.caresite(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC005: (PPMS-1368) PPMS-930 _ System Administrator_ Bulk edit care site Lat/Long",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SystemAdministrator"
    }
  ]
});
formatter.step({
  "name": "I Logon to PPMS as a Basic and select the \"Home\" option from the left panel",
  "keyword": "And "
});
formatter.step({
  "name": "I pick \"Facilities\" option from the left panel",
  "keyword": "And "
});
formatter.step({
  "name": "I verify page \u003cPageName\u003e is displayed",
  "keyword": "And "
});
formatter.step({
  "name": "I Select multiple facilities on the Facilities page and click on Edit option",
  "keyword": "And "
});
formatter.step({
  "name": "I Enter a new value in the Latitude and Longitude field and click Change",
  "keyword": "And "
});
formatter.step({
  "name": "I Open each facility included in the Bulk Update and confirm the new assigned Latitude and Longitude is saved and is the same for each facility included in the Bulk facility update",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "PageName"
      ]
    },
    {
      "cells": [
        "Active Facilities"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open CHROME",
  "keyword": "Given "
});
formatter.match({
  "location": "GenericSteps.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to URL",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC005: (PPMS-1368) PPMS-930 _ System Administrator_ Bulk edit care site Lat/Long",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BeforeeveryTest"
    },
    {
      "name": "@PPMS"
    },
    {
      "name": "@SystemAdministrator"
    }
  ]
});
formatter.step({
  "name": "I Logon to PPMS as a Basic and select the \"Home\" option from the left panel",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.mouseOnElement(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I pick \"Facilities\" option from the left panel",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderServicesPage.mouseOnElements(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify page Active Facilities is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.verifyPageTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Select multiple facilities on the Facilities page and click on Edit option",
  "keyword": "And "
});
formatter.match({
  "location": "Facilities.selectActive()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Enter a new value in the Latitude and Longitude field and click Change",
  "keyword": "And "
});
formatter.match({
  "location": "Facilities.input()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Open each facility included in the Bulk Update and confirm the new assigned Latitude and Longitude is saved and is the same for each facility included in the Bulk facility update",
  "keyword": "And "
});
formatter.match({
  "location": "Facilities.verify()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/java/com/va/ppms/features/SystemAdministrator_ProviderLocatorPage.feature");
formatter.feature({
  "name": "Provider locator page validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@BeforeeveryTest"
    },
    {
      "name": "@PPMS"
    },
    {
      "name": "@SystemAdministrator"
    }
  ]
});
formatter.scenarioOutline({
  "name": "TC001: (PPMS-1002) PPMS-821_System Administrator Role: An option to display At home services only using provider details drop down",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SystemAdministrator"
    }
  ]
});
formatter.step({
  "name": "I Logon to PPMS as a Basic and select the \"Home\" option from the left panel",
  "keyword": "And "
});
formatter.step({
  "name": "I mouseover and select the \"Provider Locator\" Option",
  "keyword": "And "
});
formatter.step({
  "name": "I verify page \u003cPageName\u003e is displayed",
  "keyword": "And "
});
formatter.step({
  "name": "I Enter \u003cFull Address\u003e and \"specialty search\" and \u003cspecialty search\u003e search option",
  "keyword": "And "
});
formatter.step({
  "name": "I Expand the Search Results",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "PageName",
        "Full Address",
        "specialty search"
      ]
    },
    {
      "cells": [
        "Note:  VA Facilities will always display on the locator. PPMS does not define specialties for VA Facilities",
        "1065 N Sterling Ave, Palatine, Illinois 60067, United States",
        "Meditation Therapy"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open CHROME",
  "keyword": "Given "
});
formatter.match({
  "location": "GenericSteps.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to URL",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC001: (PPMS-1002) PPMS-821_System Administrator Role: An option to display At home services only using provider details drop down",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BeforeeveryTest"
    },
    {
      "name": "@PPMS"
    },
    {
      "name": "@SystemAdministrator"
    },
    {
      "name": "@SystemAdministrator"
    }
  ]
});
formatter.step({
  "name": "I Logon to PPMS as a Basic and select the \"Home\" option from the left panel",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.mouseOnElement(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I mouseover and select the \"Provider Locator\" Option",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderLocatorPage.mouseOnElements(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify page Note:  VA Facilities will always display on the locator. PPMS does not define specialties for VA Facilities is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.verifyPageTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Enter 1065 N Sterling Ave, Palatine, Illinois 60067, United States and \"specialty search\" and Meditation Therapy search option",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderLocatorPage.addressAndSubSearch(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Expand the Search Results",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderLocatorPage.searchResults()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC002: (PPMS-998) PPMS-820_System Administrator Role: At Home Services are included with the specialty search results in Provider Locator UI",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SystemAdministrator"
    }
  ]
});
formatter.step({
  "name": "I Logon to PPMS as a Basic and select the \"Home\" option from the left panel",
  "keyword": "And "
});
formatter.step({
  "name": "I mouseover and select the \"Provider Locator\" Option",
  "keyword": "And "
});
formatter.step({
  "name": "I verify page \u003cPageName\u003e is displayed",
  "keyword": "And "
});
formatter.step({
  "name": "I Enter \u003cFull Address\u003e and \"specialty search\" and \u003cspecialty search\u003e search option",
  "keyword": "And "
});
formatter.step({
  "name": "I Expand the Search Results",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "PageName",
        "Full Address",
        "specialty search"
      ]
    },
    {
      "cells": [
        "Note:  VA Facilities will always display on the locator. PPMS does not define specialties for VA Facilities",
        "1065 N Sterling Ave, Palatine, Illinois 60067, United States",
        "1300 Gabel Road"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open CHROME",
  "keyword": "Given "
});
formatter.match({
  "location": "GenericSteps.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to URL",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC002: (PPMS-998) PPMS-820_System Administrator Role: At Home Services are included with the specialty search results in Provider Locator UI",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BeforeeveryTest"
    },
    {
      "name": "@PPMS"
    },
    {
      "name": "@SystemAdministrator"
    },
    {
      "name": "@SystemAdministrator"
    }
  ]
});
formatter.step({
  "name": "I Logon to PPMS as a Basic and select the \"Home\" option from the left panel",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.mouseOnElement(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I mouseover and select the \"Provider Locator\" Option",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderLocatorPage.mouseOnElements(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify page Note:  VA Facilities will always display on the locator. PPMS does not define specialties for VA Facilities is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.verifyPageTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Enter 1065 N Sterling Ave, Palatine, Illinois 60067, United States and \"specialty search\" and 1300 Gabel Road search option",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderLocatorPage.addressAndSubSearch(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Expand the Search Results",
  "keyword": "And "
});
formatter.match({
  "location": "ProviderLocatorPage.searchResults()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});