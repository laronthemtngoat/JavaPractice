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
public abstract class Animal {
    
    //Declare fields
    private String breed;
    private int lifespan;
    private String behavior;
    private double price;
    private static String seller;
    
    //declare constructor

    public Animal(String breed, int lifespan, String behavior, double price) {
        this.breed = breed;
        this.lifespan = lifespan;
        this.behavior = behavior;
        this.price = price;
    }

    //static members
    public static String getSeller() {
        return seller;
    }
    public static void setSeller(String seller) {
        Animal.seller = seller;
    }
    
    
    //declare methods
    public String getBreed() {
        return breed;
    }
    public int getLifespan() {
        return lifespan;
    }
    public String getBehavior() {
        return behavior;
    }
    public double getPrice() {
        return price;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }
    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}
