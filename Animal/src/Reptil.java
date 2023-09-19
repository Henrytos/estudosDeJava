public class Reptil extends Animal {
    private int idade;
    private String nome;

    public Reptil(int patas, String meio) {
        super(patas, meio);
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void showReptil() {
        System.out.println("nome:" + nome);
        System.out.println("idade:" + idade);
    }
}