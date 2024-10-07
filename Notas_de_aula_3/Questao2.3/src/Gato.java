public class Gato extends Animal{
    public Gato(String nome, String raca){
        super.nome = getNome();
        super.raca = getRaca();
    }

    public void Miar(){
        System.out.println("Miau!");
    }
}