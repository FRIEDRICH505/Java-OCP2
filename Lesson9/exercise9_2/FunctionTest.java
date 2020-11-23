/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9.exercise9_2;

/**
 *
 * @author FRIEDRICH
 */
import java.util.List;
import java.util.function.ToDoubleFunction;

public class FunctionTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    
    ToDoubleFunction<Employee> eFunc = 
       e -> e.getSalary() * Bonus.byRole(e.getRole());
      
    System.out.println("=== First Employee Bonus");
    first.printSummary();
    System.out.println("Bonus: " + eFunc.applyAsDouble(first));
        
  }
}

