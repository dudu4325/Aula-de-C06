public class Main {
    public static void main(String[] args){
        Zumbi z1 = new Zumbi();

        z1.nome = "Beto";
        z1.vida = 90;

        z1.mostrarVida(z1.vida);
        z1.transfereVida(z1, 50);
    }
}
