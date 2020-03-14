package Prog1Lab3;

import java.util.*;
public class CircleArea {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //Input system dialogue for user input
        System.out.println("This program calculates the area of a circle with the radius of your choice.");
        System.out.println("Please enter the radius of the circle.");
        System.out.print("Radius: ");
        
        //Create variables
        double radius = sc.nextDouble();
        double area = Math.PI*(radius*radius);
        
        //Make if statements for different dialogue outputs
        if (radius>0){
            System.out.println("The area of the circle is " + String.format("%.2f",area));
        } else {
            System.out.println("The program cannot calculate the area with that radius: Please input a number higher than 0. ");
        }
    }
}

