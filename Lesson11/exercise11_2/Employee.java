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

import java.text.NumberFormat;



public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private float salary;

    public Employee() { }
    
    public Employee(int id, String firstName, String lastName, float salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
       
        this.salary = salary;
    }

public int getId() {
    return id;
}

public String getFirstName() {
    return firstName;
}

public String getLastName() {
    return lastName;
}


public float getSalary() {
    return salary;
}

@Override
public String toString() {
    return "Employee ID:   " + getId() + "\n" +
            "Employee Name: " + getFirstName() + " " + getLastName() + "\n" +
            
            "Salary:        " + NumberFormat.getCurrencyInstance().format((double)getSalary());
}




    
}

