/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13.exercise13_2;

/**
 *
 * @author FRIEDRICH
 */
import java.io.Serializable;

public class Item implements Serializable {
    private static final long serialVersionUID = 42L;
    private int id;
    private String description;
    private double cost;

    public Item(int id, String description, double cost) {
        this.id = id;
        this.description = description;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return ("Item ID: " + id + " Description: " + description + " Cost: " + cost);
    }
}