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
public class Dog extends Animal {
    
    //declare field
    private String sound;

    //super constructor
    public Dog(String breed, int lifespan, String behavior, double price) {
        super(breed, lifespan, behavior, price);
        //super.setBreed("Bulldog");
    }
    
    //declare method
    public String getSound() {
        return "Woof!!";
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    

}
