$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/open.feature");
formatter.feature({
  "name": "To validate the login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@End_To_End_Testing"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to launch chrome and hit the FB url",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginpage.user_has_to_launch_chrome_and_hit_the_FB_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify login functionality with valid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@End_To_End_Testing"
    }
  ]
});
formatter.step({
  "name": "user has to enter the  username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Alluarjun",
        "12345456"
      ]
    },
    {
      "cells": [
        "Mahesh",
        "6543211"
      ]
    },
    {
      "cells": [
        "Chiru",
        "09876567"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Loginpage.user_has_to_enter_the_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Loginpage.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user unable to enter the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginpage.user_unable_to_enter_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to launch chrome and hit the FB url",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginpage.user_has_to_launch_chrome_and_hit_the_FB_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the Forgot Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@End_To_End_Testing"
    }
  ]
});
formatter.step({
  "name": "user has to click the forgotten password link",
  "keyword": "When "
});
formatter.match({
  "location": "Loginpage.user_has_to_click_the_forgotten_password_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to enter credentials",
  "keyword": "And "
});
formatter.match({
  "location": "Loginpage.user_has_to_enter_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click serach button",
  "keyword": "And "
});
formatter.match({
  "location": "Loginpage.user_has_to_click_serach_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to be redirected the OTP page",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginpage.user_has_to_be_redirected_the_OTP_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});