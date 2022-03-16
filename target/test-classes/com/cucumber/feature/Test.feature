Feature: Registration Page

Background:
Given User launches the chromebrowser and opwn the URL "http://demo.automationtesting.in/Register.html"

Scenario: Enter Registration Details 
When User enter the value in Firstname "Vcent"
And User enter the value in Lastname "Game"
And User enter the value in Address "Delhi"
And User enter the value in Email "5637@gmail.com"
Then User validate the title of the page "Registration"

@Regression
Scenario: Validate RadioButton
When User click Male radiobutton
Then User valid Male radiobutton is clicked
And User valid Female radiobutton is clicked
And Use valid all buttons are clicked

