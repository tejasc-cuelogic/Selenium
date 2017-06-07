

#Sample Feature Definition Template
@smoke
Feature: Search user for phalanx application
	I want to search existing user 

@negativeScenario
Scenario: I want to search existing user using invalid input
Given I am on Phalanx's login page
And Enter valid username and password
And User is on All Users page
When I click on Search button
Then I should see appropriate result for invalid input
	

@positiveScenario
Scenario: I want to search existing user using valid input
Given I am on Phalanx's login page
And Enter valid username and password
And User is on All Users page
When I click on Search button
Then I should see valid result for given input
	

