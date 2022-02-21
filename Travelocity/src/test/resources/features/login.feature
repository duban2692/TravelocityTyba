#Author: duban2692@gmail.com

Feature: Login Travelocity
  As a transactional user
  I want to use Travelocity aplication
  to make transactions in aplication

  Scenario: User is logged in Travelocity
    Given transactional user navigate to the login page
    When enter your credentials
    Then he should be logged in