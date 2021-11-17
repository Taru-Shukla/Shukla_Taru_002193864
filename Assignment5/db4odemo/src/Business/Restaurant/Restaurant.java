/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {

    private String restaurantName;
    private String restaurantAddress;
    private String managerName;
    private String managerUserName;
    private String managerPassword;
    private ArrayList<Order> orderDir = new ArrayList<>();
    private Order order;
    private ArrayList<Menu> restaurantMenu;
    private Menu menu;

    public Restaurant(String restaurantName, String managerName, String managerUserName, String managerPassword) {
        this.restaurantName = restaurantName;
        this.managerName = managerName;
        this.managerUserName = managerUserName;
        this.managerPassword = managerPassword;
        restaurantMenu = new ArrayList<>();
    }

    public ArrayList<Order> getOrderDir() {
        return orderDir;
    }

    public Order getOrder() {
        return order;
    }

    public String getManagerUserName() {
        return managerUserName;
    }

    public void setManagerUserName(String managerUserName) {
        this.managerUserName = managerUserName;
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public String getManagerName() {
        return managerName;
    }

    public ArrayList<Menu> getRestaurantMenu() {
        return restaurantMenu;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public Menu setMenu() {
        menu = new Menu();
        restaurantMenu.add(menu);
        return menu;
    }

    public void setOrder(Order order) {
        this.order = order;
        orderDir.add(order);
    }

    public Menu getMenuItemByDishName(String item) {
        for (Menu m : restaurantMenu) {
            if (m.getDishName().equals(item)) {
                return m;
            }
        }
        return null;
    }

    public String removeMenuItem(String item) {
        for (Menu m : restaurantMenu) {
            if (m.getDishName().equals(item)) {
                restaurantMenu.remove(m);
                return "Menu Item Deleted";
            }
        }
        return "No such menu item";
    }

    public Order findOrderByCustomerUserName(String name) {

        for (Order o : orderDir) {
            if (o.getCustomer().getUsername().equals(name)) {
                return o;
            }
        }

        return null;
    }
}
