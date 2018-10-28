/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superstore.FXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import superstore.Data.Warehouse;

/**
 * FXML Controller class
 *
 * @author arsheya
 */
public class WarehousePageController implements Initializable {

    @FXML
    Button itemButton;
    
    @FXML
    ChoiceBox itemCB;
    
    @FXML
    Label warehouseNameLabel;

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
        this.warehouseNameLabel.setText("Warehouse Name :- " + this.warehouse.getName());
        for (int i = 0; i < warehouse.getItems().size(); i++) {
            this.itemCB.getItems().add(warehouse.getItems().get(i).getName());
        }
        this.itemCB.getItems().add("LOL");
    }    
    
    public void itemButtonOnClick() throws IOException{
        System.out.println("item button clicked");
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("AddItemPopUp.fxml"));
        Parent root = (Pane)loader1.load();
        loader1.<AddItemPopUpController>getController().initialize(warehouse);
        Scene scene = new Scene(root, 600,600);
        Stage stage = new Stage();
        
        stage.setTitle("SuperStore Management");
        stage.setScene(scene);
        stage.show();
    }
    
}
