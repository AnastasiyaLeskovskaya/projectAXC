Feature:  About page test
#comment is here - feature description for search testing

#recurrent actions/preconditions go below - in "Background" section
#this section is optional.
#Uncomment it and delete/comment duplicating step from Scenario description
#Background:
#Given user navigates to github home page
#
#  Scenario: 0.1 Open DXOMark page
#    Given User navigates to Main page
#    When  User click about button
#    Then  About page is opened

  Scenario: Verify Chinese language
    Given Start page is opened by default
    Given User navigates to About page
    When  User clicks language icon
    And  Chooses Chinese language item
    Then Home language is Chinese

#  Scenario: Return main page
#    Given User navigates to About page
#    When  User click language icon
#    And  Chooses chinese language
#    And  Return Main page
#    Then  Verify Main page