public class Main{
    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente(123, 0);
        Conta conta2 = new ContaPoupanca(456, 50);

        conta1.mostrarSaldo();
        conta2.mostrarSaldo();




    }
}
