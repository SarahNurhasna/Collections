/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;
import java.util.LinkedList;
/**
 *
 * @author Asus
 */
public class Stack {
    public static void main (String[]Args){
       LinkedList<String> letters = new LinkedList<>();
       letters.push("A");
       letters.push("B");
       letters.push("C");
       letters.push("D");
       letters.push("E");
       
       System.out.println("Stack : " + letters);
       System.out.println("Stack size : " + letters.size());
       while(!letters.isEmpty())
            System.out.println(letters.pop());
    }
}
