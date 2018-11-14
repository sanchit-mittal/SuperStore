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
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;
import superstore.Data.Category;
import superstore.Data.Item;
import superstore.Data.Warehouse;

/**
 * FXML Controller class
 *
 * @author PD
 */
public class ShowCategoriesController implements Initializable {

    @FXML
    Button goB;
    @FXML
    Button backB;
    @FXML
    ChoiceBox CB;
    @FXML
    TableView TV;
    
    private Warehouse warehouse;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    public void initialize(Warehouse warehouse) {
        
        this.warehouse = warehouse;
        
        setup();//SETUPS THE TABLE VIEW
        
        this.CB.setTooltip(new Tooltip("Select Category"));
            
        this.CB.getSelectionModel().selectedItemProperty().addListener((e,oldvalue,newvalue) -> {
            System.out.println(newvalue);
            String temp1 = "";
            int index = this.CB.getSelectionModel().getSelectedIndex();
            System.out.println("index:- " + index);
            if(index >=0){
                for (int i = 0; i < warehouse.getCategories().size();i++) {
                    temp1 = warehouse.getCategories().get(index).getName();
                    System.out.println(temp1);
                    
                }
            }
            
            
        });
        
        for (int i = 0; i < warehouse.getCategories().size(); i++) {
            this.CB.getItems().add(this.warehouse.getCategories().get(i));
            System.out.println("Item:- " + i + " is added.");
        }
        
        
        
    }    
    
    //FIX GO,BACK,DISPLAY METHODS
    
    public void go(){
        System.out.println("INSIDE GO");
    }
    
    public void back(){
        System.out.println("INSIDE BACK");
    }
  
       public void setup(){
        TableColumn<Item,String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        
//        TableColumn<Item,Integer> quantityColumn = new TableColumn<>("Quantity");
//        quantityColumn.setMinWidth(80);
//        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
//                
//        TableColumn<Item,Double> priceColumn = new TableColumn<>("Price");
//        priceColumn.setMinWidth(100);
//        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        //
        
        TV.setItems(getItems());
        
        TV.getColumns().addAll(nameColumn);
        
    } 
    
    public ObservableList<Category> getItems(){
        ObservableList<Category>  categories = FXCollections.observableArrayList();
        for (int i = 0; i < warehouse.getCategories().size(); i++) {
            categories.add(warehouse.getCategories().get(i));
        }
        
        return categories;
    }
}
