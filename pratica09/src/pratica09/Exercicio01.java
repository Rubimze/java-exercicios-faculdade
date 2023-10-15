package pratica09;

import java.util.Scanner;

public class Exercicio01 {
    private int numero, agencia;
    private double saldo;

    public void iniciarContaCorrente(int n, int ag) {
        numero = n;
        agencia = ag;
        saldo = 0;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double consultarSaldo() {
        return saldo;
    }

    /**
     * Retorna os dados da conta.
     *
     * Exemplo:
     * Agência: 15
     * Conta: 101
     * Saldo: R$ 3257,48.
     */
    public void exibe() {
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numero);
        System.out.printf("Saldo: R$ %.2f.\n", saldo);
    }
}

