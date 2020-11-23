/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10.exercise10_8;

/**
 *
 * @author FRIEDRICH
 */
public enum BuyerClass {
    BASIC(0.0d),
    SILVER(0.01d),
    GOLD(0.02d),
    PLATINUM(0.03d);
    
    private final double rate;
    
    BuyerClass(double rate){
        this.rate = rate;
    }
    
    public double getRate(){
        return rate;
    }
    
}