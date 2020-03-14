package Prog1Lab3;

import java.util.Scanner;
public class Question42 {
    
    public static void main(String[] args) {
        
    //QUESTION 42

        //Insert instructions for user input
        System.out.println("--------AREA CALCULATION--------");
        System.out.println("This program calculates the area of a square with a side of 0.6667 and a rectangle" +
        " with the sides 1/9 and 4");

        //Create double variables
        double areasqu = 0.6667*0.6667;
        double arearec = 4*0.11111111;
    
        //Add output dialogue
        System.out.println("The square with the sides of 0.6667 has an area of "+ areasqu);
        System.out.println("While the rectangle has an area of " + arearec);

        //Create if statement
        if (areasqu==arearec){
            System.out.println("The two figures are equal.");
        } else {
            System.out.println("They are not equivalent figures.");
        }
         

    }
    
}