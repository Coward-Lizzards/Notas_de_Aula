public class ContaCorrente extends ContaBancaria {
    private double chequeEspecial = 1000.00;

    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + chequeEspecial) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }
}
