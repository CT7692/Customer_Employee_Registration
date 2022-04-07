//***************************************************************************************************** 
// 
//  File:           Customer.java 
//   
//  Student:        Joseph Rydel 
// 
//  Assignment:     Assignment #7
// 
//  Course Name:    Java I  
// 
//  Course Number:  COSC 2050 - 01 
// 
//  Due:            April 01, 2022  
// 
// 
//  This is a customer subclass file
//  that stores relevant customer information.
//
//  Other files required:  
//   1. Person.java
//   2. Validator.java
//   3. Employee.java
//   4. PersonDriver.java
//   
//*****************************************************************************************************

package person;

//*****************************************************************************************************

public class Customer extends Person
{
    private String customerNumber;
    
//*****************************************************************************************************
    
    public Customer()
    {
        super();
        customerNumber = "***";
    }
    
//*****************************************************************************************************

    public String getCustomerNumber()
    {
        return customerNumber;
    }

//*****************************************************************************************************
    
    public void setCustomerNumber(String customerNumber)
    {
        this.customerNumber = customerNumber;
    }
    
//*****************************************************************************************************
    
    @Override
    public String toString()
    {
        return super.toString();
    }

//*****************************************************************************************************    
    
    @Override
    public String getDisplayText()
    {
        return super.toString() + "\nCustomer number: " + customerNumber + "\n";
    }
    
//*****************************************************************************************************
    
}
