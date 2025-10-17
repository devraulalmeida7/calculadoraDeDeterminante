package org.example;

public class EliminacaoDeGauss {

    // Método para calcular o determinante usando eliminação de Gauss
    public static double determinante(double[][] matriz) {
        int n = matriz.length;
        double det = 1.0;
        int trocas = 0; // Conta quantas vezes trocamos linhas

        // Percorre cada coluna como pivô
        for (int i = 0; i < n; i++) {

            // Se o pivô for 0, troca a linha com uma abaixo
            if (matriz[i][i] == 0) {
                boolean trocou = false;
                for (int k = i + 1; k < n; k++) {
                    if (matriz[k][i] != 0) {
                        trocarLinhas(matriz, i, k);
                        trocas++;
                        trocou = true;
                        break;
                    }
                }
                if (!trocou) {
                    // Coluna inteira é zero → determinante é 0
                    return 0;
                }
            }

            // Eliminação: zera elementos abaixo do pivô
            for (int k = i + 1; k < n; k++) {
                double fator = matriz[k][i] / matriz[i][i];
                for (int j = i; j < n; j++) {
                    matriz[k][j] -= fator * matriz[i][j];
                }
            }
        }

        // O determinante é o produto da diagonal principal
        for (int i = 0; i < n; i++) {
            det *= matriz[i][i];
        }

        // Se houve trocas de linha, o sinal muda
        if (trocas % 2 != 0) {
            det *= -1;
        }

        return det;
    }

    // Método auxiliar para trocar duas linhas da matriz
    private static void trocarLinhas(double[][] matriz, int linha1, int linha2) {
        double[] temp = matriz[linha1];
        matriz[linha1] = matriz[linha2];
        matriz[linha2] = temp;
    }

}
