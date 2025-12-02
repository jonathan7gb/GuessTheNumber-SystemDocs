package org.jonathan.service;

import org.jonathan.view.NumberView;

import java.util.Random;

public class NumberService {

    NumberView nv = new NumberView();

    public void guessTheNumber(){
        int randomNumber = generateRandomNumber();
        int guessesCount = 0;
        while(true){
            int numberGuess = nv.readNumber();
            guessesCount++;

            if(numberGuess == randomNumber){
                nv.showSuccessGuess(guessesCount, randomNumber);
                return;
            }else if(numberGuess < randomNumber  ){
                System.out.println("\n|| === The random number is greater === ||\n");
            }else{
                System.out.println("\n|| === The random number is smaller === ||\n");
            }
        }
    }

    public int generateRandomNumber(){
        Random random = new Random();
        return random.nextInt(101);
    }
}
