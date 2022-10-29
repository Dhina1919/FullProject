@Search
Feature: Verifying the Search Hotel page of Adactin Hotel

  Scenario Outline: Verifying search Hotel page of Adactin Hotel with valid credentails
    Given User is on the Adactin Page
    When User should perform login "<username>" and "<password>"
    Then User should verify after login success message "Hello Dhina1919!"
    And User should Search Hotel "<location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults Per Room>" and "<Children Per Room>"
    Then User should verify after Search Message "Select Hotel"

    Examples: 
      | username  | password   | location | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults Per Room | Children Per Room |
      | Dhina1919 | Dhina1919! | Paris    | Hotel Creek | Double    | 1- One          | 03-10-2022    | 05-10-2022     | 2- Two          | 0- None           |

  Scenario Outline: Verifying search Hotel page of Adactin Hotel by selecting only the mandatory fields
    Given User is on the Adactin Page
    When User should perform login "<username>" and "<password>"
    Then User should verify after login success message "Hello Dhina1919!"
    And User should only enter the mandatory fields "<location>","<Number of Rooms>","<Check In Date>","<Check Out Date>"and"<Adults Per Room>"
    Then User should verify after Search Message "Select Hotel"

    Examples: 
      | username  | password   | location | Number of Rooms | Check In Date | Check Out Date | Adults Per Room |
      | Dhina1919 | Dhina1919! | Paris    | 1- One          | 03-10-2022    | 05-10-2022     | 2- Two          |

  Scenario Outline: Verifying search Hotel page of Adactin Hotel by invaild date
    Given User is on the Adactin Page
    When User should perform login "<username>" and "<password>"
    Then User should verify after login success message "Hello Dhina1919!"
    And User should Search Hotel "<location>","<Number of Rooms>","<Check In Date>","<Check Out Date>"and"<Adults Per Room>"
    Then User should verify after Error message "Check In Date shall be before than Check-Out Date","<Check-Out Date shall be after than Check-In Date>"

    Examples: 
      | username  | password   | location | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults Per Room | Children Per Room |
      | Dhina1919 | Dhina1919! | Paris    | Hotel Creek | Double    | 1- One          | 03-10-2023    | 05-10-2022     | 2- Two          | 0- None           |

  Scenario Outline: Verifying search Hotel page of Adactin Hotel without selecting any of the fields
    Given User is on the Adactin Page
    When User should perform login "<username>" and "<password>"
    Then User should verify after login success message "Hello Dhina1919!"
    And User should Search Hotels Without entering the fields
    Then User should verify Error Message after search "Please Select a Location"

    Examples: 
      | username  | password   |
      | Dhina1919 | Dhina1919! |
