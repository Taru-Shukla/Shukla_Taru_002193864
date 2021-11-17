/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 * @author taru shukla
 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliveryManDir;
    private DeliveryMan d;

    public DeliveryManDirectory() {
        deliveryManDir = new ArrayList<>();
    }

    public ArrayList<DeliveryMan> getDeliveryManDir() {
        return deliveryManDir;
    }

    public DeliveryMan getD() {
        return d;
    }

    public DeliveryMan setD(DeliveryMan d) {
        this.d = d;
        deliveryManDir.add(d);
        return d;
    }
    
    public DeliveryMan findDeliveryManByName(String name){
       for(DeliveryMan d: deliveryManDir){
           if(d.getUsername().equals(name)){
               return d;
           }
       } 
       return null;
    }
    public String deleteDeliveryManByName(String name){
       for(DeliveryMan d: deliveryManDir){
           if(d.getUsername().equals(name)){
               deliveryManDir.remove(d);
               return "Account deleted successfully";
           }
       }
       return "User not found";
    }
    
}
