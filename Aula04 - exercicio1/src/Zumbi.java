public class Zumbi {
    String nome;
    double vida;

    public void mostrarVida(double vi){
        System.out.println("Vida: " + vi);
    }

    public void transfereVida(Zumbi alvo, double perca){
        alvo.vida = alvo.vida - perca;
        System.out.println("Ele perdeu " + perca +  " de vida e tem agora " + alvo.vida);
    }

}