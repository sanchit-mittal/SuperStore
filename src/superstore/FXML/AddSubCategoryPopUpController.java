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
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import superstore.Data.Category;
import superstore.Data.Sub_Category;
import superstore.Data.Warehouse;

/**
 * FXML Controller class
 *
 * @author arsheya
 */
public class AddSubCategoryPopUpController implements Initializable {

    @FXML
    AnchorPane ap1;
    @FXML
    ChoiceBox categoryCB;
    @FXML
    TextField subcategoryTF;
    @FXML
    TextField subcategoryTF1;
    @FXML
    ChoiceBox mainMenuCB;
    
    @FXML
    Button addsubB;
    @FXML
    Button modifysubB;
    @FXML
    Button deletesubB;

    
    private Warehouse warehouse;
    
    private int currentChoice = 1000; //0-add 1-delete 2-modify
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void initialize(Warehouse warehouse) {
        this.warehouse = warehouse;
        this.ap1.setVisible(false);
        this.addsubB.setVisible(false);
        this.modifysubB.setVisible(false);
        this.deletesubB.setVisible(false);
//        this.addsubB.setDisable(true);
        
        reset();
        
        //CHEAT
        
        this.warehouse.addCategory("test@category1");
        this.warehouse.addCategory("test@category2");
        this.warehouse.addCategory("test@category3");
           
        Category c = this.warehouse.getCategories().get(0);
        this.warehouse.addSub_Category("test@subcategory1",c);
//        this.warehouse.addSub_Category("test@subcategory2",c);
//        this.warehouse.addSub_Category("test@subcategory3",c);
//        
//        this.warehouse.addItem(this.warehouse.getCategories().get(0) , this.warehouse.getCategories().get(0).getSubcategories().get(0));
//        this.warehouse.getItems().get(0).setName("Test@Item1");
//        this.warehouse.addItem(this.warehouse.getCategories().get(0) , this.warehouse.getCategories().get(0).getSubcategories().get(0));
//        this.warehouse.getItems().get(1).setName("Test@Item2");
        //
        
        
        //ADDING DEFAULT OPTIONS - ADD,DELETE,MODIFY
        this.mainMenuCB.getItems().addAll("ADD","DELETE","MODIFY");
        
        
        this.mainMenuCB.getSelectionModel().selectedItemProperty().addListener(  (e,oldvalue,newvalue) -> {
            FadeTransition ft = new FadeTransition(Duration.millis(1000), ap1);
            ft.setFromValue(0.0);
            ft.setToValue(1.0);
            
            reset();
            
            System.out.println(newvalue);
            
            
            if(this.mainMenuCB.getSelectionModel().getSelectedIndex() >= 0){
                this.currentChoice = this.mainMenuCB.getSelectionModel().getSelectedIndex() ;
                
                switch(this.currentChoice){
                case 0:
                    addScreen();
                    break;
                case 1:
                    deleteScreen();
                    break;
                case 2:
                    modifyScreen();
                    break;
                default:
                    reset();
                    break;
            }
                
                System.out.println("Checking if isVisible" + ap1.isVisible());
                if(!ap1.isVisible()){
                    ap1.setVisible(true);
                    ft.play();
                }
                check();
                
            }else {
                    ap1.setVisible(false);
                }
        });
        
        
        this.mainMenuCB.setTooltip(new Tooltip("Select Main Option"));
        this.categoryCB.setTooltip(new Tooltip("Select Category"));
        
        this.categoryCB.getSelectionModel().selectedItemProperty().addListener( (e,oldvalue,newvalue) -> {
            System.out.println(newvalue);
            String temp1 = "";
            int index = this.categoryCB.getSelectionModel().getSelectedIndex();
//            int index1 = this.subcategoryCB.getSelectionModel().getSelectedIndex();
            System.out.println("index:- " + index);
            ArrayList<Sub_Category> items;
            if(index >=0){
                items = this.warehouse.getCategories().get(index).getSubcategories();
            }
            else{
                items = null;//may be wrong
            }
            
            if(items.size()> 0)
                System.out.println(items.get(0).getName());
            else
                System.out.println("EMPTY");
            
            check();
        });
        
        
        //POPULATE CATEGORIES
        String temp = "";
        for (int i = 0; i < warehouse.getCategories().size();i++) {
            temp = warehouse.getCategories().get(i).getName();
            System.out.println(temp);
            this.categoryCB.getItems().add(temp);
        }  
       
    }
    
    
    public void check() {
        
        System.out.println("inside check test");
        if (subcategoryTF.getText() != null && (!subcategoryTF.getText().isEmpty() || !subcategoryTF.getText().trim().isEmpty())) {
            System.out.println("Current choice ->"+this.currentChoice);
            switch(this.currentChoice){
                case 0:
                    //add
                    if (checkIfItemExists(subcategoryTF.getText().trim()) && !subcategoryTF.getText().trim().isEmpty()) {
                        addsubB.setVisible(false);
                    } 
                    else{
                        addsubB.setVisible(true);
                    }
                        
                    break;
                case 1:
                    //delete
                    if (checkIfItemExists(subcategoryTF.getText().trim())) {
//                        if(!ap2.isVisible()){
//                            ap2.setVisible(true);
//                            ft.play();
//                        }
//                    } else {
//                        ap2.setVisible(false);
                    }                        
                    break;
                case 2:
                    //modify
                    if (checkIfItemExists(subcategoryTF.getText().trim())) {
//                        if(!ap2.isVisible()){
//                            ap2.setVisible(true);
//                            ft.play();
//                            //show older details of item
//                        }
//                    } else {
//                        ap2.setVisible(false);
                    }
                    break;
                    
            }
            
            
        } else {
//           ap2.setVisible(false);
        }
    }
    
                
    public void addSubCategory(){
        System.out.println("add sub category button pressed");
        
    }
    
    public void modifySubCategory(){
        System.out.println("modify sub category button pressed");
        
    }
    public void deleteSubCategory(){
        System.out.println("delete sub category button pressed");
        
    }
    
    private boolean checkIfItemExists(String name){
        ArrayList<Sub_Category> items = null;
        int index = this.categoryCB.getSelectionModel().getSelectedIndex();
        System.out.println("index:- " + index + "       INSIDE checkIfItemExists Method.");
        if(index >=0){
            items = this.warehouse.getCategories().get(index).getSubcategories();
        }
        
        if(items == null){
            return false;
        }
        else{
            for (int i = 0; i < items.size(); i++) {
                if(items.get(i).getName().equals(name))
                    return true;
            }
        }
        return false;        
    }
    
    private void addScreen(){
//        this.addItem.setVisible(true);
    }
    
    private void modifyScreen(){
//        this.updateItem.setVisible(true);
        
    }
    
    private void deleteScreen(){
//        this.deleteItem.setVisible(true);
    }
    
    private void reset(){
       
    }
    
}
