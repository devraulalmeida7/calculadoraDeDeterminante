package org.example;

import java.util.Arrays;
import java.util.Scanner;

import static org.example.EliminacaoDeGauss.determinante;


public class Main {
    public static void main(String[] args) {


        // rows and columns
        Scanner leitura = new Scanner(System.in);

        System.out.println("Type the number of rows:");
        int rows = leitura.nextInt();
        System.out.println("Type the number of columns:");
        int cols = leitura.nextInt();





        double[][] matriz = new double[rows][cols];

        int n = matriz.length;
        double det = 1.0;
        int trocas = 0;

        System.out.println("Please enter the matrix data: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matriz[i][j] = leitura.nextInt();
            }

        }


        double resultado =   determinante(matriz);


        for (double[] r : matriz) {
            for (double x : r) {
                System.out.println(x + " ");
            }
            System.out.println();
        }


        System.out.println(Arrays.deepToString(matriz));
        System.out.println(resultado);
    }




}