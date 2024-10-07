public class Gerente extends Funcionario{
    public String projeto;

    public Gerente(String nome, double salario, String nascimento) {
        super(nome, salario, nascimento);
    }

    public void informarProjeto(String projeto) {
        this.projeto = projeto;
        System.out.println(projeto);
    }

}
