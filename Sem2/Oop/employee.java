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
class OopLab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter name :");
        String name = input.nextLine();
        System.out.println("Enter salary :");
        int salary = input.nextInt();
        
        Employee emp1 = new Employee(name, salary);
 
        emp1.displayEmployee();
    }    
}
class Employee{
        String name;
        int salary;
        
        public Employee(String name , int salary) {
            this.name = name;
            this.salary = salary;
        }
        
        public void displayEmployee() {
            System.out.println("name : " + name);
            System.out.println("salary : " + salary);
        }
}

