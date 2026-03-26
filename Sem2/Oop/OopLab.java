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
public class OopLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter author :");
        String author = input.nextLine();
        System.out.println("Enter title :");
        String title = input.nextLine();
        
        Book book1 = new Book(title, author);
 
        book1.displayBook();
    }    
}
class Book{
        String title;
        String author;
        
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
        
        public void displayBook() {
            System.out.println("Author : " + author);
            System.out.println("Title : " + title);
        }
}

