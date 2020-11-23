/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson17.exercise17_1;

/**
 *
 * @author FRIEDRICH
 */

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class CalcTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        
        System.out.println("=== Transactions Totals ===");
        
        Stream<SalesTxn> s1 = tList.stream();
        Stream<SalesTxn> s2 = s1.filter(
            t -> t.getBuyerName().equals("Radio Hut"));
        DoubleStream s3 = s2.mapToDouble(
            t -> t.getTransactionTotal());
        double t1 = s3.sum();
        
        System.out.printf("Radio Hut Total: $%,9.2f%n", t1);
        
    }
}
