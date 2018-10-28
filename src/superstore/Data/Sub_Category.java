/*
 * Name    : - PORVIL
 * Roll No : - 2017304
 */
package superstore.Data;

import java.util.ArrayList;

/**
 *
 * @author PD
 */
public class Sub_Category {
    
    private String name;
    private ArrayList<Item> items;

    public Sub_Category(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    
}
