public class Zumbi {
    String nome;
    double vida;

    public double mostrarVida() {
        return vida;
    }

    public void transfereVida(Zumbi alvo, double perca) {
        alvo.vida = alvo.vida - perca;
        System.out.println(alvo.nome + " perdeu " + perca +  " de vida e tem agora " + alvo.vida);
    }
}
