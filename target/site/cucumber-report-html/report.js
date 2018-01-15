$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/ForgotPassword.feature");
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
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 21,
  "name": "Validate Forgot Password Flow in Newegg Project",
  "description": "I want to use this template to validate Forgot Password flow",
  "id": "validate-forgot-password-flow-in-newegg-project",
  "keyword": "Feature",
  "tags": [
    {
      "line": 20,
      "name": "@forgotPassword"
    }
  ]
});
formatter.before({
  "duration": 8123226540,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Forgot Password in NewEgg Project",
  "description": "",
  "id": "validate-forgot-password-flow-in-newegg-project;forgot-password-in-newegg-project",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@forgotPassword"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "Launch Browser and Navigate to Application URL",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "Tap on Login/RegisterButton",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Click on Forgot Password Link on a page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Enter Email address",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Tap on SubmitButton",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPasswordstep.LoginPage()"
});
formatter.result({
  "duration": 65355328265,
  "status": "passed"
});
formatter.match({
  "location": "ForgotPasswordstep.tapOnLogin()"
});
formatter.result({
  "duration": 653337000,
  "status": "passed"
});
formatter.match({
  "location": "ForgotPasswordstep.forgotPasswordLink()"
});
formatter.result({
  "duration": 929459741,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\".//*[@id\u003d\u0027QuickLinks\u0027]/dd[1]/form/table/tbody/tr[5]/td[2]/span/a\"}\n  (Session info: chrome\u003d63.0.3239.132)\n  (Driver info: chromedriver\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027SURI-PC\u0027, ip: \u0027192.168.0.5\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_152\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptSslCerts: true, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.33.506120 (e3e53437346286..., userDataDir: C:\\Users\\Spandana\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 63.0.3239.132, webStorageEnabled: true}\nSession ID: 328c8297863fcdd4882aca2813b7e27c\n*** Element info: {Using\u003dxpath, value\u003d.//*[@id\u003d\u0027QuickLinks\u0027]/dd[1]/form/table/tbody/tr[5]/td[2]/span/a}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat steps.ForgotPasswordstep.forgotPasswordLink(ForgotPasswordstep.java:47)\r\n\tat ✽.Then Click on Forgot Password Link on a page(src/test/resources/features/ForgotPassword.feature:28)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ForgotPasswordstep.emailAddress()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ForgotPasswordstep.submitButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 3771711510,
  "status": "passed"
});
});