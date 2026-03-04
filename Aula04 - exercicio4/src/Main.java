public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.nome = "Jorge";
        z1.vida = 80;
        z2.nome = "Matheus";
        z2.vida = 100;

        System.out.println(z1.mostrarVida());
        System.out.println(z1.transfereVida(z1, 90));
        System.out.println(z1.mostrarVida());

        System.out.println(z2.mostrarVida());
        System.out.println(z2.transfereVida(z2, 90));
        System.out.println(z2.mostrarVida());
    }
}