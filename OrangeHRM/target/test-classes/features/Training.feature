Feature: Check Training page

Scenario: Validate Courses page under Training tab

When Login on OrangeHRM page

Given User is on Training tab
When User click on Courses under Training tab in left navigation
Then Course list page is displayed with correct title,subunit,Coordinator details

Given User is already on Training tab
When User clicks on Training Sessions tab under Training tab in left navigation
Then Training Session list page is displayed with correct Session name,Training Course,Status details

When User Logout from the page