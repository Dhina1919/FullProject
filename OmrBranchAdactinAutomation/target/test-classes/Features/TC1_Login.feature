@Login
Feature: Verifying Adactin Hotel Login details

  Scenario Outline: Verifying Adactin Hotel Login valid
    Given User is on the adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Dhina1919!"

    Examples: 
      | username  | password   |
      | Dhina1919 | Dhina1919! |

  Scenario Outline: Verifying Adactin Hotel Login valid using Enter
    Given User is on the adactin page
    When User should perform login "<username>","<password>" with Enter key
    Then User should verify after login success message "Hello Dhina1919!"

    Examples: 
      | username  | password   |
      | Dhina1919 | Dhina1919! |

  Scenario Outline: Verifying Adactin Hotel Login with invalid credentials
    Given User is on the adactin page
    When User should perform login "<username>","<password>"
    Then User should verify after login with invalid credentials error message contains "invalid Login details or your password might have expired"

    Examples: 
      | username  | password   |
      | Dhina1919 | Dhina1919! |
