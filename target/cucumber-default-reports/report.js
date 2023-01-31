$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CreateWorkOrder.feature");
formatter.feature({
  "name": "Create Work Order Steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "MetTeam work Order",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Progression"
    },
    {
      "name": "@Denys"
    }
  ]
});
formatter.step({
  "name": "Login With valid credentials",
  "keyword": "Given "
});
formatter.step({
  "name": "Click on Maintenance and click on the Asset",
  "keyword": "When "
});
formatter.step({
  "name": "Find Asset \"Find Asset\" is open and click on Add button",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Add Asset\" window is opened and click on Elipsis button next to the Customer",
  "keyword": "And "
});
formatter.step({
  "name": "\"Find Facility\" window is open werify title and click on Find button",
  "keyword": "Then "
});
formatter.step({
  "name": "find specific \"\u003cCustomer\u003e\" from the grid and click ok button",
  "keyword": "And "
});
formatter.step({
  "name": "Click on elipsis button next to the Type Description \"Find Type\" window is open",
  "keyword": "Then "
});
formatter.step({
  "name": "Click on the Find button then find \"\u003cSpecific type\u003e\" from the grid and click ok button",
  "keyword": "And "
});
formatter.step({
  "name": "click yes on Update all Asset data with current Type data?\" window",
  "keyword": "Then "
});
formatter.step({
  "name": "click on save button and Receive Asset",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Edit Work Order\" window is opened verify title and click on Add Result button",
  "keyword": "And "
});
formatter.step({
  "name": "Open Chromidium",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Specific type",
        "Customer"
      ]
    },
    {
      "cells": [
        "11",
        "My First Customer"
      ]
    }
  ]
});
formatter.scenario({
  "name": "MetTeam work Order",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Progression"
    },
    {
      "name": "@Denys"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Login With valid credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.LoginPageStepDefinitions.login_With_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Maintenance and click on the Asset",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.CreateWorkOrderFromAsset.click_on_Maintenance_and_click_on_the_Asset()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Find Asset \"Find Asset\" is open and click on Add button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateWorkOrderFromAsset.find_Asset_is_open_and_click_on_Add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Add Asset\" window is opened and click on Elipsis button next to the Customer",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateWorkOrderFromAsset.window_is_opened_and_click_on_Elipsis_button_next_to_the_Customer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Find Facility\" window is open werify title and click on Find button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateWorkOrderFromAsset.window_is_open_werify_title_and_click_on_Find_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "find specific \"My First Customer\" from the grid and click ok button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateWorkOrderFromAsset.find_specific_from_the_grid_and_click_ok_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on elipsis button next to the Type Description \"Find Type\" window is open",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateWorkOrderFromAsset.click_on_elipsis_button_next_to_the_Type_Description_window_is_open(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Find button then find \"11\" from the grid and click ok button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateWorkOrderFromAsset.click_on_the_Find_button_then_find_from_the_grid_and_click_ok_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click yes on Update all Asset data with current Type data?\" window",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateWorkOrderFromAsset.click_yes_on_Update_all_Asset_data_with_current_Type_data_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on save button and Receive Asset",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.CreateWorkOrderFromAsset.click_on_save_button_and_Receive_Asset()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Edit Work Order\" window is opened verify title and click on Add Result button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateWorkOrderFromAsset.window_is_opened_verify_title_and_click_on_Add_Result_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Open Chromidium",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.CreateWorkOrderFromAsset.open_Chromidium()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "MetTeam work Order");
formatter.after({
  "status": "passed"
});
});