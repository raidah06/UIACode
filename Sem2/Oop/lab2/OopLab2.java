/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ooplab2;

/**
 *
 * @author RAID
 */
public class OopLab2 {

    /**
     * @param args the command line arguments
     */
    //One main/test class,doesnt say for each class
    public static void main(String[] args) {
        // TODO code application logic here]
        //not requested to get user input
        System.out.println("zakat1: ");
        Zakat zakat1 = new Zakat("am", 240.5);
        System.out.println("zakat2: ");
        Zakat zakat2 = new Zakat("bam", -400);
        zakat1.dispZakat();
        System.out.println();
        
        System.out.println("hajj1: ");
        Hajj hajj1 = new Hajj("bah", "Ph234", 67, "Pending");
        System.out.println("hajj2: ");
        Hajj hajj2 = new Hajj("gah", null, -23, "Nah"); 
        hajj1.dispHajj();
        System.out.println();
        
        System.out.println("dono1: ");
        Donation donation1 = new Donation("Bob", 67, "Zakat");
        System.out.println("dono2: ");
        Donation donation2 = new Donation("Big", -34, "labubu");
        donation1.dispDonation();
        System.out.println();
       
        System.out.println("quranc1: ");
        QuranClass quranC1 = new QuranClass("bih", "Beginner", 67);
        System.out.println("quranc2: ");
        QuranClass quranC2 = new QuranClass("fig", "Hacker", -32);
        quranC1.dispQuranClass();
        System.out.println();
        
        System.out.println("premind1: ");
        PrayerReminder pReminder1 = new PrayerReminder("Sigma", "Dhur", "8:40");
        System.out.println("premind2: ");
        PrayerReminder pReminder2 = new PrayerReminder("Omega", "Tarawih",null);
        pReminder1.dispPrayerReminder();
        System.out.println();
    }
    
}
