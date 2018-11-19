Feature:  DXOMark page test
#comment is here - feature description for search testing

#recurrent actions/preconditions go below - in "Background" section
#this section is optional. 
#Uncomment it and delete/comment duplicating step from Scenario description
#Background:
#Given user navigates to github home page

  Scenario: Open DXOMark page
    Given Start page is opened by default
    When User navigates to DXOMark page
    Then DXOMark page is opened

  Scenario: Open About page
    Given Start page is opened by default
    Given User navigates to DXOMark page
    When User click about item in navigation menu
    Then  About page is opened