# Taxperson

Taxperson application computes the total cost of an item, given its price and category.

##For implementing the service, the following has been done.

1. Item.java represents the item object 
2. ItemType.java is an enum which contains the types, Necessity and Luxury are the types used
3. Tax.java is a constants file, which has the mapping between itemtype to the percentage of tax
4. TaxService.java is an interface which has a method to compute tax of an item and return the item with the updated value of costWithTax
5. TaxServiceImpl.java is the implementation of the TaxService, which accepts the Item object and returns the same Item object, with the computed cost of the item with tax, set.

##Instructions to Run the application

1. Clone the application
2. mvn clean install - should compile the application and run the unit tests, which test the service against different sets of values.
3. Modify the cost, itemtype, expected value in the DataProvider to check with other values.
