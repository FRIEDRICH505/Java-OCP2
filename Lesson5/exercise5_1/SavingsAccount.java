/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5.exercise5_1;

/**
 *
 * @author FRIEDRICH
 */
public class SavingsAccount extends Account{
     Double rateofinterest=0.06;

    public SavingsAccount(double balance) {
        super(balance);
    }

    
    
 
    

    @Override
    public boolean withdraw(double amount) {
        if(amount <= balance ) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    
     @Override
     public void  deposit(double amount) {
       balance += amount;
       balance +=balance * rateofinterest;
       
        }
    
    @Override
    public String getDescription() {
        return "Checking Account";
    }
    
}
