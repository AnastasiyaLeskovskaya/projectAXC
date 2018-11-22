Feature:  About page test

  Scenario: Verify Chinese language
    Given Start page is opened by default
    Given User navigates to About page
    When  User clicks language icon
    And   Check, that home language is English
    And  Chooses Chinese language item
    Then Home language is changed on Chinese

  Scenario: Return to the DXOMark page
    Given Start page is opened by default
    Given User navigates to About page
    When  User click DOMMark item
    Then  DXOMark page is opened