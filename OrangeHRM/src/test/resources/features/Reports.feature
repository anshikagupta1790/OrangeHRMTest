Feature: Check Records page

Scenario: Validate Project time under Reports tab

When Login with valid username and password

Given User is on Reports page
When User click Project Time tab under Reports page in left navigation
Then Project time report  page  is displayed

Given User is on My Monthly Attendance page
When User click on Search button 
Then My Monthly Attendance Report is displayed with date and no of hours worked columns

When User Logout from the page