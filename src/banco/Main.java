package banco;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String titular;
        int numeroConta;
        double saldo;
        //Criação de 2 objetos, um com os atributos definidos e o outro vazio
        ContaCorrente conta1 = new ContaCorrente("Yan", 12345, 220.90);
        ContaPoupanca conta2 = new ContaPoupanca();

        System.out.println("Digite o titular da conta: ");
        titular = scanner.nextLine();
        conta2.setTitular(titular);

        System.out.println("Digite o número da conta: ");
        numeroConta = scanner.nextInt();
        conta2.setNumeroConta(numeroConta);
        System.out.println("Digite o saldo da conta: ");
        saldo = scanner.nextDouble();
        conta2.setSaldo(saldo);

        conta1.exibirTodasInformacoes();
        conta2.exibirTodasInformacoes();

        conta1.transferir(100, conta2);
        conta2.mostrarSaldo();

    }
}
