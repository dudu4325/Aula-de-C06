import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner numero = new Scanner(System.in);
        Random rand = new Random();

        int ale = rand.nextInt(10) + 1;
        System.out.print("Qual número você acha? ");
        int esco = numero.nextInt();

        while (ale != esco){
            System.out.print("Errouuu! Tente outro número você acha? ");
            esco = numero.nextInt();
        }

        System.out.println("Você acertou!!");
    }
}