Feature:  DXOMark page test

  Scenario: Open DXOMark page
    Given Start page is opened by default
    When User navigates to DXOMark page
    Then DXOMark page is opened

  Scenario: Open About page
    Given Start page is opened by default
    Given User navigates to DXOMark page
    When User click about item in navigation menu
    Then  About page is opened