import java.util.Scanner;

public class Main {



    public static String viewOption(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("---------Opções:---------");
        System.out.println("1-Acelerar");
        System.out.println("2-Frear");
        System.out.println("3-Trocar de Marcha");
        System.out.println("4-Buzinar");
        System.out.println("5-Encerrar");
        System.out.println();
        System.out.println("Escolha uma opção:");

        String targetOption= scanner.nextLine();
        return targetOption;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String options = "0";
        System.out.println("Tipo do veiculo/carro");
        String tipo =  scanner.nextLine();
        System.out.println("Cor do "+tipo);
        String cor = scanner.nextLine();
        System.out.println("Placa do "+tipo+" :");
        String placa =  scanner.nextLine();
        System.out.println("qual seria a quantidade de portas");
        int portas= scanner.nextInt();

        Veiculo carro = new Veiculo(tipo, cor , placa,portas);
        boolean play =true;
        while (play){
            options= viewOption();
            switch (options) {
                case "1":
                    carro.acelerar();
                    System.out.println("Aceleramos o Carro ");
                    carro.viewCar();
                    break;
                case "2":
                    carro.frear();
                    System.out.println("Freamos o carro");
                    carro.viewCar();
                    break;
                case "3":
                    System.out.println("qual seria a marcha");
                    carro.switchMarcha(scanner.nextInt());
                    System.out.println("Trocamos a marcha");
                    carro.viewCar();
                    break;
                case "4":
                    carro.buzinar();
                    break;
                case "5":
                    System.out.println("Encerrando aplicação");
                    play=false;
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }



    }


}