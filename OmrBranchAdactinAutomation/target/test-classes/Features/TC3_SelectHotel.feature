@Select
Feature: Verifying the Select Hotel page of Adactin Hotel

  Scenario Outline: Verifying Select Hotel page of Adactin Hotel by entering all fields
    Given User is on the Adactin Page
    When User should perform login "<username>" and "<password>"
    Then User should verify after login success message "Hello Dhina1919!"
    And User should Search Hotel "<location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults Per Room>" and "<Children Per Room>"
    Then User should verify after Search hotel success Message "Select Hotel"
    And User should select a hotel name
    Then User should verify after select hotel name success message "Select Hotel"

    Examples: 
      | username  | password   | location | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults Per Room | Children Per Room |
      | Dhina1919 | Dhina1919! | Paris    | Hotel Creek | Double    | 1- One          | 03-10-2022    | 05-10-2022     | 2- Two          | 0- None           |

  Scenario Outline: Verifying Select Hotel page of Adactin Hotel without selecting hotel
    Given User is on the Adactin Page
    When User should perform login "<username>" and "<password>"
    Then User should verify after login success message "Hello Dhina1919!"
    And User should Search Hotel "<location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults Per Room>" and "<Children Per Room>"
    Then User should verify after Search hotel success Message "Select Hotel"
    And User should click continue without select any hotel name
    Then User should verify without select any hotel name error message "Please Select a Hotel"

    Examples: 
      | username  | password   | location | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults Per Room | Children Per Room |
      | Dhina1919 | Dhina1919! | Paris    | Hotel Creek | Double    | 1- One          | 03-10-2022    | 05-10-2022     | 2- Two          | 2- None           |
