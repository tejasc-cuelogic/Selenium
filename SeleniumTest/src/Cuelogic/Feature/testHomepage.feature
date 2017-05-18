#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: Cuelogic Home Page Navigation
	I want to be able to access the Cuelogic home page

@tag1
Scenario: To test if Cuelogic web page is accessible
Given I should have the cuelogic home page url
When I navigate to the cuelogic home page url
Then I should land on cuelogic home page
	And should be able to view its logo

#@tag2
#Scenario Outline: Title of your scenario outline
#Given I want to write a step with <name>
#When I check for the <value> in step
#Then I verify the <status> in step
#
#Examples:
    #| name  |value | status |
    #| name1 |  5   | success|
    #| name2 |  7   | Fail   |
