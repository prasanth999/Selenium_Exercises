Feature: Login for leaftabs
Scenario Outline: Login for leaftabs positive
#Given Open the browser
#And Load url 
And Enter the username as <uName>
And Enter the password as <password>
When Click on login option

When Click on crmsfa link
When Click on Lead link
When Click on Create Lead link
And Enter the Company Name 
And Enter the First Name
And Enter the Last Name
When Click on Create Lead button
Then Verify the Company name is created in View Lead page
Examples:
|uName|password|
|DemoSalesManager|crmsfa|
|DemoCSR|crmsfa|