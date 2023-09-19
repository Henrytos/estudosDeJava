
public class Main {
    public static void main(String[] args) {
        Veiculo fiat = new Veiculo("Esportivo","Verde", "123af2",4);
        fiat.getCar();
        System.out.println("");
        fiat.switchMarcha(2);
        fiat.acelerar();
        fiat.getCar();
    }

}
