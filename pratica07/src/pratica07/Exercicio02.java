package pratica07;
import java.util.Scanner;
public class Exercicio02 {

    public static void main(String[] args) {

        int i, j;
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        for (i = 0; i < matriz.length; i++)

            for (j = 0; j < matriz[i].length; j++) {

                System.out.println("Informe um número: ");
                matriz[i][j] = input.nextInt();

            }

        System.out.println("Matriz informada:");
        for (i = 0; i < matriz.length; i++) {

            for (j = 0; j < matriz[i].length; j++)

                System.out.printf("%2d ", matriz[i][j]);

            System.out.println();

        }

        System.out.println("Elementos nas posições de linha par e coluna ímpar:");
        for (i = 0; i < matriz.length; i++) {

            if(i % 2 == 0) { // índice da linha é par
                for (j = 0; j < matriz[i].length; j++) {
                    if(j % 2 != 0) { // índice da coluna é ímpar
                        System.out.printf("%2d ", matriz[i][j]);
                    }
                }
                System.out.println();
            }

        }

    }

}