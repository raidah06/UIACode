/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ooplab;
import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount bank1 = null; 
        int opt;
        do {
            System.out.println("1. Create account");
            System.out.println("2. Deposit to account");
            System.out.println("3. Show account balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            opt = input.nextInt();
            input.nextLine();

            switch(opt) {
                case 1:
                    System.out.print("Enter bank account name: ");
                    String name = input.nextLine();
                    System.out.print("Enter initial balance: ");
                    int balance = input.nextInt();
                    bank1 = new BankAccount(name, balance);
                    System.out.println("Account created successfully!");
                    break;

                case 2:
                  
                    System.out.print("Enter amount to deposit: ");
                    int add = input.nextInt();
                    bank1.deposit(add);
                    System.out.println("Deposited" + add);
        
                    break;

                case 3:
                    if (bank1 != null) {
                        bank1.displayBalance();
                    } else {
                        System.out.println("No account exists");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid");
            }
        } while(opt != 4);
    }
}

class BankAccount {
    String name;
    int balance;

    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    public void deposit(int add) {
        this.balance += add; 
    }
    public void displayBalance() {
        System.out.println("Name : " + name);
        System.out.println("Balance : " + balance);
    }
}