import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Produto produto = cadastrarProduto();
        vender(produto, 2, "Espécie");
    }

    public static Produto cadastrarProduto() {
        Scanner scanner = new Scanner(System.in);
        Produto novoProduto = new Produto();

        System.out.println("Digite o nome do produto:");
        novoProduto.setNome(scanner.nextLine());

        System.out.println("Digite o código do produto:");
        novoProduto.setCodigo(scanner.nextInt());

        System.out.println("Digite o tamanho do produto:");
        novoProduto.setTamanho(scanner.nextDouble());

        System.out.println("Digite o peso do produto:");
        novoProduto.setPeso(scanner.nextDouble());

        System.out.println("Digite a cor do produto:");
        scanner.nextLine();
        novoProduto.setCor(scanner.nextLine());

        System.out.println("Digite o valor do produto:");
        novoProduto.setValor(scanner.nextDouble());

        System.out.println("Digite a quantidade em estoque:");
        novoProduto.setEstoque(scanner.nextInt());

        return novoProduto;
    }

    public static void vender(Produto produto, int quantidade, String metodoPagamento) {
        if (quantidade > produto.getEstoque()) {
            System.out.println("Estoque insuficiente!");
            return;
        }

        double valorTotal = produto.getValor() * quantidade;
        double desconto = calcularDesconto(metodoPagamento, valorTotal);
        double valorComDesconto = valorTotal - desconto;

        System.out.printf("Valor total com desconto: R$ %.2f\n", valorComDesconto);

        if (metodoPagamento.equalsIgnoreCase("Espécie")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o valor pago:");
            double valorPago = scanner.nextDouble();

            if (valorPago >= valorComDesconto) {
                double troco = valorPago - valorComDesconto;
                System.out.printf("Troco: R$ %.2f\n", troco);
            } else {
                System.out.println("Valor pago insuficiente!");
                return;
            }
        }

        produto.setEstoque(produto.getEstoque() - quantidade);
        System.out.println("Venda realizada com sucesso! Estoque atualizado.");
    }

    public static double calcularDesconto(String metodoPagamento, double valorTotal) {
        if (metodoPagamento.equalsIgnoreCase("Pix") ||
                metodoPagamento.equalsIgnoreCase("Espécie") ||
                metodoPagamento.equalsIgnoreCase("Transferência") ||
                metodoPagamento.equalsIgnoreCase("Débito")) {
            return valorTotal * 0.05;
        }
        return 0.0;
    }
}
