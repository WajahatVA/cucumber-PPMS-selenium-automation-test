$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/va/ppms/features/System Administrator.feature");
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
  "name": "TC004: (PPMS-1002) PPMS-821_System Administrator Role: An option to display At home services only using provider details drop down",
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
  "name": "I select the \"Provider Locator\" Option",
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
  "name": "TC004: (PPMS-1002) PPMS-821_System Administrator Role: An option to display At home services only using provider details drop down",
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
  "name": "I select the \"Provider Locator\" Option",
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