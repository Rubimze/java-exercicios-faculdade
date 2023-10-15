package pratica01;
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número para a tabuada de multiplicação: ");
        int numero = input.nextInt();
// Calcula e imprime a tabuada de multiplicação
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
