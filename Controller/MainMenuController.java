/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author laron
 */

public class MainMenuController implements Initializable {
    
    //containers
    Stage stage;
    Parent scene;
    
    //@FXML annotations
    @FXML
    void onActionCreateAnimal(ActionEvent event) throws IOException {
        
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/View/CreateAnimalMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
        
    }
    @FXML
    void onActionDisplayAnimals(ActionEvent event) throws IOException {
        
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/View/DisplayAnimalMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
        
    }
    @FXML
    void onActionExit(ActionEvent event) {
        
        System.exit(0);
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
