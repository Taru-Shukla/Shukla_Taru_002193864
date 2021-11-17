/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Restaurant.Order;
import java.util.ArrayList;
import Business.Restaurant.Order;
/**
 *
 * @author harold
 * @author taru shukla
 */
public class Customer {
    
    private String name;
    private String username;
    private String password;
    private String address;
    private String phoneNumber;
    private ArrayList<Order> orders;
    private Order order;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Customer(String username,String password, String name) {
        this.username = username;
        this.name = name;
        this.password = password;
        orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(Order order) {
        this.order = order;
        orders.add(order);
    }
    
}
