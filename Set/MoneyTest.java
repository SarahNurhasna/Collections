/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Set;
import java.util.HashSet;
/**
 *
 * @author Asus
 */
public class MoneyTest {
    public static void main(String[] args) {
        HashSet<Money> bagOfMoney = new HashSet<Money>();
        
        Money money1 = new Money(1000);
        Money money2 = new Money(2000);
        Money money3 = new Money(10000);
        Money money4 = new Money(50000);
        Money money5 = new Money(25000);
        Money money6 = new Money(100000);
    
        bagOfMoney.add(money1);
        bagOfMoney.add(money2);
        bagOfMoney.add(money3);
        bagOfMoney.add(money4);
        bagOfMoney.add(money5);
        bagOfMoney.add(money3);
        
        displayWalletContents(bagOfMoney);
        findMoney(bagOfMoney, money3);
        findMoney(bagOfMoney, money1);
        findMoney(bagOfMoney, money5);
        findMoney(bagOfMoney, money6);
        
        bagOfMoney.clear();
        if(bagOfMoney.isEmpty())
            System.out.println("You don't have any money left");
    }//end of main method 
    
    static void findMoney(HashSet<Money> bagOfMoney, Money money){
        if(bagOfMoney.contains(money))
            System.out.println("There is " + money.getDomination() + " rupiah in the wallet");
        else
            System.out.println("There is no " + money.getDomination() + " rupiah in the wallet");
    }
    
    static void displayWalletContents(HashSet<Money> bagOfMoney){
        for(Money money: bagOfMoney)
            System.out.println(money.getDomination() + " ");
    }
}
