/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10.exercise10_7;

/**
 *
 * @author FRIEDRICH
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JoinTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        
        // Print out a sorted Buyer's List
        System.out.println("=== Sorted Buyer's List ===");
        String result = tList.stream()
            .map(t -> t.getBuyerName())
            .distinct()
            .sorted()
            .collect(Collectors.joining(", "));
        
        System.out.println("Buyer list: " + result);
            
        
        
        
    }
}
