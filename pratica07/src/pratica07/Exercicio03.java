package pratica07;
import java.util.Scanner;
public class Exercicio03 {

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

        System.out.println("Matriz transposta:");
        for (i = 0; i < matriz[0].length; i++) {

            for (j = 0; j < matriz.length; j++)

                System.out.printf("%2d ", matriz[j][i]);

            System.out.println();

        }

    }

}