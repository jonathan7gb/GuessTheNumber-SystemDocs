package org.jonathan.view;

import java.util.Scanner;
/**
 * <p>Classe responsável por ler informações do usuário e retornar esses dados ao usuário</p>
 * @version 1.0.0
 * @author jonathan_uber
 * @since 2025-12-02
 */
public class NumberView {

    Scanner sc = new Scanner(System.in);

    /**
     * Metodo responsável por retornar a mensagem de sucesso ao usuário acertar o número aleatório
     * @param guessCount Total de tentativas de adivinhação do usuário
     * @param randomNumber Número aleatório que o usuário teve como desafio adivinhar
     */
    public void showSuccessGuess(int guessCount, int randomNumber){
        System.out.println("\n|| Congratulations, you guessed the random number ("+ randomNumber +"). Number of guesses: " + guessCount + " ||\n");
    }

    /**
     * Metodo responsável por mostrar o menu e retornar a escolha do usuário para seguir no fluxo do sistema
     * @return Retorna a escolha do usuário, seja ela 1 ou 2, ou números inválidos.
     */
    public int menu(){
        System.out.print("""
                || ==== GUESS THE NUMBER ==== ||
                || 1 - START GAME
                || 2 - EXIT THE SYSTEM
                || ========================== ||
                || YOUR CHOICE: """);
        return sc.nextInt();
    }

    /**
     * Metodo responsável por ler a tentativa do usuário, e retornar o número digitado para outra camada
     * @return Tentativa de adivinhação do número aleatório
     * @exception NumberFormatException Excessão responsável por captar caso o usuário digite algum caracter diferente de um inteiro, e retorna erro personalizado
     */
    public int readNumber(){
        int numberRead = -1;

        while(true){
            System.out.print("|| Guess the number (0-100): ");
            String number = sc.nextLine();
            try{
                numberRead = Integer.parseInt(number);
                break;
            }catch (NumberFormatException e ){
                System.out.println("\n|| === WRITE A INTEGER NUMBER === ||\n");
                continue;
            }
        }

        return numberRead;
    }
}
