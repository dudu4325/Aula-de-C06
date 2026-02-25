import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);
        Random rand = new Random();

        int ale = rand.nextInt(10) + 1;
        int esco;

        do {
            esco = numero.nextInt();

            if(esco > ale){
                System.out.println("O número escolhido é menor que esse.");
            } else if (esco < ale) {
                System.out.println("O número escolhido é maior que esse");
            }else {
                System.out.println("Você acertou!");
                break;
            }
        }while (ale != esco);
    }
}