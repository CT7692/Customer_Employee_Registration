//***************************************************************************************************** 
// 
//  File:           Employee.java 
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
//  This is an employee subclass file
//  that stores relevant employee information.
//
//  Other files required:  
//   1. Person.java
//   2. Validator.java
//   3. Customer.java
//   4. PersonDriver.java
//   
//*****************************************************************************************************

package person;

//*****************************************************************************************************

public class Employee extends Person
{
    private String socialSecurityNumber;
    
//*****************************************************************************************************
    
    public Employee()
    {
        super();
        socialSecurityNumber = "000-00-0000";
    }
    
//*****************************************************************************************************

    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }

//*****************************************************************************************************    
    
    public void setSocialSecurityNumber(String socialSecurityNumber)
    {
        this.socialSecurityNumber = socialSecurityNumber;
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
        return super.toString() + "\nSocial security number: " + 
                socialSecurityNumber + "\n";
    }
    
//*****************************************************************************************************
    
}
