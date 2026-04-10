/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooplab2;

/**
 *
 * @author RAID
 */
public class QuranClass {
    private String studentName;
    private String level;
    private int fees;
    
    public QuranClass(String studentName, String level, int fees){
        this.studentName = studentName;
        setLevel(level);
        setFees(fees);
    }
    
    public String getStudentName(){
        return studentName;
    }
    public String getLevel(){
        return level;
    }
    public int getFees(){
        return fees;
    }
    
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public void setLevel(String level){
        if(level == "Beginner" || level == "Intermediate" || level == "Advanced"){
            this.level = level;
        }else{
            System.out.println("Provide a proper level");
        }
    }
    public void setFees(int fees){
        if(fees > 0){
            this.fees = fees;
        }else{
            System.out.println("Fees must be added");
        }
    }
    
    public void dispQuranClass(){
        System.out.println("Displaying Quran Class information: ");
        System.out.println(getStudentName());
        System.out.println(getLevel());
        System.out.println(getFees());
    }
}
