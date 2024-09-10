package org.example;


import org.json.JSONArray;
import org.json.JSONObject;

public class FaturamentoDistribuidora {
    public void faturar(){
        String json = "[\n" +
                "\t{\"dia\": 1, \"valor\": 22174.1664},\n" +
                "\t{\"dia\": 2, \"valor\": 24537.6698},\n" +
                "\t{\"dia\": 3, \"valor\": 26139.6134},\n" +
                "\t{\"dia\": 4, \"valor\": 0.0},\n" +
                "\t{\"dia\": 5, \"valor\": 0.0},\n" +
                "\t{\"dia\": 6, \"valor\": 26742.6612},\n" +
                "\t{\"dia\": 7, \"valor\": 0.0},\n" +
                "\t{\"dia\": 8, \"valor\": 42889.2258},\n" +
                "\t{\"dia\": 9, \"valor\": 46251.174},\n" +
                "\t{\"dia\": 10, \"valor\": 11191.4722},\n" +
                "\t{\"dia\": 11, \"valor\": 0.0},\n" +
                "\t{\"dia\": 12, \"valor\": 0.0},\n" +
                "\t{\"dia\": 13, \"valor\": 3847.4823},\n" +
                "\t{\"dia\": 14, \"valor\": 373.7838},\n" +
                "\t{\"dia\": 15, \"valor\": 2659.7563},\n" +
                "\t{\"dia\": 16, \"valor\": 48924.2448},\n" +
                "\t{\"dia\": 17, \"valor\": 18419.2614},\n" +
                "\t{\"dia\": 18, \"valor\": 0.0},\n" +
                "\t{\"dia\": 19, \"valor\": 0.0},\n" +
                "\t{\"dia\": 20, \"valor\": 35240.1826},\n" +
                "\t{\"dia\": 21, \"valor\": 43829.1667},\n" +
                "\t{\"dia\": 22, \"valor\": 18235.6852},\n" +
                "\t{\"dia\": 23, \"valor\": 4355.0662},\n" +
                "\t{\"dia\": 24, \"valor\": 13327.1025},\n" +
                "\t{\"dia\": 25, \"valor\": 0.0},\n" +
                "\t{\"dia\": 26, \"valor\": 0.0},\n" +
                "\t{\"dia\": 27, \"valor\": 25681.8318},\n" +
                "\t{\"dia\": 28, \"valor\": 1718.1221},\n" +
                "\t{\"dia\": 29, \"valor\": 13220.495},\n" +
                "\t{\"dia\": 30, \"valor\": 8414.61}\n" +
                "]";

        JSONArray faturamentoArray = new JSONArray(json);
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;

        // Calcula menor, maior faturamento e soma para a média
        for (int i = 0; i < faturamentoArray.length(); i++) {
            JSONObject dia = faturamentoArray.getJSONObject(i);
            double valor = dia.getDouble("valor");

            // Ignora dias com faturamento zero
            if (valor > 0) {
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }

                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }

                somaFaturamento += valor;
                diasComFaturamento++;
            }
        }

        // Calcula a média mensal
        double mediaFaturamento = somaFaturamento / diasComFaturamento;
        int diasAcimaMedia = 0;

        // Conta os dias com faturamento acima da média
        for (int i = 0; i < faturamentoArray.length(); i++) {
            JSONObject dia = faturamentoArray.getJSONObject(i);
            double valor = dia.getDouble("valor");

            if (valor > mediaFaturamento) {
                diasAcimaMedia++;
            }
        }

        // Resultados
        System.out.println("Menor faturamento: " + menorFaturamento);
        System.out.println("Maior faturamento: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaMedia);
    }
    }


