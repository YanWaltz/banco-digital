package banco;

public class ContaCorrente extends Conta {

    public ContaCorrente(String titular, int numeroConta, double saldo) {
        super(titular, numeroConta, saldo);
        System.out.println("Conta corrente com dados inseridos criada com sucesso");
    }

    //Construtor Vazio
    public ContaCorrente(){
        System.out.println("Conta corrente criada com sucesso");
    }

    @Override
    public void mostrarSaldo() {
        System.out.printf("Saldo da conta corrente: %.2f \n", getSaldo());
    }

      /*Não há necessidade de sobreescrever os outros métodos da classe mãe,
      já que não precisa implementar nada e eles já foram herdados*/
}
