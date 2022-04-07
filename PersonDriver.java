//***************************************************************************************************** 
// 
//  File:           PersonDriver.java 
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
//  This is the main class to test the
//  relationships between the classes
//  in this package.
//
//  Other files required:  
//   1. Person.java
//   2. Validator.java
//   3. Customer.java
//   4. Employee.java
//   
//*****************************************************************************************************

package person;

import java.util.Scanner;

//*****************************************************************************************************

public class PersonDriver
{

//***************************************************************************************************** 
    
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean op = operation(keyboard);
    }
    
//*****************************************************************************************************
    
    private static void print(Person p)
    {
        System.out.println("\nYou entered:");
        System.out.print(p.getDisplayText());
    }
    
//*****************************************************************************************************
    
    public static boolean operation(Scanner sc)
    {
        boolean operational = true;
        System.out.println("Welcome to the Intergalactic Banking Clan");
        String input = new String();
        String msg1 = "\nCreate customer or employee? ";
        String msg2 = "Enter name: ";
        String msg3 = "Enter email address: ";
        String msg4 = "Customer number: ";
        String msg5 = "Continue? ";
        String err = "ERROR! Entry required.";
        Customer cust = new Customer();
        Employee empl = new Employee();
        
        while(operational == true)
        {
            input = Validator.getChoiceString(sc, msg1, "c", "e");
            
            if(input.equalsIgnoreCase("c"))
            {
                
                enterCustomer(sc, cust, input, msg2, msg3, msg4, err);
                input = Validator.getChoiceString(sc, msg5, "y", "n");
                
                if(input.equalsIgnoreCase("n"))
                    operational = false;
            }
            
            else if(input.equalsIgnoreCase("e"))
            {
                enterEmployee(sc, empl, input, msg2, msg3, err);
                input = Validator.getChoiceString(sc, msg5, "y", "n");
                
                if(input.equalsIgnoreCase("n"))
                    operational = false;
            }       
        }
        
        return operational;
    }
    
//*****************************************************************************************************

    public static void enterCustomer(Scanner sc, Customer cust, String input, String msg2, 
            String msg3, String msg4, String err)
    {
        input = Validator.getRequiredString(sc, msg2, err);
        cust.setName(input);
                
        input = Validator.verifyEmail(sc, msg3, err);
        cust.setEmail(input);
                
        input = Validator.getRequiredString(sc, msg4, err);
        cust.setCustomerNumber(input);
        print(cust);
    }
    
//*****************************************************************************************************  
    
    public static void enterEmployee(Scanner sc, Employee empl, String input,
            String msg2, String msg3, String err)
    {
        
        input = Validator.getRequiredString(sc, msg2, err);
        empl.setName(input);
                        
        input = Validator.verifyEmail(sc, msg3, err);
        empl.setEmail(input);
        
        empl.setSocialSecurityNumber("777-66-7692");
        print(empl);
    }
    
//*****************************************************************************************************  
        
}

//*****************************************************************************************************

//run:
//Welcome to the Intergalactic Banking Clan
//
//Create customer or employee? (c/e): r
//ERROR! Enter c or e. 
//
//Create customer or employee? (c/e) c
//Enter name: 
//ERROR! Entry required.
//Enter name: Hego Damask
//Enter email address: 7
//ERROR! Please enter a valid email address.
//Enter email address: hego@damaskholdings.net
//Customer number: 
//ERROR! Entry required.
//Customer number: 77777
//
//You entered:
//Name: Hego Damask
//Email: hego@damaskholdings.net
//Customer number: 77777
//Continue? (y/n): y
//
//Create customer or employee? (c/e): e
//Enter name: 
//ERROR! Entry required.
//Enter name: Joseph Rydel
//Enter email address: jry
//ERROR! Please enter a valid email address.
//Enter email address: jrydel92@gmail.com
//
//You entered:
//Name: Joseph Rydel
//Email: jrydel92@gmail.com
//Social security number: 777-66-7692
//Continue? (y/n): 
//ERROR! Enter y or n. 
//Continue? (y/n) 7
//ERROR! Enter y or n. 
//Continue? (y/n) n
//BUILD SUCCESSFUL (total time: 2 minutes 8 seconds)



