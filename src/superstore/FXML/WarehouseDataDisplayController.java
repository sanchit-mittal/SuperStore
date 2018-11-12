/*
 * Name    : - PORVIL
 * Roll No : - 2017304
 */
package superstore.FXML;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import superstore.Data.Item;
import superstore.Data.Store;
import superstore.Data.Warehouse;

/**
 * FXML Controller class
 *
 * @author PD
 */
public class WarehouseDataDisplayController implements Initializable {

    @FXML
    TableView dataTV;
    
    private Warehouse warehouse;
    private Store store;
    private int type; //1-WAREHOUSE , 2-STORE
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    public void initialize(Warehouse warehouse) {
        this.warehouse = warehouse;
        //STORE IS NULL
        setup();        
    }  
    
    public void initialize(Store store) {
        this.store = store;
        //WAREHOUSE IS NULL
        setup();        
    }  
    
    public void setup(){
        TableColumn<Item,String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        
        TableColumn<Item,Integer> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(80);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
                
        TableColumn<Item,Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        //
        if(type == 1)
            dataTV.setItems(getItems());
        else if(type == 1)
            dataTV.setItems(getItems2());
        else{
            System.out.println("WOW, CHECK HERE");
        }
        dataTV.getColumns().addAll(nameColumn,quantityColumn,priceColumn);
        
    } 
    
    public ObservableList<Item> getItems(){
        ObservableList<Item>  items = FXCollections.observableArrayList();
        for (int i = 0; i < warehouse.getItems().size(); i++) {
            items.add(warehouse.getItems().get(i));
        }
        
        return items;
    }
    
    public ObservableList<Item> getItems2(){
        ObservableList<Item>  items = FXCollections.observableArrayList();
        for (int i = 0; i < store.getItems().size(); i++) {
            items.add(store.getItems().get(i));
        }
        
        return items;
    }
    
}
