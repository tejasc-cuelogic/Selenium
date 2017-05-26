$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("User.feature");
formatter.feature({
  "line": 3,
  "name": "Add new user for phalanx application",
  "description": "I should be able to add new user",
  "id": "add-new-user-for-phalanx-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#@positiveScenario"
    },
    {
      "line": 7,
      "value": "#Scenario: To test user should be able to add new user"
    },
    {
      "line": 8,
      "value": "#Given I am on Phalanx\u0027s login page"
    },
    {
      "line": 9,
      "value": "#And Enter valid username and password"
    },
    {
      "line": 10,
      "value": "#When Click on Users and then click on add users"
    },
    {
      "line": 11,
      "value": "#And  Enter valid details in all fields"
    },
    {
      "line": 12,
      "value": "#Then Successful message should be displayed"
    }
  ],
  "line": 15,
  "name": "Admin search an user using Agent ID",
  "description": "",
  "id": "add-new-user-for-phalanx-application;admin-search-an-user-using-agent-id",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@positiveScenario"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I am on Phalanx\u0027s login page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Enter valid username and password",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User is on All Users page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on Search button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I should see searched user name in the list",
  "keyword": "Then "
});
formatter.match({
  "location": "InputDetails.get_phx_url()"
});
formatter.result({
  "duration": 11801216807,
  "status": "passed"
});
formatter.match({
  "location": "InputDetails.enter_Usernamepwd()"
});
formatter.result({
  "duration": 12275831126,
  "status": "passed"
});
formatter.match({
  "location": "InputDetails.all_users()"
});
formatter.result({
  "duration": 12046960,
  "error_message": "java.lang.ClassCastException: org.openqa.selenium.remote.RemoteWebElement cannot be cast to java.util.List\r\n\tat pageobject.Users.menu_Users(Users.java:268)\r\n\tat step_definition.InputDetails.all_users(InputDetails.java:145)\r\n\tat ✽.And User is on All Users page(User.feature:18)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});