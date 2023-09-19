public class Mamifero extends Animal {
    private   boolean domestico;
    private String especie;
    public Mamifero (int patas , String meio ){
        super(patas,meio);
    }

    public void setEspecie(String especie){
        this.especie=especie;
    }
    public void setDomestico(boolean isDomestico){
        this.domestico=isDomestico;
    }
    public void showMamifero(){
        System.out.println("domestico:"+domestico);
        System.out.println("especie:"+especie);
    }

}