package org.example;

import java.util.Scanner;

public class InverteString {

    public void inverter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        String input = scanner.nextLine();
        scanner.close();

        String invertida = inverterString(input);
        System.out.println("String invertida: " + invertida);

    }

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        String invertida = "";

        for (int i = caracteres.length - 1; i >= 0; i--) {
            invertida += caracteres[i];
        }

        return invertida;
    }
}
