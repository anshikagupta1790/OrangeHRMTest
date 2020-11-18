Feature: Check Attendance page

Scenario: Validate My Records under Attendance tab

When Login with valid username and password

Given User is on Attendance page
When User click My Records tab under Attendance page in left navigation
Then My Records page  is displayed with My Attendance Records label

Given User is on Punch in/out page
When User clicks on Punch in/out tab under Attendance tab in left navigation
Then Punch in/out page is displayed with correct Punch_in Time 

When User Logout from the page