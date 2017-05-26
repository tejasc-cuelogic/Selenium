
@Smoke
Feature: Add new user for phalanx application
	I should be able to add new user

#@positiveScenario
#Scenario: To test user should be able to add new user 
#Given I am on Phalanx's login page
#And Enter valid username and password
#When Click on Users and then click on add users
#And  Enter valid details in all fields
#Then Successful message should be displayed 
	
@positiveScenario
Scenario: Admin search an user using Agent ID 
 Given I am on Phalanx's login page
	And Enter valid username and password
	And  User is on All Users page
 When I click on Search button
 Then I should see searched user name in the list
 
#Scenario: Admin view user profile
  #Given pick up user to search
  #And I click on "Search" button
 #Then I should see searched user name in the list
 #And I click on view icon from the Action column in user list
 #Then I should see profile page
#
#Scenario: Admin updates the any user from the list
 #Given pick up user to update
  #And I click on "Search" button
 #When I click edit icon from the user list
 #And I update user location
 #And I click on "Update" button
 #Then I should see page with message "User was successfully updated"
#
#Scenario: Admin archieve's an active user from the list
 #Given pick up user to archive
  #And I click on "Search" button
  #When I click archive icon from the user list
  #Then I should see page with message "User successfully archived"
#
#Scenario: Admin updates broadsoft password from user list
 #Given pick up user to update broadsoft password
  #When I click on "Search" button
  #And I click reset password icon from the user list
  #And I enter password in Rest Broadsoft Password popup
  #And I click on "Reset Password" button
  #Then I should see page with message "INVALID_USER_ID_OR_ErrorResponse"
