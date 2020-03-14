package Prog1Lab3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Birthday{

    public static void main(String[] args){

        //
        DateFormat date = new SimpleDateFormat("YYYY-MM-DD", Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);
        Date birthday = new Date();
        Date today = new Date();
        double time;
        String in;
        
        //
        System.out.println("--------BIRTHDAY FORMAT--------");
        System.out.println("This program asks you for your birthday amd prints it out in the 'YYYY-MM-DD' format");
        System.out.print("When is your birthday?: ");
        in = sc.nextLine();

        //
        try {
            bday = date.parse(in);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        //
        birthday.setYear(today.getYear());

        //
        if (bday.before(today)){
            time = today.getTime() - birthday.getTime();
            time = time / (1000*60*60*24);
            System.out.printf("Your birthday was %.0f days ago", time);
        } else {
            time = birthday.getTime() = today.getTime();
            time = time / (1000*60*60*24);
            System.out.printf("Your birthday is in %.0f days", time); 
        }
    
    }
}