//***************************************************************************************************** 
// 
//  File:           Validator.java 
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
//  This is a utiliy program to correct 
//  user input as needed.
//
//  Other files required:  
//   1. Person.java
//   2. Customer.java
//   3. Employee.java
//   4. PersonDriver.java
//   
//*****************************************************************************************************

package person;

import java.util.Scanner;

//*****************************************************************************************************

public class Validator
{
    private static Scanner keyboard = new Scanner(System.in);
    
    public static String 
        getChoiceString(Scanner sc, String prompt, String s1, String s2)
    {
        String input;
        System.out.printf(prompt + "(" + s1 + "/" + s2 + "): ");
           
        input = sc.nextLine();
      
         boolean success = false;
         while(success == false)
        {
            if(!input.equalsIgnoreCase(s1) && !input.equalsIgnoreCase(s2))
            {
                System.out.println("ERROR! Enter " + s1 +  " or " + s2 + ". ");
                System.out.printf(prompt + "(" + s1 + "/" + s2 + ") ");
                input = sc.nextLine();
            }
       
            else
                success = true;
        }
   
            return input;
        }
    
//*****************************************************************************************************        
        
    public static String getRequiredString(Scanner sc, String prompt, String error)
    {
        System.out.print(prompt);
        String s = keyboard.nextLine();
        if(s.isEmpty())
        {
            while(s.isEmpty())
            {
                System.out.println(error);
                System.out.print(prompt);
                s = keyboard.nextLine();  
            }
        }
        
        return s;
    }
    
//*****************************************************************************************************
    
    public static String verifyEmail(Scanner sc, String prompt, String error)
    {
        boolean status = false;
        int i = 0;
        boolean atFound = false;
        boolean periFound = false;
        String invalid = "ERROR! Please enter a valid email address.";
        
        System.out.print(prompt);
        String input = sc.nextLine();
        

        while(status == false)
        { 
            while(i < input.length())
            {
                if(input.charAt(i) == '@')
                    atFound = true;
            
                if(input.charAt(i) == '.')
                    periFound = true;
                i++;   
            }
            
            if(atFound == true && periFound == true && input.length() > 15) 
                    status = true;
            
            else
            {
                System.out.println(invalid);
                input = Validator.getRequiredString(sc, prompt, error);
            }
                        
        }
        
        return input;
    }

//*****************************************************************************************************    
    
}   

