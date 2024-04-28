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
public abstract class BaseModel 
{
    protected String name;
    int version;
    String description;
    String device;
    
    public BaseModel(String name, int version, String description, String device){
        this.name = name;
        this.version = version;
        this.description = description;
        this.device = device;
    }
    
    void displayDetails()
    {
        System.out.println("les détails du modèle : Nom : " + this.name + " Version : " + this.version + " Description : " + this.description + " Device : " + this.device);
    }
}
