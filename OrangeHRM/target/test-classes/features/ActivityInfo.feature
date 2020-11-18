Feature: Check Activityinfo page

Scenario: Validate Projects under Activity Info tab

When Login with valid username and password

Given User is on Activity Info tab in left navigation
When User click Projects tab under Activity Info page in left navigation
Then Projects page is displayed with correct Customer Name and Project

When User clicks on Common Activities tab under Activity Info in left navigation
Then Common Activities page is displayed with correct Activity column

When User Logout from the page


