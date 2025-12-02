package org.jonathan.controller;

import org.jonathan.service.NumberService;
import org.jonathan.view.NumberView;

public class NumberController {

    NumberView numberView = new NumberView();
    NumberService numberService = new NumberService();

    public void startSystem(){
        while(true){
            int userChoice = numberView.menu();
            switch (userChoice){
                case 1 -> numberService.guessTheNumber();
                case 2 -> {
                    System.out.println("\n|| === EXITING THE SYSTEM === ||");
                    return;
                }
                default -> System.out.println("\n|| ==== WRONG CHOICE ==== ||\n");
            }
        }
    }
}
