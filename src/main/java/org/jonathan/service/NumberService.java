package org.jonathan.service;

import org.jonathan.view.NumberView;
import java.util.Random;
/**
 * <p>Classe que realiza toda lógica de funcionamento do sistema, realiza as validações e ações do sistema</p>
 * @version 1.0.0
 * @author jonathan_uber
 * @since 2025-12-02
 */
public class NumberService {

    NumberView numberView = new NumberView();

    /**
     * Metodo principal do sistema, é aqui onde o sistema integra todas as camadas e realiza a lógica do sistema.
     * O Sistema gera um número aleatório, lê a tentativa do usuário e verifica, se for igual ao número aleatório, retorna sucesso.
     * Se a tentiva for maior que o número aleatório, retorna uma mensagem dizendo que o número aleatório é maior.
     * Se a tentiva for menor que o número aleatório, retorna uma mensagem dizendo que o número aleatório é menor
     * @see NumberService Classe que recebe e devolve dados ao usuário
     */
    public void guessTheNumber(){
        int randomNumber = generateRandomNumber();
        int guessesCount = 0;
        while(true){
            int numberGuess = numberView.readNumber();
            guessesCount++;

            if(numberGuess == randomNumber){
                numberView.showSuccessGuess(guessesCount, randomNumber);
                return;
            }else if(numberGuess < randomNumber  ){
                System.out.println("\n|| === The random number is greater === ||\n");
            }else{
                System.out.println("\n|| === The random number is smaller === ||\n");
            }
        }
    }

    /**
     * Metodo responsável por gerar um número aleatório, no qual será utilizado para tentar adivinhar
     * @return Número aleatório gerado pelo metodo random.nextInt(101) (entre 0 e 100)
     */
    public int generateRandomNumber(){
        Random random = new Random();
        return random.nextInt(101);
    }
}
