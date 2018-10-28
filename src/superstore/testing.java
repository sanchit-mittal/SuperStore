/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superstore;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import superstore.FXML.AddItemPopUpController;

/**
 *
 * @author arsheya
 */
public class testing extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/AddItemPopUp.fxml"));
        Parent root = (Pane)loader.load();
//        loader.<AddItemPopUpController>getController().initialize();
        Scene scene = new Scene(root, 600,600);
        
        primaryStage.setTitle("SuperStore Management");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
