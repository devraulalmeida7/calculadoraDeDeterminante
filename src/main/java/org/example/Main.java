package org.example;

import java.util.Arrays;
import java.util.Scanner;


import static org.example.EliminacaoDeGauss.determinante;


public class Main {
    public static void main(String[] args) {

        // define rows and colums
        // definir linhas e colunas
        Scanner leitura = new Scanner(System.in);

        System.out.println("Type the number of rows:");
        int rows = leitura.nextInt();
        System.out.println("Type the number of columns:");
        int cols = leitura.nextInt();

        // matrix
        double[][] matriz = new double[rows][cols];


        // inserir entrada para as matrizes
        // insert matrix data
        System.out.println("Please enter the matrix data: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matriz[i][j] = leitura.nextInt();
            }

        }

        System.out.println("A matriz inserida é:" +Arrays.deepToString(matriz));

        double resultado =   determinante(matriz);


//        for (double[] r : matriz) {
//            for (double x : r) {
//                System.out.println(x + " ");
//            }
//            System.out.println();
//        }



        System.out.println("A determinante da matriz é: "+ Math.round(resultado));
    }




}