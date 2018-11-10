/*
 * Name    : - PORVIL
 * Roll No : - 2017304
 */
package superstore.FXML;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import superstore.Data.AllWarehouses;

/**
 * FXML Controller class
 *
 * @author PD
 */
public class WarehouseDataDisplayController implements Initializable {

    @FXML
    TableView dataTV;
    
    private AllWarehouses warehouses;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    public void initialize(AllWarehouses warehouses) {
        this.warehouses = warehouses;
        
        
    }  
    
}
