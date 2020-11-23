/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6.exercise6_2;

/**
 *
 * @author FRIEDRICH
 */
public interface BankOperations {

    public void addCustomer(String f, String l, Branch b);

    public int getNumOfCustomers();

    public Customer getCustomer(int customerIndex);

    public default void generateReport() {

        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");

        for (int custIndex = 0; custIndex < this.getNumOfCustomers(); custIndex++) {
            Customer customer = this.getCustomer(custIndex);

            System.out.println();
            System.out.println("Customer: "
                    + customer.getLastName() + ", "
                    + customer.getFirstName()
                    + "\nBranch: " + customer.getBranch() + ", "
                    + customer.getBranch().getServiceLevel());

            for (int acctIndex = 0; acctIndex < customer.getNumOfAccounts(); acctIndex++) {
                AccountOperations account = customer.getAccount(acctIndex);

                System.out.println("    " + account);
            }
        }
    }
}
