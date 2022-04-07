//***************************************************************************************************** 
// 
//  File:           Person.java 
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
//  This is the person super class file for
//  storing and access relevant personnel
//  information.
//
//  Other files required:  
//   1. Validator.java
//   2. Customer.java
//   3. Employee.java
//   4. PersonDriver.java
//   
//*****************************************************************************************************

package person;

//*****************************************************************************************************

public abstract class Person
{
    private String name;
    private String email;
    
//*****************************************************************************************************
    
    public Person()
    {
        name = "";
        email = "";
    }
    
//*****************************************************************************************************
    
    public String getName()
    {
        return name;
    }

//*****************************************************************************************************
    
    public void setName(String name)
    {
        this.name = name;
    }

//*****************************************************************************************************
    
    public String getEmail()
    {
        return email;
    }
    
//*****************************************************************************************************
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
//*****************************************************************************************************
    
    @Override
    public String toString()
    {
        return "Name: " + name + "\nEmail: " + email;
    }
    
//*****************************************************************************************************
    
    public abstract String getDisplayText();
    
//*****************************************************************************************************
    
}
