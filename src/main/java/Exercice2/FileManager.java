/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author HP
 */
public class FileManager 
{
    
    public void readFile(String fileName) throws FileNotFoundException 
    {
        BufferedReader reader = null;
        
        try 
        {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) 
            {
                System.out.println(line);
            }
        } 
        
        catch (FileNotFoundException e) 
        {
            throw new FileNotFoundException("Fichier non trouvé : " + fileName);
        } 
        
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        
        finally 
        {
            try 
            {
                if (reader != null) 
                {
                    reader.close();
                }
            } 
            
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
    
}
