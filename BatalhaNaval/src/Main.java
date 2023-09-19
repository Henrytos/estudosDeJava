import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
//    Metodos Globais
    static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static String player1="";
    public static String player2="";
    public static int navioL ;
    public static int navioC ;


    static String[][] tabuleiro = new String[5][5];
    public static void CrateTabu(){
        navioL= random.nextInt(4);
        navioC= random.nextInt(4);

        for (int lin =0 ; lin<5;lin++) {
            for (int col = 0; col < 5; col++) {
                tabuleiro[lin][col] = " . ";
            }
        }
    }
    public static  void ShowTabu(){
        System.out.println("  0  1  2  3  4 ");
        for (int lin =0 ; lin<5;lin++) {
            System.out.print( lin );
        for (int col = 0; col < 5; col++){
            if (col==4) System.out.println(tabuleiro[lin][col]);
            else System.out.print(tabuleiro[lin][col]);
        }
        }
    }

    public static void PlayGaming(){

        player1 = setNamePlayer();
        player2 = setNamePlayer();

        int turn =0;
        boolean playContinue=true;
        int lin ;
        int col ;
        while (playContinue){
            switch(turn){
                case 0 :

                    System.out.println("-----------------Vez do Player:"+player1+"-----------------");
                    lin =setLin();
                    col = setCol();

                    playContinue = VerificationShip(lin,col);
                    turn=1;
                break;

                case 1 :
                    System.out.println("-----------------Vez do Player:"+player2+"-----------------");

                    lin = setLin();
                    col = setCol();

                    playContinue = VerificationShip(lin,col);
                    turn=0;
                    break;
            }
        }
    }
    public static boolean VerificationShip(int lin , int col){
        if(lin==navioL && col==navioC) {
            System.out.println("Acertou!!!");
            tabuleiro[lin][col]=" X ";
            ShowTabu();
           return false;
        }
        else {
            System.out.println("Errou ");
            tabuleiro[lin][col]=" 0 ";
            ShowTabu();
            return true;
        }

    }
    public static int setLin(){
        System.out.println(" Digite posição da Linha :");
        return Integer.parseInt(scanner.nextLine());
    }
    public static int setCol(){
        System.out.println(" Digite posição da Coluna :");
        return Integer.parseInt(scanner.nextLine());
    }
    public static String setNamePlayer(){
        System.out.println("Digite nome do jogador :");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        CrateTabu();
        ShowTabu();
        PlayGaming();
    }
}