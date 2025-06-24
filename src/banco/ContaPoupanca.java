package banco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular, int numeroConta, double saldo) {
        super(titular, numeroConta, saldo);
        System.out.println("Conta poupança com dados inseridos criada com sucesso");
    }

    //Construtor Vazio
    public ContaPoupanca(){
        System.out.println("Conta poupança criada com sucesso");
    }

    @Override
    public void mostrarSaldo(){
        System.out.printf("Saldo da conta poupança: %.2f \n", getSaldo());
    }

    /* Não há necessidade de sobreescrever os outros métodos da classe mãe,
    já que não irei implementar nada e eles já foram herdados */
}
