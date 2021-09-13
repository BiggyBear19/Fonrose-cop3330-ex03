package Exercise3;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Bernard Fonrose
 */

import java.util.Scanner;

public class Main {

    public static void  main(String[] args){

        Scanner Quote = new Scanner(System.in);

        System.out.print("Please enter a quote");

        String quote = Quote.nextLine();

        System.out.println("Who said the quote");

        String person = Quote.nextLine();

        System.out.printf("%s said, \"%s\"", person, quote);

    }
}
