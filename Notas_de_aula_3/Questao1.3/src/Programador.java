public class Programador extends Funcionario{
    public String linguagem;

    public Programador(String nome, double salario, String nascimento) {
        super(nome, salario, nascimento);
    }

    public void informarLinguagem(String linguagem){
        this.linguagem = linguagem;
        System.out.println("Linguagem: " + linguagem);
    }
}
