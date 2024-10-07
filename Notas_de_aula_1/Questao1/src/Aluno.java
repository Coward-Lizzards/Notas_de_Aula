public class Aluno {
    private double nota1, nota2, nota3, media;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void calcMedia() {
        media = (nota1 + nota2 + nota3) / 3;
    }

    public String verificarAprovacao() {
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media >= 5.0 && media < 7.0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public void detalhesDoAluno() {
        System.out.println("Nome: " + nome);
        System.out.printf("Nota 1: %.2f\n", nota1);
        System.out.printf("Nota 2: %.2f\n", nota2);
        System.out.printf("Nota 3: %.2f\n", nota3);
        System.out.printf("Média: %.2f\n", media);
        System.out.println("Status: " + verificarAprovacao());
    }
}
