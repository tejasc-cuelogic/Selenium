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
formatter.step({
  "line": 12,
  "name": "Application should display success message",
  "keyword": "Then "
});
formatter.match({
  "location": "All_Reservations.get_phx_url()"
});
formatter.result({
  "duration": 6988548042,
  "status": "passed"
});
formatter.match({
  "location": "All_Reservations.enter_Usernamepwd()"
});
formatter.result({
  "duration": 22591891608,
  "status": "passed"
});
formatter.match({
  "location": "All_Reservations.click_reservations()"
});
formatter.result({
  "duration": 23239360635,
  "status": "passed"
});
formatter.match({
  "location": "All_Reservations.search_reser()"
});
formatter.result({
  "duration": 7502219601,
  "status": "passed"
});
formatter.match({
  "location": "All_Reservations.record_msg()"
});
formatter.result({
  "duration": 53535819,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//h4[contains(.,\u0027No records found!\u0027)]\"}\n  (Session info: chrome\u003d58.0.3029.110)\n  (Driver info: chromedriver\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 52 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027TEJASC-PC\u0027, ip: \u0027172.21.31.238\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_91\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233), userDataDir\u003dC:\\Users\\TEJASC~1\\AppData\\Local\\Temp\\scoped_dir17888_24961}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d58.0.3029.110, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 28bd7e30be875fdfd71cf24a55e2f0d2\n*** Element info: {Using\u003dxpath, value\u003d//h4[contains(.,\u0027No records found!\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:410)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:509)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:402)\r\n\tat pageobject.Reservations.success_message_text(Reservations.java:146)\r\n\tat step_definition.All_Reservations.record_msg(All_Reservations.java:103)\r\n\tat ✽.Then Application should display success message(Reservation.feature:12)\r\n",
  "status": "failed"
});
});