public class Main {
    public static void main(String[] args) {
        // Criando instância de Gerente
        Gerente gerente = new Gerente("Alice", 7500.0, "01/01/1980");
        gerente.informarProjeto("Desenvolvimento de Sistema Financeiro");

        // Criando instância de Programador
        Programador programador = new Programador("Carlos", 5000.0, "15/06/1990");
        programador.informarLinguagem("Java");

        // Exibindo informações do Gerente
        System.out.println("\nDados do Gerente:");
        System.out.println("Nome: " + gerente.nome);
        System.out.println("Salário: R$ " + gerente.salario);
        System.out.println("Data de Nascimento: " + gerente.nascimento);
        System.out.println("Projeto Atual: " + gerente.projeto);

        // Exibindo informações do Programador
        System.out.println("\nDados do Programador:");
        System.out.println("Nome: " + programador.nome);
        System.out.println("Salário: R$ " + programador.salario);
        System.out.println("Data de Nascimento: " + programador.nascimento);
        System.out.println("Linguagem Principal: " + programador.linguagem);
    }
}
