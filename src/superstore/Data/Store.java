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
public class Store implements Functionalities{
    
    private int ID;
    private int name;
    private Warehouse upwarehouse;
    private ArrayList<Item> items;
    private ArrayList<Category> categories;

    public int getID() {
        return ID;
    }

    public int getName() {
        return name;
    }

    public Warehouse getUpwarehouse() {
        return upwarehouse;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setUpwarehouse(Warehouse upwarehouse) {
        this.upwarehouse = upwarehouse;
    }

    @Override
    public void addCategory(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addSub_Category(String name,Category categoryName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addItem(Category categoryName,Sub_Category subCategoryName) {
        
    }

    @Override
    public void updateCategory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateSub_Category() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCategory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteSub_Category() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item findItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sort() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void order() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
