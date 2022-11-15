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
public class Queue {
    public static void main(String[]Args){
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        System.out.println("Queue : " + numbers);
        System.out.println("Queue size : " + numbers.size());
        System.out.println("The first number is " + numbers.getFirst());
        System.out.println("The last number is " + numbers.getLast());
        System.out.println(numbers.get(3));
        System.out.println();
        while(!numbers.isEmpty())
            System.out.println(numbers.removeFirst());
    }
}
