$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Reservation.feature");
formatter.feature({
  "line": 3,
  "name": "Click on reservation menu",
  "description": "I should be able to click on main database",
  "id": "click-on-reservation-menu",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "I should be able to click on Main Database submenu",
  "description": "",
  "id": "click-on-reservation-menu;i-should-be-able-to-click-on-main-database-submenu",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on Phalanx\u0027s login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Enter valid username and password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on Main database submenu",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Enter input and click on search",
  "keyword": "And "
});
formatter.match({
  "location": "All_Reservations.get_phx_url()"
});
formatter.result({
  "duration": 8017747719,
  "status": "passed"
});
formatter.match({
  "location": "All_Reservations.enter_Usernamepwd()"
});
formatter.result({
  "duration": 22385418549,
  "status": "passed"
});
formatter.match({
  "location": "All_Reservations.click_reservations()"
});
formatter.result({
  "duration": 21626972392,
  "status": "passed"
});
formatter.match({
  "location": "All_Reservations.search_reser()"
});
formatter.result({
  "duration": 1419863862,
  "status": "passed"
});
});