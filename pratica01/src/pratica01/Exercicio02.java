package pratica01;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int primeiroano, segundoano, terceiroano, idadeatual;

        System.out.print("Informe o ano de nascimento: ");
        primeiroano = input.nextInt();

        System.out.print("Informe o ano atual: ");
        segundoano = input.nextInt();

        idadeatual = segundoano - primeiroano;
        //Idade atual do usuário

        terceiroano = 2050;

        terceiroano = terceiroano - primeiroano;

        System.out.println("Sua idade atual é: "+ idadeatual);

        System.out.println("Sua idade em 2050: "+ terceiroano);
    }
}
