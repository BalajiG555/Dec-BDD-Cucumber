Feature: Registration Page

@Test @Regression
Scenario: Enter Registration Details 
Given User launches the chromebrowser and opwn the URL "http://demo.automationtesting.in/Register.html"
When User enter the value in Firstname "Vcentry"
And User enter the value in Lastname "technologies"
And User enter the value in Address "Chennai"
And User enter the value in Email "Abcd@gmail.com"
Then User validate the title of the page "Registration"

Scenario: Validate RadioButton
Given User launches the chrome browser and opwn the URL "http://demo.automationtesting.in/Register.html"
When User click Male radiobutton
Then User valid Male radiobutton is clicked
And User valid Female radiobutton is clicked

