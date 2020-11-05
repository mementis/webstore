Feature: Create an order End-to-end 



Scenario: Select an Item on Product List Page and Add to Shopping Cart 
	Given user lands on homepage 
	And user selects menu category 
	When user selects product from selected category Product List Page 
	Then user selects product details on Product Details page and adds to cart 
	And user proceeds to checkout 
	When user validates the items in shopping cart summary 
	And user signs in 
	Then user selects delivery address 
	And user selects shipping option 
	Then user proceeds with payment 
	And user confirms order 
 