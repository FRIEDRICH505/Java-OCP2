/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson15.exercise15_1;

/**
 *
 * @author FRIEDRICH
 */
public class CountRunnable implements Runnable{
  
  final int count;
  final String threadName;
  
  // Setup Constructor to initialize variables
  public CountRunnable(int count, String name){
    this.count = count;
    this.threadName = name;
  }
  
  public void run(){ 
    // Count with for loop
    for (int i = 1; i <= count; i++){
      System.out.println("Thread " + threadName +
        ": " + i);
    }
  }
}
