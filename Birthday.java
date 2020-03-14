package Prog1Lab3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Birthday{

    public static void main(String[] args){

        //
        DateFormat date = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);
        Date bday = new Date();
        Date today = new Date();
        double time;
        String in;
        
        //
        System.out.println("--------BIRTHDAY FORMAT--------");
        System.out.println("This program asks you for your birthday and prints it out in the 'YYYY-MM-DD' format");
        System.out.print("When is your birthday?: ");
        in = sc.nextLine();

        //
        try {
            bday = date.parse(in);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        //
        bday.setYear(today.getYear());

        //
        if (bday.before(today)){
            time = today.getTime() - bday.getTime();
            time = time / (1000 * 60 * 60 * 24);
            System.out.printf("Aww, sorry but your birthday was %.0f days ago", time);
        } else {
            time = bday.getTime() - today.getTime();
            time = time / (1000 * 60 * 60 * 24);
            System.out.printf("In %.0f days, you will experience your birthday!", time); 
        }
    
    }
}