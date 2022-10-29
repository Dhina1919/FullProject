@Book
Feature: Verifying the Book Hotel page of Adactin Hotel

  Scenario Outline: Verifying Book a Hotel page of Adactin Hotel by entering all fields
    Given User is on the Adactin Page
    When User should perform login "<username>" and "<password>"
    Then User should verify after login success message "Hello Dhina1919!"
    And User should Search Hotel "<location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults Per Room>" and "<Children Per Room>"
    Then User should verify after Search hotel success Message "Select Hotel"
    And User should select a hotel name
    Then User should verify after select hotel name success message "Book a hotel"
    And User should book a hotel "<FirstName>","<LastName>" and "<BillingAddress>"
      | Credit Card No   | Credit Card Type | Card Exp Month | Card Exp Year | CVV |
      | 1234567899874123 | Master Card      | December       |          2022 | 811 |
      | 1234567899874547 | VISA             | November       |          2022 | 729 |
      | 1234567899874478 | American Express | Novembr        |          2022 | 944 |
      | 1234567899874741 | Other            | October        |          2022 | 984 |
    Then User should verify after booking success message "Booking Confirmation"

    Examples: 
      | username  | password   | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childPerRoom | firstName | lastName | billingAddress |
      | Dhina1919 | Dhina1919! | Brisbane | Hotel Creek | Deluxe   | 4 - Four  | 07/10/2022  | 08/10/2022   | 2 - Two       | 2 - Two      | Dhina     | Karan    | Madipakkam     |

  Scenario Outline: Verifying Book a Hotel Page of Adactin Hotel without entering any fields
    Given User is on the adactin page
    When User should perform login "<username>", "<password>"
    Then User should verify the login success message "Hello Greens8767!"
    And User should search hotel "<location>", "<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    And User should select a hotel name
    Then User should verify after select hotel name success message "Book A Hotel"
    And User should click book now without entering any fields
    Then User should verify without enter any fields while booking error message "Please Enter your First Name", "Please Enter you Last Name", "Please Enter your Address", "Please Enter your 16 Digit Credit Card Number", "Please Select your Credit Card Type", "Please Select your Credit Card Expiry Month", "Please Enter your Credit Card CVV Number"

    Examples: 
      | username  | password   | location | roomType     | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childPerRoom | hotels      |
      | Dhina1919 | Dhina1919! | Brisbane | Super Deluxe | 4 - Four  | 02/10/2022  | 04/10/2022   | 1 - One       | 2 - Two      | Hotel Creek |
