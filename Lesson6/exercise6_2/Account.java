/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6.exercise6_2;

/**
 *
 * @author FRIEDRICH
 */

public abstract class Account {
    
    protected double balance;
    
    public Account(double balance) {
        this.balance = balance;
    }
        
    @Override
    public String toString() {
        return "Current balance is " + balance;
    }    
}