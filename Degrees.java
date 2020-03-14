package Prog1Lab3;

import java.util.Scanner;
public class Degrees {
    
    public static void main(String[] args) {
        //Create new scanner
        Scanner sc = new Scanner(System.in);
        
        //Create instructions for user input
        System.out.println("--------Temperature--------");
        System.out.println("\nThis program asks your for the temperature in Celsius");
        System.out.println("Please enter the temperature.");
        System.out.print("Degrees: ");
        
        //Create variables
        double tempC = sc.nextDouble();
        
        //Implement conditional opetaor
        String answer = (tempC>=0)? "Today must a warm day, don't you feel?":"Feels chilly outside, wouldn't you agree?";
        
        //Output answer
        System.out.println(answer);
    }   
        
    
}

