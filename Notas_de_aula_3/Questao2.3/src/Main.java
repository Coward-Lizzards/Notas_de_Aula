//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Luna", "Maine Coon");
        Cachorro cachorro = new Cachorro("Toto", "Caramelo");

        System.out.println("Gato: " + gato.nome);
        System.out.println("Cachorro: " + cachorro.nome);

        cachorro.Latir();
        gato.Miar();



    }
}