Feature: flight searching

Scenario: with valid data
Given I want to in flight page
And  I select the first box
And I select the second box
When I select the Date
And I select  the travellers
And I search the flights
Then I will navigate to another page