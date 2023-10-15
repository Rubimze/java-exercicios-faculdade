package pratica05;

import java.util.Scanner;
public class Exercicio08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int base, exponente, resultado = 1;

        System.out.println("digite o primeiro numero: ");
        base = input.nextInt();
        System.out.println("digite o segundo numero: ");
        exponente = input.nextInt();

        for(int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        System.out.println("o resultado e: " + resultado);

        input.close();
    }

}