/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 * @author taru shukla
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList = new ArrayList<>();
    private Customer customer;
    
    public CustomerDirectory() {
        customerList = new ArrayList<>();
    }

    
    public Customer setCustomer(Customer customer) {
        this.customer = customer;
        customerList.add(customer);
        return customer;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    public Customer getCustomerByUserName(String username){
        for(Customer c:customerList){
            if(c.getUsername().equals(username)){
                return c;
            }
        }
        return null;
    }
    
    public String removeCustomerByName(String name){
        for (Customer c: customerList){
            if(c.getUsername().equals(name)){
                customerList.remove(c);
                return "Account deleted";
            }
        }
        return "Customer not found";
    }
}
