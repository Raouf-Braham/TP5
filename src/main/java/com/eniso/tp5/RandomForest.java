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
public class RandomForest extends BaseModel
{
    int numTrees;
    int maxDepth;
    
    public RandomForest(String name, int numTrees, int maxDepth){
        super(name, 0, null, null);
        this.numTrees = numTrees;
        this.maxDepth = maxDepth;
    }
    
    public void train(RegressionDataset dataset)
    {
        System.out.println("L’entraînement de la forêt aléatoire en cours...");
    }
    
    public void predict(RegressionDataset dataset)
    {
        System.out.println("La prediction de la forêt aléatoire en cours...");
    }
    
    @Override
    void displayDetails()
    {
        System.out.println("les détails du modèle : Nom : " + this.name + " Nombre d’arbres dans la forêt : " + this.numTrees + " Profondeur maximale des arbres : " + this.maxDepth);
    }  
}
