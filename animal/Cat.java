/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author laron
 */
public class Cat extends Animal {
    
    //declare fields
    private String sound;
    
    //super constructor
    public Cat(String breed, int lifespan, String behavior, double price) {
        super(breed, lifespan, behavior, price);
        //super.setBreed("Scottish Fold");
    }
    
    //declare methods
    public String getSound() {
        return "Meow!!";
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    
    
}
