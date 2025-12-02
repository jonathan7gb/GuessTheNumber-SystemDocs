package org.jonathan;

import org.jonathan.controller.NumberController;

/**
 * <p>Classe Principal do Sistema, onde a aplicação é inicializada</p>
 * @version 1.0.0
 * @author jonathan_uber
 * @since 2025-12-02
 */
public class Main {
    public static void main(String[] args) {

        NumberController nc = new NumberController();
        nc.startSystem();
    }
}