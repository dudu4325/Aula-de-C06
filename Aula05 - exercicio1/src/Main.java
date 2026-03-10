import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Cantina c1 = new Cantina();
        Scanner sc = new Scanner(System.in);
        Salgado s1 = new Salgado();
        Salgado s2 = new Salgado();
        Salgado s3 = new Salgado();

        c1.nome = "Cantina do Inatel";

        s1.nome = sc.nextLine();
        s2.nome = sc.nextLine();
        s3.nome = sc.nextLine();

        c1.mostrarInfo();

        c1.addSalgado(s1);
        c1.addSalgado(s2);
        c1.addSalgado(s3);

        c1.mostrarInfo();
    }
}