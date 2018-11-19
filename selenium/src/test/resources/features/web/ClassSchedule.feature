@classSchedule
Feature: Class Schedule

  Background:
    Given the Mindbody Login page is loaded

  Scenario: User able to successfully login
    When the Mindbody user logins to the mindbody account
    Then the Mindbody Home page should be displayed
    And the Dashboard subtab should be selected on the Home page
    When the user selects the Services & Pricing subtab in the Home page
    Then the user should land on the Classes link in the Services & Pricing page
    When the user clicks the 1st class schedule displayed in the Services & Pricing page
    Then the user should be land on the Class Schedule page









