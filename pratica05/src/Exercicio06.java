package pratica05;

import java.util.Scanner;
public class Exercicio06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int totalIdades = 0, idade;
        double media;

        for(int i = 0; i < 10; i++) {
            System.out.println("informe a idade da pessoa " + (i + 1) + ": ");
            idade = input.nextInt();
            totalIdades += idade;
        }
        media = (double) totalIdades / 10;
        System.out.println("a media das idades e: " + media);

        input.close();
    }

}