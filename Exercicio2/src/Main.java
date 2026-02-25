import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner lanches = new Scanner(System.in);

        float lanches1 = lanches.nextFloat();
        float lanches2 = lanches.nextFloat();
        float lanches3 = lanches.nextFloat();

        float media = (lanches1 + lanches2 + lanches3)/3;

        System.out.println("Média de lanches: "+ media);

        lanches.close();
    }
}