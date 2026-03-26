/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ooplab;
import java.util.Scanner;
/**
 *
 * @author RAID
 */
public class restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter food name :");
        String foodName = input.nextLine();
        System.out.println("Enter price :");
        int price = input.nextInt();
        System.out.println("Enter quantity :");
        int quantity = input.nextInt();
        
        Order order1 = new Order(foodName, price, quantity);
 
        order1.displayOrder();
    }    
}
class Order{
        String foodName;
        int price;
        int quantity;
        
        public Order(String foodName, int price, int quantity) {
            this.foodName = foodName;
            this.price = price;
            this.quantity = quantity;
        }
        
        public int calculateOrder(){
            return this.price * this.quantity;
        }
        public void displayOrder() {
            System.out.println("FoodName : " + foodName);
            System.out.println("Total amount: " + calculateOrder());
        }
}