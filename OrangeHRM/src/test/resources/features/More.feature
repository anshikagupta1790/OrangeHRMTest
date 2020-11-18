Feature: Check More tab

Scenario: Validate Documents page under More->Announcements tab

When Login with valid username and password

Given User is on More tab
When User click on Announcements tab under More tab in left navigation and click on Documents 
Then Published Documents page is displayed

Given User is on Assets tab
When User clicks on View Assets tab under Assets tab in left navigation
Then Assets page is displayed with correct location,Assigned Employee,asset id

When User Logout from the page

