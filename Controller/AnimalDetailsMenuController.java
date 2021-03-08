/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Animal;
import Model.Dog;
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
 * FXML Controller class
 *
 * @author laron
 */
public class AnimalDetailsMenuController implements Initializable {
    
    //containers
    Stage stage;
    Parent scene;    
    
    //@FXML annotations
    @FXML
    private Label animalidLbl;
    @FXML
    private Label breedLbl;
    @FXML
    private Label lifespanLbl;
    @FXML
    private Label behaviorLbl;
    @FXML
    private Label priceLbl;
    @FXML
    private Label vaccLbl;
    @FXML
    private Label specialLbl;

    @FXML
    void onActionDisplayMainMenu(ActionEvent event) throws IOException {

        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/View/MainMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();          
        
    }
    
    public void sendAnimal(Animal dog) {
        
        animalidLbl.setText(String.valueOf(dog.getId()));
        breedLbl.setText(dog.getBreed());
        lifespanLbl.setText(String.valueOf(dog.getLifespan()));
        behaviorLbl.setText(dog.getBehavior());
        priceLbl.setText(String.valueOf(dog.getPrice()));
        
        if(dog.isVaccinated())
            vaccLbl.setText("Yes");
        else
            vaccLbl.setText("No");
        
        if(dog instanceof Dog)
            specialLbl.setText(((Dog) dog).getSpecial());
            
    }    
    
    @FXML
    void onActionDisplayAnimalMenu(ActionEvent event) throws IOException {
        
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/View/DisplayAnimalMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();           

    }    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
