/*
 * Name    : - PORVIL
 * Roll No : - 2017304
 */
package superstore.Data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author PD
 */
public class Cart implements Serializable{
    
    private ArrayList<Item> items;
    private double cost;

    public ArrayList<Item> getItems() {
        return items;
    }

    public double getCost() {
        return cost;
    }

    public void updateQuantity(){
        
    }
    
}
