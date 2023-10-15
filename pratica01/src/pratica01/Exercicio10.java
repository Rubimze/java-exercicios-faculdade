package pratica01;
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o raio da esfera: ");
        double raio = input.nextDouble();
// Calcula o comprimento da esfera
        double comprimento = 2 * Math.PI * raio;
// Calcula a área da esfera
        double area = Math.PI * Math.pow(raio, 2);
// Calcula o volume da esfera
        double volume = (3.0 / 4.0) * Math.PI * Math.pow(raio, 3);
        System.out.println("Comprimento da esfera: " + comprimento);
        System.out.println("Área da esfera: " + area);
        System.out.println("Volume da esfera: " + volume);
    }
}
