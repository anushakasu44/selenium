
@Orangehrm
Feature: login button validation
 
@smoke
  Scenario Outline: login with correct username and password
    Given user navigates to browser
     When user enters <Firstname> and <LastName>
    And user clicks on signin button
    Then user can able to login sucessfully

    Examples: 
      | Firstname     |     LastName    | 
      | Admin         |      admin123   | 
      |JohnSmith      |   Greenfr0g@123 |