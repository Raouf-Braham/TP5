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
public interface MachineLearningModel 
{
    public void train(Dataset dataset);
    double predict(Dataset dataset);
    
}
