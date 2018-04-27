Feature: Login for leaftabs
Scenario Outline: Login for leaftabs positive
#Given Open the browser
#And Load url 
And Enter the username as <uName>
And Enter the password as <password>
When Click on login option
#Then Verify login is success
When Click on crmsfa link
When Click on Lead link
When Click on Create Lead link
And Enter the Company Name as <cName>
And Enter the First Name as <fName>
And Enter the Last Name as <lName>
When Click on Create Lead button
#Then Verify the Company name is created in View Lead page
Examples:
|uName|password|cName|fName|lName|
|DemoSalesManager|crmsfa|TestLeaf|prasanth|sund|
|DemoCSR|crmsfa|TestLeaf1|prasanth1|sund1|