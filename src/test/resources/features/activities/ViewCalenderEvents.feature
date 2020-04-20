@view_calender_events
Feature: View all calender events
  As a user, I want to be able to see all calender events as a table


  Scenario: User permission
    Given user is on the login page
    When user logs in as a sales manager
    When user navigates to "Activities" and "Calendar Events"
    Then View Per Page menu should have following options
      | 10  |
      | 25  |
      | 50  |
      | 100 |

