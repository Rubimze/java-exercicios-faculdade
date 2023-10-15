package pratica05;

import java.util.Scanner;
public class Exercicio09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("digite um numero: ");
        numero = input.nextInt();
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        input.close();
    }

}