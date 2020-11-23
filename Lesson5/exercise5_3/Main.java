/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5.exercise5_3;

/**
 *
 * @author FRIEDRICH
 */
public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Computer();
        
        comp1.setState(PowerState.OFF);
        
        comp1.getState();
    }
}
