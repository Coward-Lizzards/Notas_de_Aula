public class ContaPoupanca extends ContaBancaria {
    private double selic;

    public ContaPoupanca(String titular) {
        super(titular);
    }

    public void calcularRendimento() {
        double rendimento;
        if (selic > 8.5) {
            rendimento = 0.005 * saldo;
        } else {
            rendimento = 0.007 * selic * saldo;
        }
        saldo += rendimento;
        System.out.printf("Rendimento calculado: R$ %.2f%n", rendimento);
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }
}
