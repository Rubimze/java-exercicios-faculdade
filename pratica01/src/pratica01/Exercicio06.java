package pratica01;
import java.util.Scanner;
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = input.nextDouble();
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32.0;
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
        input.close();
    }
}
