package org.example;

public class Soma {

    public void somar(){
        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K  += 1;
            SOMA += K;
        }

        System.out.println("Valor final da variável SOMA: " + SOMA);
    }
}
