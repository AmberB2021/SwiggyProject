Feature: a user should be able to order Pizza from https://www.Swiggy.com
@pizza
Scenario: Order Pizza From Swiggy
Given a user is on the homepage of Swiggy

And she Enters location as "<city>"
And she selects first location from suggested location in suggestion-box
And she redirects to ItemPage
And she hover over search icon
And she Enters Item as "Pizza"
And she select first suggested Item in pizza cateogory
And she searchs resturant and select first restaurant
And she redirects to orderPage 
And she adds first item to cart 
And she click on checkout button
Then she should be able to order a pizza suscessfully 

Examples: 
|city|
|Mumbai|
|Chennai|
