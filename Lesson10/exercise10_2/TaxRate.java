/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10.exercise10_2;

/**
 *
 * @author FRIEDRICH
 */
public enum TaxRate {  
    CA(0.09d),
    CO(0.08d),
    MA(0.09d);
    
    private final double rate;
    
    TaxRate(double rate){
        this.rate = rate;
    }
    
    public double getRate(){
        return rate;
    }
    
    public static double byState(State s){
        double rate = 0.0d;
        
        switch(s){
            case CA: rate = CA.getRate(); break;
            case CO: rate = CO.getRate(); break;
            case MA: rate = MA.getRate(); break;
        }
        
        return rate;
    }
        
   
 }
