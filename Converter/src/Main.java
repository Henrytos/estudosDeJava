import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Henry e Gabrielly 2-DS");
        System.out.print("Digite um numero:");
        int number = scanner.nextInt();

        decimalToBinary(number);
        decimalToOctal(number);
        decimalToHexadecimal(number);
        decimalTobiDecimal(number);
    }
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static void decimalToBinary(int number){
        int num = number;
        String binario ="";

        while (num>0){
            binario+=num%2;
            num=num/2;
        }

        binario=reverse(binario);
        System.out.println("Binario: "+binario);
    }
    public static void decimalToOctal(int number){
        int num = number;
        String octal ="";

        while (num>0){
            octal += num%8;
            num=num/8;
        }

        octal=reverse(octal);
        System.out.println("Octal: "+octal);
    }
    public static void decimalToHexadecimal(int number){
        int num = number;
        String hexadecimal ="";

        while (num>0){
            hexadecimal += numbersToLetters(""+num%16);
            num=num/16;
        }

        hexadecimal=reverse(hexadecimal);
        System.out.println("Hexadecimal: "+hexadecimal);
    }

    public static void decimalTobiDecimal(int number){
        int num = number;
        String biDecimal ="";

        while (num>0){
            biDecimal += numbersToLetters(""+num%20);
            num=num/20;
        }

        biDecimal=reverse(biDecimal);
        System.out.println("BiDecimal: "+biDecimal);
    }


    public static String numbersToLetters(String number){
        return switch (number) {
            case "10" -> "a";
            case "11" -> "b";
            case "12" -> "c";
            case "13" -> "d";
            case "14" -> "f";
            case "15 " -> "g";
            case "16 " -> "h";
            case "17" -> "i";
            case "18" -> "j";
            case "19" -> "k";
            case "20" -> "l";
            default -> number;
        };
    }
}