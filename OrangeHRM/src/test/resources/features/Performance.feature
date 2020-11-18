Feature: Check Performance page

Scenario: Validate Tracker list page under Employee trackers tab

When Login with valid username and password

Given User is on Performance tab
When User click on Employee Trackers under Performance tab in left navigation and click on Trackers list tab
Then Performance Trackers page is displayed with correct Tracker name,Employee details
 
Given User is on Goals tab
When User clicks on My Goals tab under Performance->Goals tab in left navigation
Then My Goals page is displayed with correct Goal status,Owner details

Given User is on Appraisals tab
When User clicks on Appraisal List tab under Performance->Appraisals tab
Then Employee Appraisals page is displayed with correct Employee name,Description,Appraisal Status details

When User Logout from the page