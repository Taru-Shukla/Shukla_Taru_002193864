/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Restaurant.Order;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author harold
 * @author taru shukla
 */
public class DeliveryMan {

    private String deliveryManName;
    private String username;
    private String password;
    private Order pendingOrders;
    private Boolean available;
    private ArrayList<Order> completedOrders;

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Order getPendingOrders() {
        return pendingOrders;
    }

    public void setPendingOrders(Order pendingOrders) {
        this.pendingOrders = pendingOrders;
        completedOrders.add(pendingOrders);
    }

    public String getDeliveryManName() {
        return deliveryManName;
    }

    public void setDeliveryManName(String deliveryManName) {
        this.deliveryManName = deliveryManName;

    }

    public boolean isAvailability() {
        return available;
    }

    public DeliveryMan(String deliveryManName, String username, String password) {
        this.deliveryManName = deliveryManName;
        this.username = username;
        this.password = password;
        completedOrders = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
