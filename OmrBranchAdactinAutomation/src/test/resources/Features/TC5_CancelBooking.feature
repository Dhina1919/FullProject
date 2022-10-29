@Cancel
Feature: Verifying the Booked Itinerary page of Adactin Hotel

  Scenario Outline: Verifying Booked Itinerary page of Adactin Hotel by cancelling book order ID
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
    And User should verify after cancel order ID success message "The booking has been cancelled."

    Examples: 
      | username  | password   | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childPerRoom | firstName | lastName | billingAddress |
      | Dhina1919 | Dhina1919! | Brisbane | Hotel Creek | Deluxe   | 4 - Four  | 07/10/2022  | 08/10/2022   | 2 - Two       | 2 - Two      | Dhina     | Karan    | Madipakkam     |

  Scenario Outline: Verifying Booked Itinerary page of Adactin Hotel by cancelling the existing order ID
    Given User is on the Adactin Page
    When User should perform login "<username>" and "<password>"
    Then User should verify after login success message "Hello Dhina1919!"
    And User should cancel existing order ID "<orderID>"
    And User should verify after cancel order ID success message "The booking has been cancelled."

    Examples: 
      | username  | password   | orderID    |
      | Dhina1919 | Dhina1919! | 9950QE6I41 |
