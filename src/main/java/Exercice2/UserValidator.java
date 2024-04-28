/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice2;


/**
 *
 * @author HP
 */
public class UserValidator {
    
    public void validateAge(int age) throws UserAgeException 
    {
        if (age < 18)
        {
            throw new UserAgeException("Âge invalide : " + age + ". L’utilisateur doit être âgé de 18 ans ou plus.");
        }
    }
    
    class UserAgeException extends Exception 
    {
        public UserAgeException(String message) {
            super(message);
        }
    }
    
}
