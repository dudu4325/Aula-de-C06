public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.nome = "Jorge";
        z1.vida = 80;
        z2.nome = "Matheus";
        z2.vida = 100;

        System.out.println(z1.mostrarVida());

        z1.transfereVida(z1, 50);

        System.out.println(z1.mostrarVida());
    }
}