Feature: Verify values and their total on a webpage
Scenario Outline: Verify right count of values entered on screen and their total is caluclated  
Given: user launch Chrome browser
When user opens URL "https://www.exercise1.com/values"
Then page should have 5 values 
And the values should be greater than 0
Then the values should be added and store it in totalsum
When totalsum is caluclated
Then verify if all values are formatted in currencies
And if values are formatted in currencies
Then Check if totalsum is correct based on entered values 
When totalsum is correct 
Then create a report of all steps passed 
And close browser

Examples:
   | value |
   | $122,365.24 |
   | $599.00 |
   | $850,139.99 |
   | $23,329.50 |
   | $566.27 |
   
