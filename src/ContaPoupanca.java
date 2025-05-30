public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numeroConta, double saldo) {
        super(numeroConta, saldo);
    }

  @Override
    public void mostrarSaldo(){
        super.mostrarSaldo();
      System.out.println("Conta Poupança");
    }
}
