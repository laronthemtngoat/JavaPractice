/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lljavafxmlapp;

import Model.DataProvider;
import Model.Dog;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author laron
 */
public class LLJavaFXMLApp extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/MainMenu.fxml"));
        
        Scene scene;
        scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //dog objects
        Dog dog1 = new Dog(1, "Siberian Husky", 15, "Crafty", 599.99, true, "Opens fridge to get beers!");
        Dog dog2 = new Dog(2, "Pitbull/Black Lab Mix", 6, "Goofy Goober", 80.00, true, "Dude");
        Dog dog3 = new Dog(3, "German Shepherd", 1, "Fearful", 150.00, true, "Acts like a cat");
        Dog dog4 = new Dog(4, "Dogo Argentino", 12, "Protective", 1599.99, true, "Gymnast");
        Dog dog5 = new Dog(5, "Anatolian Shepherd", 8, "Intelligent", 150.00, true, "Opens beer bottles without breaking");
        
        DataProvider.addAnimal(dog1);
        DataProvider.addAnimal(dog2);
        DataProvider.addAnimal(dog3);
        DataProvider.addAnimal(dog4);
        DataProvider.addAnimal(dog5);
        
        launch(args);
    }
    
}
