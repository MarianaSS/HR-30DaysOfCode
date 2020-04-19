import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int number = 0;
        double dbNumber = 0.0;
        String str = "oi";

        
        /* Read and save an integer, double, and String to your variables.*/
            number = scan.nextInt();
            dbNumber = scan.nextDouble();
            scan.nextLine();
            str = scan.nextLine();
        
        /* Print the sum of both integer variables on a new line. */
        /* Print the sum of the double variables on a new line. */
        /* Concatenate and print the String variables on a new line; 
            the 's' variable above should be printed first. */
        System.out.println(number + i);
        System.out.println(dbNumber + d);
        System.out.println(s + str);
        
        scan.close();
    }
}