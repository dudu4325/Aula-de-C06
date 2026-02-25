import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner alunos = new Scanner(System.in);

        int Alunos = alunos.nextInt();

        switch (Alunos){
            case 10:
                System.out.println("A sala será a I-16");
                break;
            case 20:
                System.out.println("A sala será a I-16");
                break;
            case 30:
                System.out.println("A sala será a I-22");
                break;
            default:
                System.out.println("Esse número de alunos não pode");
        }
    }
}