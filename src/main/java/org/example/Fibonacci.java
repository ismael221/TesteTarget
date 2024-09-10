package org.example;

import java.util.Scanner;

public class Fibonacci {

    public void calculafibonacci(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }
    }
    public static boolean isFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true;
        }

        int a = 0, b = 1, soma = 0;

        while (soma < num) {
            soma = a + b;
            a = b;
            b = soma;
        }

        return soma == num;
    }
}
