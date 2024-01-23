#Author: Jayesh
#Keywords Summary :
#Feature: login pages
#Scenario: validate login page on admin site
#Given:
#When:
#Then:
#And,But:

Feature: Validate login page
  As a user, can enter valid username and password
  Valid: User can enter username and password
  Invalid: User can enter invalid username and invalid password
  @invalid
  Scenario: validate login UI
    Given open login pages as "Admin | Loan Management System"
    When validate the background image is present or not
    Then validate username label as "Username"
    And validate password label as "Password"
    And validate login text as "Login" and colour as "rgba(0, 123, 255, 1)"

   @invalid
  Scenario Outline: validate login with invalid inputs
    Given open login pages as "Admin | Loan Management System"
    When User enter username and password using "<username>" and "<password>"
    Then Click on login button
    Then display an error messages as  "<ErrorMsg>"
     Examples:
     |username|password|ErrorMsg|
     |test    |Test@123|Username or password is incorrect.|
     |        |        |Username or password is incorrect.|
     |Admin   |Admin   |Username or password is incorrect.|
  @invalid
  Scenario Outline: validate login with invalid inputs
    Given open login pages as "Admin | Loan Management System"
    When User enter username and password using "<username>" and "<password>"
    Then Click on login button
    Then display dashboard
    Examples:
      |username|password|
      |admin    |admin123|