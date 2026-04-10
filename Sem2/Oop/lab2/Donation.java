/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooplab2;

/**
 *
 * @author RAID
 */
public class Donation {
    private String donorName;
    private int amount;
    private String donationType;
    
    public Donation(String donorName, int amount, String donationType){
        this.donorName = donorName;
        setAmount(amount);
        setDonationType(donationType);
    }
    //no get require
    public void setAmount(int amount){
        if(amount > 0){
            this.amount = amount;
        }else{
            System.out.println("Print a proper amount");
        }
    }
    public void setDonationType(String donationType){
        if(donationType.equals("Zakat") || donationType.equals("Sadaqah") || donationType.equals("Waqf")){
            this.donationType = donationType;
        }else{
            System.out.println("Choose a proper donation tyype");
        }
    }
    
    public void dispDonation(){
        System.out.println("Displaying donation information: ");
        System.out.println(donorName);
        System.out.println(amount);
        System.out.println(donationType);
    }
}
