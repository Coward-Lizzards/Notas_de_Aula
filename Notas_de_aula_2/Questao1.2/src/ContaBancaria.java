public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}
