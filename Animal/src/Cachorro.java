public class Cachorro extends Mamifero{
    private String rasa ;
    private  String nome;

    public Cachorro (int patas , String meio  ){
        super(patas,meio);
    }

    public void  setRasa(String rasa){
        this.rasa=rasa;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public void showCachoro(){
        System.out.println("raça:"+rasa);
        System.out.println("nome:"+nome);
    }

}