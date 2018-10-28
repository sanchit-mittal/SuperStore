/*
 * Name    : - PORVIL
 * Roll No : - 2017304
 */
package superstore.Data;

/**
 *
 * @author PD
 */
public class Warehouse_Admin {
        
    private String loginid;
    private String password;
    private Warehouse warehouse;

    public Warehouse_Admin(Warehouse warehouse,String password) {
        this.warehouse = warehouse;
        this.password = password;
    }

    
    public String getLoginid() {
        return loginid;
    }

    public String getPassword() {
        return password;
    }
    
    public void handleOrders(){
        
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }
    
}
