@SearchPageCars
Feature: Validate the Search Cars page

  Scenario: Positive test for the Search Cars page
    Given User is on the home page "https://www.carsguide.com.au/" of Carsguide website
    When user moves to the Menu
    | Menu       |
    | Buy + Sell |
    | Reviews    |
    And user clicks on "Search cars" link
    And user selects car brand from anymake dropdown list
      | carMake  |
      | BMW |
      | BMW  |
      | OPEL |
      | OPEL |
    And user selects car morel "1 SERIES" from select model drop down list
    And user selects location as "Australia" from select location drop down list
    And user selects price as "1000" from price drop down list
    And user clicks on Find_My_Next_Car button
    Then user should see list of returned car
    And the page tile should be "Bmw 1 Series under 1000 for Sale"