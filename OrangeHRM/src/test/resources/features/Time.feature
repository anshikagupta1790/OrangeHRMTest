Feature: Check Time page

Scenario: Validate My Timesheets 

When Login with valid username and password

Given User is on Time page
When User click Timesheets tab and My Timesheets option in left navigation
Then My Timesheets page  is displayed with correct Project,Activity,From,To,Duration fields

When User clicks on Export To csv tab under Timesheets tab in left navigation
Then Export To csv page is displayed

When User Logout from the page