/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9.exercise9_1;

/**
 *
 * @author FRIEDRICH
 */
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    
    Consumer<Employee> eCons = 
      e -> System.out.println(
        "Name: " + e.getSurName() + "  Role: " 
        + e.getRole() + "  Salary: " + e.getSalary()
      );
    
    System.out.println("=== First Salary");
    eCons.accept(first);
    
  }
}

