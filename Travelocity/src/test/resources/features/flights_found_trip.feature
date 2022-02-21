#Author: duban2692@gmail.com

Feature: portal Travelocity
  As a transactional user
  I want to use Travelocity aplication
  to make flight reservations

  Scenario: book one way flight
    Given transactional user navigate to the login page
    When you enter city of origin and destination
    And the cheapest flights are listed
    Then flight is selected and booked