/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map;
import java.util.HashMap;
/**
 *
 * @author Asus
 */
public class AnimalTest {
    public static void main(String[]args){
        HashMap<String, String> animal = new HashMap<>();
        addElements("Cat", "Mammals", animal);
        addElements("Dog", "Reptil", animal);
        addElements("Snake", "Reptil", animal);
        addElements("Dog", "Mammals", animal);
        
        displayElements(animal);
        getValue("Bee", animal);
    }
    
    public static void addElements(String key, String value, HashMap<String, String> animal){
        animal.put(key, value);
    }
    
    public static void getValue(String key, HashMap<String, String> animal){
        if(animal.get(key)== null)
            System.out.println("Try again, wrong animal");
        else
            System.out.println(animal.get(key));
    }
    
    public static void displayElements(HashMap<String, String> animal){
        for(HashMap.Entry<String, String> Animals : animal.entrySet())
            System.out.println(Animals.getKey() + " is " + Animals.getValue());
    }
}
