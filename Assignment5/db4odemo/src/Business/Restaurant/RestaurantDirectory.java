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
public class RestaurantDirectory {

    private ArrayList<Restaurant> restaurantList;
    private Restaurant restaurant;

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public Restaurant addNewRestaurant(String ResName, String ManagerName, String ManagerUsername, String ManagerPassword) {
        restaurant = new Restaurant(ResName, ManagerName, ManagerUsername, ManagerPassword);
        restaurantList.add(restaurant);
        return restaurant;
    }

    public Restaurant findRestaurantByUsername(String managerUserName) {
        for (Restaurant r : restaurantList) {
            if (r.getManagerUserName().equals(managerUserName)) {
                return r;
            }
        }
        return null;
    }

    public Restaurant findRestaurantByRes(String name) {
        for (Restaurant r : restaurantList) {
            if (r.getRestaurantName().equals(name)) {
                return r;
            }
        }
        return null;
    }



    public String deleteRestaurantByUsername(String managerUserName) {
        for (Restaurant r : restaurantList) {
            if (r.getManagerUserName().equals(managerUserName)) {
                restaurantList.remove(r);
                return "Restaurant deleted";
            }
        }
        return "Restaurant not found";
    }

    public RestaurantDirectory() {
        restaurantList = new ArrayList<>();
    }
}
