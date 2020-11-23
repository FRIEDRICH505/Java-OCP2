/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11.exercise11_2;

/**
 *
 * @author FRIEDRICH
 */

public class EmployeeTest {
    
    public static void main(String[] args) throws InvalidOperationException {
      Employeelmpl empArr = new Employeelmpl();
      
      Employee e1 = new Employee(0, "bob", "builder", 1250.50f);
      empArr.add(e1);
      
      Employee e2 = new Employee(1, "John", "Doe", 1250.50f);
      empArr.add(e2);
      
      Employee e3 = new Employee(5, "Jane", "Doe", 1350.50f);
      empArr.add(e3);
      
      Employee[] allEmps = empArr.getAllEmployees();
      for (Employee employee : allEmps) {
          System.out.println(employee + "\n");
      }
        
      
      Employee e = empArr.findById(5);
      if (e != null) {
          System.out.println(empArr + "\n");
      } else {
          System.out.println("\n\nEmployee  not found");     
      }          
    
      //empArr.delete(7);
    }
}