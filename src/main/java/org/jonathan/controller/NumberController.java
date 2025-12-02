package org.jonathan.controller;

import org.jonathan.service.NumberService;
import org.jonathan.view.NumberView;

/**
 * <p>Classe Controladora, intermedia interações do usuário com o funcionamento do sistema</p>
 * @version 1.0.0
 * @author jonathan_uber
 * @since 2025-12-02
 */

public class NumberController {

    NumberView numberView = new NumberView();
    NumberService numberService = new NumberService();

    /**
     * Metodo responsável por rodar o sistema, ele integra as escolhas do usuário com o sistema inteiro.
     * Caso o usuário digitar 1 -> ele inicia a tentativa de adivinhação
     * Caso o usuário digitar 2 -> ele encerra o sistema
     * Se o usuário digitar um número diferente desses citados anteriormente, ele retorna um erro e o usuário deve digitar novamente.
     * @see NumberView Classe que recebe e devolve dados ao usuário
     * @see NumberService Classe que realiza a lógica do sistema
     */
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
