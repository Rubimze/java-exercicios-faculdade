package pratica01;
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = input.nextDouble();
        double aumento = salarioAtual * 0.25;
        double novoSalario = salarioAtual + aumento;
        System.out.println("O novo salário do funcionário após o aumento de 25% é: " + novoSalario);
    }
}
