import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome:Gabielly");
        System.out.print("Decimal:");
        int n= scanner.nextInt();
        int[] bi = new int[1000];
        int i =0;

        for (;n > 0|| n>1;i++) {
            bi[i]= n%2;
            n = (int) Math.floor(n / 2);
        }
        System.out.print("Binario:");
        for (int j=i-1;j>=0;j-- ){
            System.out.print(bi[j]);
        }
    }
}
