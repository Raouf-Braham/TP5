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
public class NeuralNetwork extends BaseModel
{
    int[] layers;
    String activationFunction;
    
    public NeuralNetwork(String name, int[] layers, String activationFunction){
        super(name, 0, null, null);
        this.layers = layers;
        this.activationFunction = activationFunction;
    }
    
    public void train(ClassificationDataset dataset)
    {
        System.out.println("L’entraînement du réseau de neurones en cours...");
    }
    
    public void predict(ClassificationDataset dataset)
    {
        System.out.println("La prediction du réseau de neurones en cours...");
    }

    @Override
    void displayDetails()
    {
        // Conversion du tableau layers en une chaîne de caractères
        StringBuilder layersStr = new StringBuilder();
        
        layersStr.append("[");
        for (int i = 0; i < layers.length; i++) 
        {
            layersStr.append(layers[i]);
            if (i < layers.length - 1) 
            {
                layersStr.append(", ");
            }
        }
        layersStr.append("]");
        
        System.out.println("les détails du modèle : Nom : " + this.name + " Layers : " + layersStr + " Activation Function : " + this.activationFunction);
    }    
}
