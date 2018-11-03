/*
 * Name    : - PORVIL
 * Roll No : - 2017304
 */
package superstore;

import superstore.Data.AllWarehouses;
import superstore.Data.Superuser;
import superstore.Data.AllStores;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import superstore.Data.Warehouse;
import superstore.Data.Warehouse_Admin;
import superstore.FXML.StartupController;

/**
 *
 * @author PD
 */
public class Superstore extends Application {
    
    
    private AllWarehouses warehouses = new AllWarehouses();
    private AllStores stores = new AllStores();
    private Superuser superuser = new Superuser(warehouses,stores);
    private final int height = 600;
    private final int width = 600;
    private User_Login_Database loginDatabase ;

    @Override
    public void init() throws Exception {
        super.init(); 
        loginDatabase = SaveData.readUserDatabase(loginDatabase);
        if(loginDatabase == null){
            loginDatabase = new User_Login_Database();
        }
    }

    @Override
    public void stop() throws Exception {
        super.stop(); 
        loginDatabase = SaveData.writeUserDatabase(loginDatabase);
    }
    
    private void readData(){
        
    }
    
    private void writeData(){
        
    }
    
    private void login(){
        
    }

    public User_Login_Database getLoginDatabase() {
        return loginDatabase;
    }
    
    @Override
    public void start(Stage primaryStage) throws IOException {
//        loginDatabase.put("user", "qwerty12Q");
        //DELETE THE BELOW LINE
        this.warehouses.getAllwarehouses().add(new Warehouse(200,"test"));
        Warehouse_Admin wa = new Warehouse_Admin(this.warehouses.getAllwarehouses().get(0),"Qazwsx12");
        wa.getWarehouse().addCategory("WarehouseAdmin@Category1");
        wa.getWarehouse().addSub_Category("WarehouseAdmin@Sub-Category1",wa.getWarehouse().getCategories().get(0));
        wa.getWarehouse().addItem(wa.getWarehouse().getCategories().get(0),wa.getWarehouse().getCategories().get(0).getSubcategories().get(0));
        this.loginDatabase.getWarehouseDatabase().put("test", wa);
        //
        System.out.println("lolllll");


        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/Startup.fxml"));
        Parent root = (Pane)loader.load();
        loader.<StartupController>getController().initialize(loginDatabase,warehouses,stores,superuser);
        Scene scene = new Scene(root, height,width);
        
        primaryStage.setOnCloseRequest(e -> {
            try {
                stop();
            } catch (Exception ex) {
                Logger.getLogger(Superstore.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("COULDN'T STOP AND SAVE DATA CORRECTLY");
            }
        });
        
        primaryStage.setTitle("SuperStore Management");
        primaryStage.setScene(scene);
//        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
