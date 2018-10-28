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
public class Warehouse implements Functionalities{
    
    private int ID;
    private String name;
    private ArrayList<Store> stores;
    private ArrayList<Item> items;
    private ArrayList<Category> categories;

    public Warehouse(int ID, String name) {
        this.ID = ID;
        this.name = name;
        this.items = new ArrayList<>();
        this.categories = new ArrayList<>();
        this.stores = new ArrayList<>();
    }

    public Warehouse() {
        System.out.println("LOL add code here");
    }

    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Store> getStores() {
        return stores;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public boolean sendACK(){
        //IMPLEMENTATION LEFT

        return true;
    }

    @Override
    public void addCategory(String name) {
       this.categories.add(new Category(name));
    }

    @Override
    public void addSub_Category(String name,Category categoryName) {
        categoryName.addSubCategory(name);
    }

    @Override
    public void addItem(Category categoryName,Sub_Category subCategoryName) {
        Item temp = new Item();
        this.items.add(temp);
        categoryName.getSubcategories().get(categoryName.getSubcategories().indexOf(subCategoryName)).getItems().add(temp);
        System.out.println("ITEM ADDED TO > " + categoryName.getName() + " > " + subCategoryName.getName());
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
