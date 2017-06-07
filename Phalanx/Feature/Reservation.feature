@smoke
@tag
Feature: Click on reservation menu 
	I should be able to click on main database

@tag1
Scenario: I should be able to click on Main Database submenu
Given I am on Phalanx's login page
And Enter valid username and password
When Click on Main database submenu	
And  Enter input and click on search	
Then Application should display success message
	
#@tag2
#Scenario Outline: Title of your scenario outline
#Given I want to write a step with <name>
#When I check for the <value> in step
#Then I verify the <status> in step


