Feature: Check Expense page

Scenario: Validate Employee Travel Requests page under Expense tab

When Login with valid username and password

Given User is on Expense tab
When User click on Travel Requests tab under expense tab in left navigation and click on employee travel requests tab
Then Travel Requests page is displayed with correct travel request id,employee name details

Given User is on Claims tab
When User clicks on Employee Claims tab under claims tab in left navigation
Then Expense Claims page is displayed with correct employee name, Amount Due (Total),Claim Submission Date details

When User Logout from the page

