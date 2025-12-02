package org.jonathan.view;

import java.util.Scanner;

public class NumberView {

    Scanner sc = new Scanner(System.in);

    public void showSuccessGuess(int guessCount, int randomNumber){
        System.out.println("\n|| Congratulations, you guessed the random number ("+ randomNumber +"). Number of guesses: " + guessCount + " ||\n");
    }

    public int menu(){
        System.out.print("""
                || ==== GUESS THE NUMBER ==== ||
                || 1 - START GAME
                || 2 - EXIT THE SYSTEM
                || ========================== ||
                || YOUR CHOICE: """);
        return sc.nextInt();
    }

    public int readNumber(){
        int numberRead = -1;

        while(true){
            System.out.print("|| Guess the number: ");
            String number = sc.nextLine();
            try{
                numberRead = Integer.parseInt(number);
                break;
            }catch (Exception e ){
                System.out.println("\n|| === WRITE A INTEGER NUMBER === ||\n");
                continue;
            }
        }

        return numberRead;
    }
}
