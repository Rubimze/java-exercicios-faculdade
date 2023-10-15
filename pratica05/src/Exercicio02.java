package pratica05;

import java.util.Scanner;
public class Exercicio02 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("digite um numero: ");
        numero1 = input.nextInt();
        System.out.println("digite um segundo numero: ");
        numero2 = input.nextInt();

        for (int i = numero1; i <= numero2; i++)
            System.out.println(i);

        input.close();

    }

}