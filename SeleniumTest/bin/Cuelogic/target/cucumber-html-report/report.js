$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testHomepage.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 19,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 21,
  "name": "Cuelogic Home Page Navigation",
  "description": "I want to be able to access the Cuelogic home page",
  "id": "cuelogic-home-page-navigation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 20,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 25,
  "name": "To test if Cuelogic web page is accessible",
  "description": "",
  "id": "cuelogic-home-page-navigation;to-test-if-cuelogic-web-page-is-accessible",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I should have the cuelogic home page url",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I navigate to the cuelogic home page url",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I should land on cuelogic home page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "should be able to view its logo",
  "keyword": "And "
});
formatter.match({
  "location": "testHomepage.get_url()"
});
formatter.result({
  "duration": 4276964302,
  "status": "passed"
});
formatter.match({
  "location": "testHomepage.navigate_url()"
});
