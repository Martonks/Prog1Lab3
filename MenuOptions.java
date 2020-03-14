package Prog1Lab3;

import java.util.*;
public class MenuOptions {
   
    public static void main(String[] args){
        //Input new scanner
        Scanner sc = new Scanner(System.in);
        
        //Create instructions for user input
        System.out.println("--------Menu Options--------");
        System.out.println("\nBonjour! Choose one of these converters depending on your needs.");
        System.out.println("(1) Meters to Feet");
        System.out.println("(2) CAD to USD");
        System.out.println("(3) Celcius to Fahrenheit");
        System.out.println("(4) Seconds to Minutes");
        System.out.println("(5) Pounds to Kilograms");
        System.out.print("Enter here: ");
        
        //Create variable
        int choice = sc.nextInt();
        
        //Create switch statements determining the choice of user
        switch(choice){
            case 1:
                System.out.println("\nMETERS TO FEET");
                System.out.print("How many meters are you looking to convert?: ");
                
                
                double meters = sc.nextDouble();
                double feet = meters * 3.280;
                
                System.out.println(String.format("%.2f",meters)+ " meters is equal to " + String.format("%.2f",feet) + " feet");
                break;
                
            case 2:
                System.out.println("\nCAD TO USD");
                System.out.print("How many Canadian dollars would you like to convert to US dollars?: ");
                
                double cad = sc.nextDouble();
                double usd = cad * 1.38;
                
                System.out.println(cad + " CAD is equal to " + usd + " USD");
                break;
                
            case 3:
                System.out.println("\nCELSIUS TO FAHRENHEIT");
                System.out.print("How many degrees Celsius would you like to convert to Fahrenheit?: ");
                
                double tempc = sc.nextDouble();
                double tempf = (tempc * 9/5) + 32;
                
                System.out.println(tempc + " degrees Celsius is equal to " + tempf + " degrees Fahrenheit");
                break;
        
            case 4:
                System.out.println("\nSECONDS TO MINUTES");
                System.out.print("How many seconds would you like to convert to minutes?: ");
                
                int seconds = sc.nextInt();
                int minutes = seconds/60;
                int rest = seconds%60;
                
                System.out.println(seconds + " seconds is equal to " + minutes + " minutes");
                break;
                
            case 5:
                System.out.println("\nPOUNDS TO KILOGRAMS");
                System.out.print("How many pounds would you like to convert to kilograms?: ");
                
                double pounds = sc.nextDouble();
                double kilograms = pounds/2.25;
                
                System.out.println(String.format("%.2f", pounds) + " pounds is equal to " + String.format("%.2f",kilograms) + " kilograms");
                break;
            
             default:
                 System.out.println("That option doesn't exist. Please pick one of the options that is available.");
        }   
    }
    
}
