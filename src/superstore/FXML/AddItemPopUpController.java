/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superstore.FXML;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import superstore.Data.Category;
import superstore.Data.Item;
import superstore.Data.Warehouse;

/**
 * FXML Controller class
 *
 * @author arsheya
 */
public class AddItemPopUpController implements Initializable {

    @FXML
    AnchorPane ap2;
    @FXML
    TextField nameTF;
    @FXML
    TextField quantityTF;
    @FXML
    TextField priceTF;
    @FXML
    TextField hTF;
    @FXML
    TextField kTF;
    @FXML
    ChoiceBox categoryCB;
    @FXML
    ChoiceBox subcategoryCB;
    
    Warehouse warehouse;
    ArrayList<Item> items;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void initialize(Warehouse warehouse) {
        this.warehouse = warehouse;
        
        //CHEAT
        
        this.warehouse.addCategory("test@category1");
        this.warehouse.addCategory("test@category2");
        this.warehouse.addCategory("test@category3");
           
        Category c = this.warehouse.getCategories().get(0);
        this.warehouse.addSub_Category("test@subcategory1",c);
        this.warehouse.addSub_Category("test@subcategory2",c);
        this.warehouse.addSub_Category("test@subcategory3",c);
        
        this.warehouse.addItem(this.warehouse.getCategories().get(0) , this.warehouse.getCategories().get(0).getSubcategories().get(0));
        this.warehouse.getItems().get(0).setName("Test@Item1");
        //
        
        
        this.categoryCB.setTooltip(new Tooltip("Select Category"));
        this.subcategoryCB.setTooltip(new Tooltip("Select Sub-Category"));
            
        this.categoryCB.getSelectionModel().selectedItemProperty().addListener((e,oldvalue,newvalue) -> {
            System.out.println(newvalue);
            this.subcategoryCB.getItems().clear();
            String temp1 = "";
            int index = this.categoryCB.getSelectionModel().getSelectedIndex();
            System.out.println("index:- " + index);
            if(index >=0){
                for (int i = 0; i < warehouse.getCategories().get(index).getSubcategories().size();i++) {
                    temp1 = warehouse.getCategories().get(index).getSubcategories().get(i).getName();
                    System.out.println(temp1);
                    this.subcategoryCB.getItems().add(temp1);
                }
        }
            
        });
        
        
        
        this.subcategoryCB.getSelectionModel().selectedItemProperty().addListener( (e,oldvalue,newvalue) -> {
            System.out.println(newvalue);
            String temp1 = "";
            int index = this.categoryCB.getSelectionModel().getSelectedIndex();
            int index1 = this.subcategoryCB.getSelectionModel().getSelectedIndex();
            System.out.println("index:- " + index1);
            if(index1 >=0){
                items = this.warehouse.getCategories().get(index).getSubcategories().get(index1).getItems();
            }
            if(items.size()> 0)
                System.out.println(items.get(0).getName());
            else
                System.out.println("EMPTY");
        });
        
        
        String temp = "";
        for (int i = 0; i < warehouse.getCategories().size();i++) {
            temp = warehouse.getCategories().get(i).getName();
            System.out.println(temp);
            this.categoryCB.getItems().add(temp);
        }
        
        
       
    }

    public void click() {
//        ap2.setVisible(true);
    }

    public void check() {
        FadeTransition ft = new FadeTransition(Duration.millis(1000), ap2);
        ft.setFromValue(0.0);
        ft.setToValue(1.0);
        
        
        if (nameTF.getText() != null && (!nameTF.getText().isEmpty() || !nameTF.getText().trim().isEmpty())) {
            if(!ap2.isVisible()){
                ap2.setVisible(true);
                ft.play();
            }
        } else {
            ap2.setVisible(false);
        }
    }
}
