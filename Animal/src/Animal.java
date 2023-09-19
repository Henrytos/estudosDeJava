public class Animal {
    private int patas ;
    private String meio;

    public Animal (int patas , String meio ){
        this.patas= patas;
        this.meio=meio;
    }
    public void setPatas(int patas){
        this.patas=patas;
    }
    public void  setMeio(String meio){
        this.meio=meio;
    }
    public void showAnimal(){
        System.out.println("Patas:"+patas);
        System.out.println("Meio:"+meio);
    }

}