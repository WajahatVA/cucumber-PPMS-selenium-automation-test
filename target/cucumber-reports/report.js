$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/va/ppms/features/SystemAdministrator_Locator.feature");
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
  "name": "TC005: (PPMS-1368) PPMS-930 _ System Administrator_ Bulk edit care site Lat/Long",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SystemAdministrator2"
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
      "name": "@SystemAdministrator2"
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
});