Feature: Quick Post
As an employee I want to share my car for pooling so that other employee can travel with me

Scenario: Allow only valid data for sharing
Given Employee "Naveen Singh" has entered "Office" as source, "MG Road" as destination and time to travel is "5:30pm"
And His email is "naveenhome@gmail.com" and phone is "9810547500"
When Click on "Share"
Then System display message "Posting was successful" with "OK" button
And System takes to "Home" page on clicking on "OK"
And "Naveen Singh" can see his post on "Home" page

Scenario: Allow only valid data for sharing and display message for invalid case
Given Employee "Naveen Singh" has entered "Office" as source, " " as destination and time to travel is "5:30pm"
And His email is "naveenhome@gmail.com" and phone is "9810547500"
When Click on "Share"
Then System display message "Posting was unsuccessful" with "OK" button
And System takes to incorrect field on clicking on "OK"
And "Naveen Singh" can change value for incorrect field
And He will save it again

Scenario: Clear all entries in case of Reset
Given Employee "Naveen Singh" has entered "Office" as source, "HSR Layout " as destination and time to travel is "5:30pm"
And His email is "naveenhome@gmail.com" and phone is "9810547500"
When Click on "Reset"
Then System display message "Do you want to reset value?" with "OK" button
And System takes to first field on clicking on "OK"
And "Naveen Singh" can enter new value again

