/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequencetesting;

/**
 *
 * @author laron
 */
public class SequenceGenerator {
        //field for sequence generator
    public static int id;    

    //Sequence generator for ID numbers - NEED TO FIX THIS
    public static int getNextPartID() {
        
        return id++;
    }         
}
