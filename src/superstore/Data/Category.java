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
public class Category implements Serializable{
    
    private String name;
    private ArrayList<Sub_Category> subcategories;

    public Category(String name){
        this.name = name;
        this.subcategories = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Sub_Category> getSubcategories() {
        return subcategories;
    }    
    
    public void addSubCategory(String name){
        subcategories.add(new Sub_Category(name));
    }
    
}
