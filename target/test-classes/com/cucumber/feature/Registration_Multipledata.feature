Feature: Registration Page wiht multiple pages

Scenario Outline: Enter Registration Details with multiple data
Given User launches the chromebrowser and opwn the URL "<URL>"
When User enter the value in Firstname "<FirstName>"
And User enter the value in Lastname "<LastName>"
And User enter the value in Address "<Address>"
And User enter the value in Email "<Email>"
Then User validate the title of the page "<Registration>"

Examples:
|URL |FirstName|LastName|Address|Email|Registration|
|http://demo.automationtesting.in/Register.html| Vcentry| King| Chennai| Abcd@gmail.com|Registration|
|http://demo.automationtesting.in/Register.html| Queen| Rock| Karur| A23cd@gmail.com|Registration|


