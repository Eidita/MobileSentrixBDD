@common
Feature: Login test

  @sprint0 @smoke @regression
  Scenario: As a tester I open MS application to
    enter my valid user name and password and I  click login button

    Given I want to open MS app
    When enter valid user name
    And enter valid password
    Then click login button
