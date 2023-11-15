@sprint1
Feature: login MS app with url

  Scenario: as a tester i want to open MS app with Url
    Given user open "Chrome" and "https://www.mobilesentrix.com/customer/account/login/"
    When user enter username "gcvbvn"
    And user enter password "ghvnmnm134555"
    Then logged into MS app
    
    Given user open "edge" and "https://www.mobilesentrix.com/customer/account/login/"
    When user enter username "dhgcnb "
    And user enter password "ghvdvfxv134555"
    Then logged into MS app
