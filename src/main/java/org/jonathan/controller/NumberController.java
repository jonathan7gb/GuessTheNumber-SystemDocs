package org.jonathan.controller;

import org.jonathan.view.NumberView;

public class NumberController {

    NumberView numberView = new NumberView();

    public void startSystem(){
        while(true){
            int userChoice = numberView.menu();
            switch (userChoice){
                case 1 -> System.out.println();
                case 2 -> {
                    System.out.println("\n|| === EXITING THE SYSTEM === ||");
                    return;
                }
                default -> System.out.println("\n|| ==== WRONG CHOICE ==== ||\n");


            }
        }
    }
}
