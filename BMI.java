package Prog1Lab3;

import java.util.Scanner;
public class BMI {
 
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Create instructions for user input
         System.out.println("--------BMI Calculator--------");
         System.out.print("\nEnter your weight: ");
            double weightP = sc.nextDouble();
   
         System.out.print("Enter your height: ");
            double heightF = sc.nextDouble();
            
        //Create variables for actual values
            double weightkg = weightP/2.205;
            double heightm = heightF/3.281;
            double bmi = weightkg/(heightm*heightm);
            
        //Create if statements to determine the classification
        if(bmi<=18.5){
            System.out.println("Your BMI is " + String.format("%.2f",bmi));
            System.out.println("You are classified as underweight.");
        } else if (bmi<=24.9){
            System.out.println("Your BMI is " + String.format("%.2f",bmi));
            System.out.println("You are classified as normal weight.");
        } else if (bmi<= 29.9){
            System.out.println("Your BMI is " + String.format("%.2f",bmi));
            System.out.println("You are classified as overweight.");
        } else if (bmi>30){
            System.out.println("Your BMI is " + String.format("%.2f",bmi));
            System.out.println("You are classified as obese.");
        } 
        
         
         
         
        
    }
}
