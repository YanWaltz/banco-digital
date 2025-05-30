
public class Conta {

    public Conta(int numeroConta, double saldo) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    private double saldo;
    private final int numeroConta;


    public void sacar(double valor){
        if(this.saldo>= valor) {
            this.saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void mostrarSaldo(){
        System.out.println("Saldo atual: " + getSaldo());
        System.out.println("Conta: " + getNumeroConta());
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta(){
        return numeroConta;
    }


}