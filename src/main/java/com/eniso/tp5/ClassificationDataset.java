/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eniso.tp5;

/**
 *
 * @author HP
 */
public class ClassificationDataset extends Dataset
{
    String[] labels;
    int numClasses;
    
    public ClassificationDataset(String path, boolean isTrain){
        super(path, isTrain);
    }

    @Override
    public void predict() 
    {
        
    }
    
    public void Chargement(){
        System.out.println("Chargement en cours !");
    }
    
    public void Pretraitement(){
        System.out.println("Prétraitement  en cours !");
    }   
}
