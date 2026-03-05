import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Kart k1;
        Kart k2;
        Piloto p1;
        Piloto p2;
        Scanner sc = new Scanner(System.in);

        k1 = new Kart();
        k2 = new Kart();
        p1 = new Piloto();
        p2 = new Piloto();

        k1.piloto = p1;
        k2.piloto = p2;

        System.out.println("Digite o nome do kart1: ");
        k1.nome = sc.nextLine();
        System.out.println("Digite o nome do piloto do kart1: ");
        k1.piloto.nome = sc.nextLine();
        System.out.println("Ele é um vilão? ");
        k1.piloto.vilao = sc.nextBoolean();
        sc.nextLine();
        System.out.println("Digite as cilindradas do kart1: ");
        k1.m.cilindradas = sc.nextLine();
        System.out.println("Digite a velocidade máxima do kart1: ");
        k1.m.velocidadeMaxima = sc.nextFloat();
        sc.nextLine();

        System.out.println("Digite o nome do kart2: ");
        k2.nome = sc.nextLine();
        System.out.println("Digite o nome do piloto do kart2: ");
        k2.piloto.nome = sc.nextLine();
        System.out.println("Ele é um vilão? ");
        k2.piloto.vilao = sc.nextBoolean();
        sc.nextLine();
        System.out.println("Digite as cilindradas do kart2: ");
        k2.m.cilindradas = sc.nextLine();
        System.out.println("Digite a velocidade máxima do kart2: ");
        k2.m.velocidadeMaxima = sc.nextFloat();


        k1.m.mostarInfo();
        k2.m.mostarInfo();

        k1.fazerDrift();
        k2.pular();
        k1.soltarTurbo();
    }
}