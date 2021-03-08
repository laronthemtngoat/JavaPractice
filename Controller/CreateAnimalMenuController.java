/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DataProvider;
import Model.Dog;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author laron
 */
public class CreateAnimalMenuController implements Initializable {
    
    //containers
    Stage stage;
    Parent scene;
    
    //@FXML annotations
    @FXML
    private TextField animalIdTxt;
    @FXML
    private TextField breedTxt;
    @FXML
    private TextField lifespanTxt;  
    @FXML
    private TextField behaviorTxt;
    @FXML
    private TextField priceTxt;
    @FXML
    private RadioButton vaccYesRBtn;
    @FXML
    private RadioButton vaccNoRBtn;
    @FXML
    private ToggleGroup vaccTG;    

    @FXML
    void onActionDisplayMainMenu(ActionEvent event) throws IOException {
        
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "This will clear all text field values. Do you want to continue?");
        
        Optional<ButtonType> result = alert.showAndWait();
        
        if(result.isPresent() && result.get() == ButtonType.OK) {
            
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/View/MainMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show(); 
        
        }              
    }
    
    @FXML
    void onActionSaveAnimal(ActionEvent event) throws IOException {
        
        
        try {
            int id = Integer.parseInt(animalIdTxt.getText());
            String breed = breedTxt.getText();
            int lifespan = Integer.parseInt(lifespanTxt.getText());
            String behavior = behaviorTxt.getText();
            double price = Double.parseDouble(priceTxt.getText());
            boolean isVaccinated;
            String special = null;

            if(vaccYesRBtn.isSelected())
                isVaccinated = true;
            else
                isVaccinated = false;

            DataProvider.addAnimal(new Dog(id, breed, lifespan, behavior, price, isVaccinated, special));

            stage = (Stage)((Button)event.getSource()).getScene().getWindow();
            scene = FXMLLoader.load(getClass().getResource("/View/MainMenu.fxml"));
            stage.setScene(new Scene(scene));
            stage.show();
        }
        catch(NumberFormatException e){
            
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning Dialog");
            alert.setContentText("Please enter a valid value for each text field.");
            alert.showAndWait();
        
        }
        
        //getting text

        
    }    
            
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
}
