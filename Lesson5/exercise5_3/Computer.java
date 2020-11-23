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
public class Computer {
    public PowerState myState;
    
    public void setState(PowerState state) {
        switch (state) {
            case ON: 
                this.myState = state;
                break;
            case OFF: 
                this.myState = state;
                break; 
            case SUSPEND: 
                this.myState = state;
                break;     
            default:
                System.out.println("This power state does not exist");
                break;
        }
    }
    public void getState() {
        System.out.println("This current power state is " + myState);
    }
}
