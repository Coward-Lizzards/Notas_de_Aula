import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Aluno a = new Aluno();

        int r;
        do {
            System.out.println("Nome:");
            a.setNome(sc.nextLine());

            System.out.println("Nota 1:");
            a.setNota1(sc2.nextDouble());

            System.out.println("Nota 2:");
            a.setNota2(sc2.nextDouble());

            System.out.println("Nota 3:");
            a.setNota3(sc2.nextDouble());

            System.out.println("Para Calcular a Media[1], \nPara verificar a Aprovação[2], \nPara exibir detalhes do Aluno[3]");
            int x = sc2.nextInt();
            switch (x) {
                case 1:
                    a.calcMedia();
                    System.out.printf("Media do Aluno: %.1f" , a.getMedia());
                    break;
                case 2:
                    a.verificarAprovacao();
                    System.out.println("Situação do Aluno:"+ a.verificarAprovacao());
                    break;
                case 3:
                    System.out.println("Nome:"+a.getNome());
                    System.out.printf("\nNota 1: %.1f", a.getNota1());
                    System.out.printf("\nNota 2: %.1f", a.getNota2());
                    System.out.printf("\nNota 3: %.1f", a.getNota3());
                    a.calcMedia();
                    System.out.printf("\nMedia: %.1f",a.getMedia());
                    a.verificarAprovacao();
                    System.out.println("\nSituação do Aluno:"+ a.verificarAprovacao());
                    break;
                default:
                    break;

            }


            System.out.printf("\nPara repetir[0]");
            r = sc2.nextInt();
        }while (r == 0) ;

    }
}