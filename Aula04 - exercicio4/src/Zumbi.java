public class Zumbi {
    String nome;
    double vida;

    public double mostrarVida() {
        return vida;
    }

    public boolean transfereVida(Zumbi alvo, double perca) {
        if (alvo.vida >= perca && perca > 0) {
            alvo.vida = alvo.vida - perca;
            return true;
        }
        else
            return false;
    }
}
