public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.nome = "Jorge";
        z1.vida = 80;
        z2.nome = "Matheus";
        z2.vida = 100;

        System.out.println("Vida de "+ z1.nome + ": " + z1.mostrarVida());
        System.out.println("Vida de "+ z2.nome + ": " + z2.mostrarVida());

        z1.transfereVida(z1, 50);

        System.out.println("Vida de "+ z1.nome + ": " + z1.mostrarVida());
        System.out.println("Vida de "+ z2.nome + ": " + z2.mostrarVida());

        z1 = z2;

        z2.transfereVida(z2, 50);

        System.out.println("Vida de "+ z1.nome + ": " + z1.mostrarVida());
        System.out.println("Vida de "+ z2.nome + ": " + z2.mostrarVida());
    }
}