Objective : To automate OrangeHRM web application..

Test Approach : 
●OrangeHRM is a web application, so I have decided to use the Selenium tool to create Automation Test scripts.
●Selenium tool supports multiple languages such as JAVA, Python, C#, etc. I have selected JAVA as a programming language to create Automation Test scripts along with Selenium.
●Test framework is a set of guidelines and rules used for creating and designing the test cases. There are multiple types of test framework like test driven, behavior driven etc.
●I have decided to use a Behavior Driven Development(BDD) framework to create and design the test script. 
●Cucumber is a testing tool that supports Behavior Driven Development (BDD). It offers a way to write tests that anybody can understand, regardless of their technical knowledge. In BDD, users (business analysts, product owners) first write scenarios or acceptance tests that describe the behavior of the system from the customer's perspective.
●Page Object Model, also known as POM is a design pattern in Selenium that creates an object repository for storing all web elements. It is useful in reducing code duplication and improves test case maintenance. In Page Object Model, consider each web page of an application as a class file.
●For Test reports I have used Cucumber inbuilt reporter plugins to produce reports that contain information about what scenarios have passed or failed.

Test Implementation:

●Tools/Language Used : Selenium, Cucumber, Maven(Project Build tool)  and JAVA.

●Project Design Pattern(POM) : 
	Project structured as per POM design pattern(see below screen-shot).
	
base : This package contains base class to initialize browser and configuration properties file.
constants : This package contains all constants used throughout the project.
pages : This package contains each web page of OrangeHRM web application as a class file.
stepDefinitatons: This package contains all test cases to test each web page from OrangeHRM web application.
testRunner: This package contains a runner class which is used to run the test cases available in the feature file from the feature package.
features: This package contains test scenarios to be executed in plain English language.
	
●Test Report: 
Test report attached below is generated from the cucumber framework, after executing all test scenarios.


If I have more time then I would check each and every module functionality in detail. As of now I have covered all the modules available in the OrangeHRM web application but not each function in detail.
