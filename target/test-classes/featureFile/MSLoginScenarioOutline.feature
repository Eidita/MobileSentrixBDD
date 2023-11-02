@ScenarioOutline
Feature: Mobile Sentrix test login page
  I want to use this template for my feature file

  Scenario Outline: as a tester i have to check
    my browser and url ,user name and password are working perfacly and close the app

    Given user enter valid <browser> and <url> to enter login page
    When enter <userName> and <password> in step
    And click <login> button
    Then close in step

    Examples: 
      | browser  | url                                                     | userName | password |
      | "Chrome" | "https://www.mobilesentrix.com/customer/account/login/" | "nbnmnm" | "jhbmn"  |
      | "Edge"   | "https://www.mobilesentrix.com/customer/account/login/" | "hjnmbm" | "hjnn"   |
