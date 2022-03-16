$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Registration.feature");
formatter.feature({
  "name": "Registration Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Enter Registration Details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User launches the chromebrowser and opwn the URL \"http://demo.automationtesting.in/Register.html\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Registration_Test.user_launches_the_chromebrowser_and_opwn_the_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the value in Firstname \"Vcentry\"",
  "keyword": "When "
});
formatter.match({
  "location": "Registration_Test.user_enter_the_value_in_Firstname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the value in Lastname \"technologies\"",
  "keyword": "And "
});
formatter.match({
  "location": "Registration_Test.user_enter_the_value_in_Lastname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the value in Address \"Chennai\"",
  "keyword": "And "
});
formatter.match({
  "location": "Registration_Test.user_enter_the_value_in_Address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the value in Email \"Abcd@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Registration_Test.user_enter_the_value_in_Email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validate the title of the page \"Registration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Registration_Test.user_validate_the_title_of_the_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Test.feature");
formatter.feature({
  "name": "Registration Page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User launches the chromebrowser and opwn the URL \"http://demo.automationtesting.in/Register.html\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Registration_Test.user_launches_the_chromebrowser_and_opwn_the_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate RadioButton",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User click Male radiobutton",
  "keyword": "When "
});
formatter.match({
  "location": "Registration_Test.user_click_Male_radiobutton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User valid Male radiobutton is clicked",
  "keyword": "Then "
});
formatter.match({
  "location": "Registration_Test.user_valid_Male_radiobutton_is_clicked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User valid Female radiobutton is clicked",
  "keyword": "And "
});
formatter.match({
  "location": "Registration_Test.user_valid_Female_radiobutton_is_clicked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Use valid all buttons are clicked",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});