package banco;

public abstract class Conta {

   //Atributos privados
    private String titular;
    private int numeroConta;
    private double saldo;

    //Getters
    public String getTitular() {
        return titular;
    }
    public int getNumeroConta(){
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }

    //Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setNumeroConta(int numeroConta) {
            this.numeroConta = numeroConta;
    }
    public void setSaldo(double saldo){
        if(saldo>=0){
            this.saldo = saldo;
        }else{
            System.out.println("Saldo inválido");
        }
    }

    //Construtores e sobrecarga
    public Conta(String titular, int numeroConta, double saldo) {
        setTitular(titular);
        setNumeroConta(numeroConta);
        setSaldo(saldo);
    }

    public Conta(){
    }

    //Metódos
    public void sacar(double valor){
        if(valor > 0 && getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso");
        }
        else{
            System.out.println("Valor inválido para saque");
        }
    }

    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
        System.out.println("Depósito realizado com sucesso");
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("Transferência completa");
    }

    public void mostrarSaldo() {
        System.out.printf("Saldo atual: %.2f \n", getSaldo());
    }

    public void exibirTodasInformacoes(){
        System.out.println("Nome do titular: " + getTitular());
        System.out.println("Número da conta: " + getNumeroConta());
        System.out.println("Saldo atual: " + getSaldo());
        System.out.println("");
    }

}