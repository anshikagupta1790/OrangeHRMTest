Feature: Check Admin tab

Scenario: Validate User Management page under Admin tab

When Login with valid username and password

Given User is on Admin tab
When User click on User Management tab under Admin tab in left navigation and click on Users 
Then Users page is displayed with correct username,user role details



Given User is on Job tab
When User clicks on Salary Components tab under Admin tab in left navigation
Then Salary Components page is displayed with correct component name and type details


Given User is on Competencies tab
When User clicks on Competencies tab under Admin tab in left navigation
Then Competency List tab is displayed 

When User Logout from the page

