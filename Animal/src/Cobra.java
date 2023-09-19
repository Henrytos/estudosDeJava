public class Cobra extends  Animal{
    private String especie;
    private boolean isVeneno;
    public Cobra (int patas , String meio ){
        super(patas,meio);
    }
    public void  setEspecie(String especie){
        this.especie=especie;
    }
    public  void  setVeneno(boolean isVeneno){
        this.isVeneno=isVeneno;
    }
    public void showCobra(){
        System.out.println("Especie:"+especie);
        System.out.println("Possui veneno:"+isVeneno);
    }
}