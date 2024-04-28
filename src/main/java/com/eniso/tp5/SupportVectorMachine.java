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
public class SupportVectorMachine extends BaseModel
{
    int iterations;
    double learningRate;
    
    public SupportVectorMachine(String name, int iterations, double learningRate){
        super(name, 0, null, null);
        this.iterations = iterations;
        this.learningRate = learningRate;
    }
    
    public void train(ClassificationDataset dataset)
    {
        System.out.println("L’entraînement de la régression linéaire en cours...");
    }
    
    public void predict(ClassificationDataset dataset)
    {
        System.out.println("La prediction de la régression linéaire en cours...");
    }
    
    @Override
    void displayDetails()
    {
        System.out.println("les détails du modèle : Nom : " + this.name + " Iterations : " + this.iterations + " Learning Rate : " + this.learningRate);
    }
}
