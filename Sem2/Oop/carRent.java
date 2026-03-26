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
public class carRent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter car model :");
        String carModel = input.nextLine();
        System.out.println("Enter pricePerDay :");
        int pricePerDay = input.nextInt();
        System.out.println("Enter days :");
        int days = input.nextInt();
        
        Car car1 = new Car(carModel, pricePerDay, days);
 
        car1.displayDetails();
    }    
}
class Car{
        String carModel;
        int pricePerDay;
        int days;
        
        public Car(String carModel, int pricePerDay, int days) {
            this.carModel = carModel;
            this.pricePerDay = pricePerDay;
            this.days = days;
        }
        
        public int calculateTotal(){
            return this.pricePerDay * this.days;
        }
        public void displayDetails() {
            System.out.println("Car Model : " + carModel);
            System.out.println("Total rent: " + calculateTotal());
        }
}

