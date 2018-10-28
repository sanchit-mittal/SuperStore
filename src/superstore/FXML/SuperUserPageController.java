/*
 * Name    : - PORVIL
 * Roll No : - 2017304
 */
package superstore.FXML;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import superstore.Data.AllStores;
import superstore.Data.AllWarehouses;
import superstore.Data.Store;
import superstore.Data.Superuser;
import superstore.Data.Warehouse;
import superstore.User_Login_Database;

/**
 * FXML Controller class
 *
 * @author PD
 */
public class SuperUserPageController implements Initializable {

    private Superuser superuser ;
    
    ArrayList<Integer> test;
    static int count = 1;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    void initialize(User_Login_Database loginDatabase, AllWarehouses warehouses, AllStores stores, Superuser superuser) {
        System.out.println("LOL in" + getClass().getName());
        test = loginDatabase.test;
        this.superuser = superuser;
    }
    
    public void add(){
        test.add(count++);
    }
    
    public void print(){
        System.out.println("in superuser:-" + test);
    }
    
    public void addWarehouse(){

        superuser.createWarehouse();
        
        System.out.println("CREATING WAREHOUSE");
    }
    
    public void addStore(){
        superuser.createStore();
        System.out.println("CREATING STORE");
    }
    public void linkStoreToWarehouse(){
        superuser.assignWarehouse();
        System.out.println("LINKING STORE TO WAREHOUSE");
    }
    
    public void createWarehouseAdmin(){
        superuser.createWarehouseAdmin();
        System.out.println("CREATING WAREHOUSE ADMIN");
    }
    
    public void showWarehouseData(){
        superuser.display(new Warehouse());
        System.out.println("DISPLAYING WAREHOUSE ___  DATA");
    }
    
    public void showStoreData(){
        superuser.display(new Store());
        System.out.println("DISPLAYING STORE ____ DATA");
    }
    
    
}
