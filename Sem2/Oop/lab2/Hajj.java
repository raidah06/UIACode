/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooplab2;

/**
 *
 * @author RAID
 */
public class Hajj {
    private String name;
    private String passportNumber;
    private int age;
    private String paymentStatus;
    
    public Hajj(String name, String passportNumber, int age, String paymentStatus){
        this.name = name;
        setPassportNumber(passportNumber);
        setAge(age);
        setPaymentStatus(paymentStatus);
    }
    
    public String getName(){
        return name;
    }
    public String getPassportNumber(){
        return passportNumber;
    }
    public int getAge(){
        return age;
    }
    public String getPaymentStatus(){
        return paymentStatus;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setPassportNumber(String passportNumber){
        if(passportNumber != null && !passportNumber.isEmpty()){
            this.passportNumber = passportNumber;
        }else{
            System.out.println("Password cannot be empty");
        }
    }
    public void setAge(int age){
        if(age >= 18){
            this.age = age;
        }else{
            System.out.println("You must be over 18");
        }
    }
    public void setPaymentStatus(String paymentStatus){
        if(paymentStatus.equals("Paid")|| paymentStatus.equals("pending")){
            this.paymentStatus = paymentStatus;
        }else{
            System.out.println("error with payment");
        }
    }
    
    public void dispHajj(){
        System.out.println("Displaying Hajj information: ");
        System.out.println(getName());
        System.out.println(getPassportNumber());
        System.out.println(getAge());
        System.out.println(getPaymentStatus());
    }
}
