package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        //Declare variables
        Scanner input = new Scanner(System.in);
        ArrayList<String>movies= new ArrayList<>();
        String movie;
        String answer;
        String otherAnswer;

        //Ask input from User



        do{
            System.out.println("\nWhat is your favortie movie? ");
            answer = input.nextLine();

            movies.add(answer);
            System.out.println("\nDo you have another favorite movie? if not, press Q!");
            otherAnswer = input.nextLine();
        }while(!otherAnswer.equalsIgnoreCase("Q"));

        //using extended loop to list movies entered
        System.out.println("\nHere is what you entered:");
        for(String m:movies){
            System.out.println(m);
        }

        //Sorting alphabetically
        System.out.println("\nLet's take a look at this list alphabetically:");
        Collections.sort(movies);
        for(String m:movies){
            System.out.println(m);
        }

        //Movie suggestion
        System.out.println("\nTonight you should watch:");
        Collections.shuffle(movies);
        System.out.print(movies.get(2));

    }
}
