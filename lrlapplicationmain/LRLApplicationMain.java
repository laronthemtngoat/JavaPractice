/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lrlapplicationmain;


import animal.Animal;
import animal.Cat;
import animal.Dog;




/**
 *
 * @author laron
 */
public class LRLApplicationMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal.setSeller("Petco");
        
        
        Dog dog = new Dog("Pitbull", 10, "Loyal", 500.0);
        Cat cat = new Cat("Ragdoll", 12, "Evil", 10.0);
        
        dog.setSeller("Pet World");
        System.out.println(Animal.getSeller());
        System.out.println(dog.getSeller());
        System.out.println(cat.getSeller());
        
        /*
        //create dog and cat objects
        

        
        //casting w/ subclass methods
        Animal dog1 = new Dog("Bull Mastiff", 10, "Territorial", 1500.0); 
        System.out.println(((Dog)dog1).getSound());
        
        if(dog instanceof Dog)
            System.out.println("dog is an instance of Dog");
        if(dog1 instanceof Dog)
            System.out.println("dog1 is an instance of Dog");        
        if(cat instanceof Cat)
            System.out.println("cat is an instance of Cat");
        
        System.out.println(dog.getBreed());
        System.out.println(dog.getLifespan());
        System.out.println(dog.getBehavior()); 
        System.out.println(dog.getPrice());
        System.out.println(dog.getSound());
        System.out.println(cat.getBreed());
        System.out.println(cat.getLifespan());
        System.out.println(cat.getBehavior()); 
        System.out.println(cat.getPrice());
        System.out.println(cat.getSound());
*/
    }
}
