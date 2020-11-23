/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4.exercise4_1;

/**
 *
 * @author FRIEDRICH
 */

public class EmployeeTest {
        public static void main(String[] args) {
            Engineer eng = new Engineer (101, "Jane Smith", "012-34-5678", 120_345.27);
            Manager mgr = new Manager (207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
            Admin adm = new Admin (304, "Bill Munroe", "108-23-6509", 75_002.34);
            Director dir = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);
            
            EmployeeStockPlan esp = new EmployeeStockPlan();
            printEmployee(eng, esp);
            printEmployee(adm, esp);
            printEmployee(mgr, esp);
            printEmployee(dir, esp);
            
            System.out.println("\nTesting raiseSalary and setName on Manager:");
            mgr.setName("Barbara Johnson-Smythe");
            mgr.raiseSalary(10_000.00);
            printEmployee(mgr, esp);
        }
            
        public static void printEmployee(Employee emp) {
            System.out.println("Employee type: " + emp.getClass().getSimpleName());
            System.out.println(emp);
        }
       public static void printEmployee(Employee emp, EmployeeStockPlan esp) {
            System.out.println(emp);
            System.out.println("Stock options: " + esp.grantStock(emp));
            
    }
     
    }
     
    