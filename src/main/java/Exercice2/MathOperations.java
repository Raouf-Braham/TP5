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
public class MathOperations
{
    public int calculateFactorial(int n) 
    {
        if (n < 0) 
        {
            throw new IllegalArgumentException("Nombre négatif passé : " + n);
        }
        
        int factorial = 1;
        
        for (int i = 2; i <= n; i++) 
        {
            factorial *= i;
        }
        
        return factorial;
    }

    public double calculateSquareRoot(double n2) 
    {
        if (n2 < 0)
        {
            throw new ArithmeticException("Tentative de calcul de la racine carrée d’un nombre négatif : " + n2);
        }
        
        return Math.sqrt(n2);
    }
}
