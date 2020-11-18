Feature: Check Recruitment page

Scenario: Validate Vacancies page under Recruitment tab

When Login with valid username and password

Given User is on Recruitment tab
When User click on Vacancies under Recruitment page in left navigation
Then Vacancies page  is displayed with correct Vacancy, Job Title,Location

When User clicks on Candidates tab under Recruitment tab in left navigation
Then Candidates page is displayed with correct vacancy,candidate,email 

When User Logout from the page
