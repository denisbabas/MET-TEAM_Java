Feature: Create Work Order Steps

  @Progression @Denys
  Scenario Outline: MetTeam work Order
    Given Login With valid credentials
    When Click on Maintenance and click on the Asset
    Then Find Asset "Find Asset" is open and click on Add button
    And "Add Asset" window is opened and click on Elipsis button next to the Customer
    Then "Find Facility" window is open werify title and click on Find button
    And find specific "<Customer>" from the grid and click ok button
    Then Click on elipsis button next to the Type Description "Find Type" window is open
    And Click on the Find button then find "<Specific type>" from the grid and click ok button
    Then click yes on Update all Asset data with current Type data?" window
    Then click on save button and Receive Asset
    And "Edit Work Order" window is opened verify title and click on Add Result button
    And Open Chromidium

    Examples: 
      | Specific type | Customer          |
      |            11 | My First Customer |
