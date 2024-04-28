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
public abstract class Dataset 
{
    protected boolean isTrain;
    protected String path;
    
    public Dataset(String path, boolean isTrain){
        this.isTrain = isTrain;
        this.path = path;
    }
    
    public abstract void predict();
}
