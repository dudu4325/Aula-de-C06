public class Main {
    public static void main(String[] args) {
        Personagem soldado = new Personagem();
        Arma requien = new Arma();

        soldado.nome = "Leon";
        soldado.pontos = 50;
        soldado.arma = requien;

        requien.poder = 30;
        requien.nome = "revolver de assalto";
        requien.descricao = "Extremamente poderoso, capaz de eliminar qualquer zumbi";
        requien.resistencia = 5;

        requien.mostrarInfoArma();

        soldado.usarArma();

        requien.mostrarInfoArma();

        soldado.tomarDano();

        System.out.println("Vida atual: " + soldado.pontos);
    }
}