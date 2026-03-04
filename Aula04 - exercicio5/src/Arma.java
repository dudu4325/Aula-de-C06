public class Arma {
    String nome;
    int poder;
    int resistencia;
    String descricao;

    public void mostrarInfoArma(){
        System.out.println("Nome da arma: " + nome);
        System.out.println("Poder da arma: " + poder);
        System.out.println("Resistencia da arma: " + resistencia);
        System.out.println("Descricao da arma: " + descricao);
    }
}
