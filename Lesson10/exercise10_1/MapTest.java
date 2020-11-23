/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10.exercise10_1;
import java.util.List;

class MapTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
   
        // Calculate sales tax
        System.out.println("=== Widget Pro Sales Tax in CA ===");
        tList.stream()
            .filter(t -> t.getState().equals(State.CA))
            .filter(t -> t.getProduct().equals("Widget Pro"))
            .map(t -> t.getTransactionTotal() * TaxRate.byState(t.getState()))
            .forEach(amt -> System.out.printf("Txn tax: $%,9.2f%n", amt));
        
    }
}
