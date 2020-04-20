Feature: View all calender events
  As a user, I want to be able to see all calender events as a table

  @view_calender_event
  Scenario: User permission
    Given user is on the login page
    When user navigates to "Activities" and "Calender Events"
    Then View Per Page menu should have following options
      | 10  |
      | 25  |
      | 50  |
      | 100 |

