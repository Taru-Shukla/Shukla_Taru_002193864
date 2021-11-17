/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Restaurant;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tarushukla
 */
public class Order {
    
    private int orderID;
    private Customer customer;
    private DeliveryMan deliveryBoy;
    private String orderName;
    private Restaurant restaurant;
    private String orderStatus;
    private ArrayList<Menu> item;
    private HashMap<Menu,Integer> quantity;
    private Menu menu;
    private int totalPrice = 0;

    public Order(Customer customer, DeliveryMan deliveryBoy, Restaurant restaurant, String orderStatus) {
        this.customer = customer;
        this.deliveryBoy = deliveryBoy;
        this.restaurant = restaurant;
        this.orderStatus = orderStatus;
        item = new ArrayList<>();
        quantity = new HashMap<>();
    }

    public HashMap<Menu, Integer> getQuantity() {
        return quantity;
    }

    public void setItem(ArrayList<Menu> item) {
        this.item = item;
    }

    public void setQuantity(HashMap<Menu, Integer> quantity) {
        this.quantity = quantity;
    }

    
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DeliveryMan getDeliveryBoy() {
        return deliveryBoy;
    }

    public void setDeliveryBoy(DeliveryMan deliveryBoy) {
        this.deliveryBoy = deliveryBoy;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
   

    public ArrayList<Menu> getItem(){
        return item;
    }
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Menu getMenu() {
        return menu;
    }

    public void addNewMenu(String menu, int q) {
        for(Menu m: restaurant.getRestaurantMenu()){
            if(m.getDishName().equals(menu)){
                Menu mN = restaurant.getMenuItemByDishName(menu);
                item.add(mN);
                quantity.put(mN,q);
            }
        }
    }

    public int getItemTotalValue(Menu m){
        return Integer.valueOf(m.getPrice())*quantity.get(m);
    }
    public int getTotalPrice() {
        for(Menu m:item){
            totalPrice+=Integer.valueOf(m.getOrderPrice());
        }
        return totalPrice;
    }
    

    //Hashmap for quantity
            
 }
