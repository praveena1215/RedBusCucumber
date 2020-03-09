Feature: Busbooking screen 
Scenario Outline: Suscessfull bus ticket 


	Given launch the browser "https://redbus.in" 
	Then enter the destination From "<StartingPlace>" 
	And enter the destination TO "<Destination>" 
	Then select the onward date 
	And click on search button to list the buses 
	
	Examples:
	
	| StartingPlace | Destination |
	|Kanchipuram Bypass, Chennai   | Pondicherry |
	| Madurai        | Erode      |
	
	
	
