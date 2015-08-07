package org.sourceit.piduna.homework_3_2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Valeriu on 07.08.2015.
 */
public class Main {
    public static void main(String[] args) {

        //method scanner
        Scanner scanner = new Scanner(System.in);
        //method random for generate numbers
        Random r = new Random();
        //from "0" to "100"
        int x = r.nextInt(100)+1;
        //System.out.println for see than our method is work. now is comment
        //System.out.println(x);
        //initial our "y"
        int y;
        //cycle do while
        do {
            System.out.println("Enter your win number: ");
            //scanner for you entered number
            y = Integer.parseInt(scanner.nextLine());
            //our if
            if (y > x) System.out.println("It is too much");
            if (y < x) System.out.println("It is not much");
        }
        //end of cycle - that our entered y "!=" random x
        while ( y != x );
        //when our entered y = random x
        if (y == x) System.out.println("You win! Our win number is: " + x);

    }
}
