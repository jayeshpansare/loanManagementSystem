#Author: Jayesh
#Keywords Summary :
#Feature: login pages
#Scenario: validate login page on admin site
#Given:
#When:
#Then:
#And,But:

Feature: Validate loan plan page
  As a user, can enter valid plan details like as months, interest, penalty

  @invalid
  Scenario: validate loan plan page UI
    Given open loan plan pages
    When validate page form title as "Plan's Form"
    Then validate plan label as "Plan (months)"
    And validate interest label as "Interest"
    And validate penalty label as "Monthly Over due's Penalty"
    And validate save button text as " Save" and btn background colour is "#007bff"
    And validate cancel button text as " Cancel" and btn background colour as "#212529"

  Scenario: validate loan table UI
    Given loan page must be available as "Plan's Form"
    When loan table must be available
    Then validate table title as "Plan" and "Action"

  Scenario Outline: validate add plan form with valid inputs
    Given plan form must be available
    When user enter month as "<month>" and interest as "<interest>" and penalty as "<penalty>"
    And click on save button
    Then display success message as "<message>"
    Examples:
    |month|interest|penalty|message|
    |3    |4.5     |2      |data is added|

  Scenario Outline: validate added data into table
    Given loan table must be available
    When validate "<month>" and "<interest>" and "<penalty>" into table
    Then click on edit button on loan table
    Examples:
      |month|interest|penalty|
      |3    |4.5     |2      |

    Scenario Outline: validate edit form
      Given loan page must be available as "Plan's Form"
      When user enter month as "<month>" and interest as "<interest>" and penalty as "<penalty>"
      And click on save button
      Then display success message as "<message>"
      Examples:
        |month|interest|penalty|message|
        |5    |5    |5      |data is added|

  Scenario Outline: validate added data into table
    Given loan table must be available
    When validate "<month>" and "<interest>" and "<penalty>" into table
    Then click on edit button on loan table
    Examples:
      |month|interest|penalty|
      |5    |5     |5      |

    Scenario Outline: validate delete action
      Given loan table must be available
      When user click on delete button
      Then validate delete title message as "Confirmation" and body as "Are you sure to delete this Plan?"
      And user click on continue button
      Then validate data is not present into table "<month>" and "<interest>" and "<penalty>"
      Examples:
        |month|interest|penalty|
        |5    |5     |5      |


