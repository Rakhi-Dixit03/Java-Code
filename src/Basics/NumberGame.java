package Basics;

import java.util.Scanner;
//Control Flow Practice

//NUMBER GUESSING GAME
public class NumberGame {

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100 + 1);

        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Guess a Number between 1-100 : ");
            int userGuess = sc.nextInt();

            if (userGuess < randomNumber) {
                System.out.println("Guess a Higher Number!");

            } else if (userGuess > randomNumber) {
                System.out.println("Guess a Lower Number!");
            } else {
                System.out.println("You WON!");
                break;
            }

        } while (true);

        System.out.println("Hey! You Guessed it Right!");
    }



}
