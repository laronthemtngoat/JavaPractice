/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author laron
 */
public class DataProvider {
    
    private static ObservableList<Animal> allAnimals = FXCollections.observableArrayList();
    private static ObservableList<Animal> filteredAnimals = FXCollections.observableArrayList();
    
    //methods
    public static void addAnimal(Animal animal)  {        
        allAnimals.add(animal);           
    }
    public static ObservableList<Animal> getAllAnimals() {
        return allAnimals;
    }
    public static ObservableList<Animal> getAllFilteredAnimals() {
        return filteredAnimals;
    }    
}
