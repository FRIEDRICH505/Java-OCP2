/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8.exercise8_3;

/**
 *
 * @author FRIEDRICH
 */

import java.util.List;
import java.util.function.Predicate;

public class RoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<Employee> pl = Employee.createShortList();
    RoboMail01 robo = new RoboMail01();
        
    System.out.println("\n==== RoboMail 01");    
    System.out.println("\n=== All Sales 50+");
    pl.stream()
        .filter(p -> p.getAge() >= 50)
        .filter(p -> p.getDept().equals("Sales"))
        .forEach(p -> robo.roboMail(p));
  }
}
