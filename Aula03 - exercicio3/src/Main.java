import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner notas = new Scanner(System.in);

        float NPA = notas.nextFloat();

        if(NPA >= 60){
            System.out.println("Você passou!");
        }
        else {
            float NP3 = notas.nextFloat();

            float medF = (NPA + NP3)/2;

            if(medF >= 50)
            {
                System.out.println("Você passou por pouco");
            }else{
                System.out.println("Te verei no próximo semestre");
            }
        }

        notas.close();
    }
}