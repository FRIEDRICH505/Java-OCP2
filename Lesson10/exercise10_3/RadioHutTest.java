/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10.exercise10_3;

/**
 *
 * @author FRIEDRICH
 */

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class RadioHutTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        Consumer<SalesTxn> radioReport = 
          t -> System.out.printf("ID: " + t.getTxnId() + "  Seller: " + t.getSalesPerson() 
          + "-- Buyer: " + t.getBuyerName() + " -- State: " 
          + t.getState() + " -- Amt: $%,9.0f%n", t.getTransactionTotal());
        
        // Print out Radio Hut Transactions
        System.out.println("=== Radio Hut Transactions ===");
        tList.stream()
            .filter(t -> t.getBuyerName().equals("Radio Hut"))
            .forEach(radioReport);
        
        // Print out the total number of transactions
        System.out.print("Total Transactions: ");
        long tCount = tList.stream()
            .filter(t -> t.getBuyerName().equals("Radio Hut"))
            .count();
        System.out.println(tCount);
        
        
        // Print largest transaction
        System.out.println("=== Radio Hut Largest ===");
        Optional<SalesTxn> tLarge = tList.stream()
            .filter(t -> t.getBuyerName().equals("Radio Hut"))
            .max(Comparator.comparing(SalesTxn::getTransactionTotal));
        
        if(tLarge.isPresent()){ radioReport.accept(tLarge.get());}
        
        
        // Print smallest transaction
        System.out.println("=== Radio Hut Smallest ===");
        Optional<SalesTxn> tSmall = tList.stream()
            .filter(t -> t.getBuyerName().equals("Radio Hut"))
            .min(Comparator.comparing(SalesTxn::getTransactionTotal));
        
        if(tSmall.isPresent()){ radioReport.accept(tSmall.get());}                 
    }
}
