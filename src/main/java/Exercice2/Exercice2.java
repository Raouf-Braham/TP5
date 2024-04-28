/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice2;

import Exercice2.UserValidator.UserAgeException;
import java.io.FileNotFoundException;

/**
 *
 * @author HP
 */
public class Exercice2 
{
    public static void main(String[] args) 
    {
        FileManager fileManager = new FileManager();
        MathOperations mathOperations = new MathOperations();
        UserValidator userValidator = new UserValidator();
        
        try
        {
            fileManager.readFile("invalid/file/path.txt");
        } 
        
        catch (FileNotFoundException e) 
        {
            System.out.println("Exception attrapée : " + e.getMessage());
        }
        
        try
        {
            mathOperations.calculateFactorial(-5);
        } 
        
        catch (IllegalArgumentException e)
        {
            System.out.println("Exception attrapée : " + e.getMessage());
        }
        
        try
        {
            mathOperations.calculateSquareRoot(-10);
        } 
        
        catch (ArithmeticException e)
        {
            System.out.println("Exception attrapée : " + e.getMessage());
        }
        
        try
        {
            userValidator.validateAge(16);
        } 
        
        catch (UserAgeException e)
        {
            System.out.println("Exception attrapée : " + e.getMessage());
        }
    }
}
