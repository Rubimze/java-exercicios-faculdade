package pratica01;
import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o peso atual da pessoa: ");
        double pesoAtual = input.nextDouble();
        double pesoEngordar = pesoAtual * 1.15;
        double pesoEmagrecer = pesoAtual * 0.80;
        System.out.println("Se a pessoa engordar 15%, o novo peso será: " + pesoEngordar);
        System.out.println("Se a pessoa emagrecer 20%, o novo peso será: " + pesoEmagrecer);
    }
}
