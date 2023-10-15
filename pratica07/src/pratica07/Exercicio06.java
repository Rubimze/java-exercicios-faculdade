package pratica07;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] matrizResultante = new int[2][2];

        System.out.println("Informe os números para a primeira matriz 2x2:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matriz1[i][j] = input.nextInt();

        System.out.println("Informe os números para a segunda matriz 2x2:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matriz2[i][j] = input.nextInt();

        // Multiplicando as matrizes
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    matrizResultante[i][j] += matriz1[i][k] * matriz2[k][j];

        System.out.println("Matriz resultante:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.printf("%d ", matrizResultante[i][j]);
            System.out.println();
        }
    }
}