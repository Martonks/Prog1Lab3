import java.util.Scanner;
public class Question49 {
    
    public static void main(String[] args) {

        //Create scanner
        Scanner sc = new Scanner(System.in);

        //Insert instructions for user input
        System.out.println("--------SEASON GUESSER--------");
        System.out.println("This program guesses the season based on the temperature (in Fahrenheit) given.");
        System.out.print("Temperature: ");

        //Create variable
        int temperature = sc.nextInt();

        //Create if statements
        if (temperature >= 90){
            System.out.println("It must be summer!");
        } else if (temperature >= 70 && temperature < 90){
            System.out.println("It must be spring!");
        } else if (temperature >= 50 && temperature < 70){
            System.out.println("It must be fall!");
        } else if (temperature < 50){
            System.out.println("It must be winter!");
        } else if (temperature > 110 && temperature < -5){
            System.out.println("Temperature entered is outside the valid range");
        }
    }
}
