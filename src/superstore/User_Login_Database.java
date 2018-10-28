/*
 * Name    : - PORVIL
 * Roll No : - 2017304
 */
package superstore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import superstore.Data.Store_Admin;
import superstore.Data.Warehouse_Admin;

/**
 *
 * @author PD
 */
public class User_Login_Database implements Serializable{
    public ArrayList<Integer> test = new ArrayList<>();
    
    private HashMap<String,Warehouse_Admin> warehouseDatabase ;
    private HashMap<String,Store_Admin> storeDatabase ;

    public User_Login_Database() {
        warehouseDatabase = new HashMap<>();
        storeDatabase = new HashMap<>();
    }

    
    

    public HashMap<String, Warehouse_Admin> getWarehouseDatabase() {
        return warehouseDatabase;
    }


    public HashMap<String, Store_Admin> getStoreDatabase() {
        return storeDatabase;
    }

}
