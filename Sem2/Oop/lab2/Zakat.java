/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooplab2;

/**
 *
 * @author RAID
 */
public class Zakat {
    private String name;
    private double income;
    private double zakatAmount;
    
    public Zakat(String name, double income){
        this.name = name;
        setIncome(income);
    }
    //get
    public double getZakatAmount(){
        return zakatAmount;
    }
    //set
    public void setIncome(double income){
        if (income >= 0){
            this.income=income;
            this.zakatAmount=income * 0.025;
        }else{
            System.out.println("Not proper income");
        }
    }
    
    public void dispZakat(){
        System.out.println("Displaying zakat information: ");
        System.out.println(this.name);
        System.out.println(this.income);
        System.out.println(getZakatAmount());
    }
}
