public class ContaCorrente extends Conta {

    public ContaCorrente(int numeroConta, double saldo) {
        super(numeroConta, saldo);
    }

    @Override
    public void mostrarSaldo() {
        super.mostrarSaldo();
        System.out.println("Conta corrente");
    }
}
