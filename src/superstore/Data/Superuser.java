/*
 * Name    : - PORVIL
 * Roll No : - 2017304
 */
package superstore.Data;

/**
 *
 * @author PD
 */
public class Superuser {
    
   AllWarehouses warehouses;
   AllStores stores;

    public Superuser(AllWarehouses warehouses, AllStores stores) {
        this.stores = stores;
        this.warehouses = warehouses;
        
    }
    
    public void display(Warehouse warehouse){
        
    }
   
    public void display(Store store){
        
    }
    
    
    public void displayAll(){
        
    }
    
    public void createWarehouse(){
        warehouses.getAllwarehouses().add(new Warehouse(100,"TEST"));
    }
    
    public void createStore(){
        
    }
    
    public void assignWarehouse(){
        
    }
    
    public void createWarehouseAdmin(){
        
    }
    
    public void createStoreAdmin(){
        
    }
    
    
}
