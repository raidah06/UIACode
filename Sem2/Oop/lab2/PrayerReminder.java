/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooplab2;

/**
 *
 * @author RAID
 */
public class PrayerReminder {
    private String userName;
    private String prayerName;
    private String reminderTime;
    
    public PrayerReminder(String userName, String prayerName, String reminderTime){
        this.userName = userName;
        setPrayerName(prayerName);
        setReminderTime(reminderTime);      
    }
    //get not requested
    public void setPrayerName(String prayerName){
        if(prayerName.equals("Fajr") || prayerName.equals("Dhuhr") || prayerName.equals("Asr") || prayerName.equals("Maghrib") || prayerName.equals("Isha")){
            this.prayerName = prayerName;
        }else{
            System.out.println("Not a proper prayer name");
        }
    }
    public void setReminderTime(String reminderTime){
        if(reminderTime != null && !reminderTime.isEmpty()){
            this.reminderTime = reminderTime;
        }
    }
    
    public void dispPrayerReminder(){
        System.out.println("Displaying Prayer Reminder information: ");
        System.out.println(userName);
        System.out.println(prayerName);
        System.out.println(reminderTime);
    }
}
