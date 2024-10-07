public class Cachorro extends Animal{
    public Cachorro(String nome, String raca) {
        super.nome = getNome();
        super.raca = getRaca();
    }

    public void Latir(){
        System.out.println("Au! Au!");
    }
}