package compra.dispositivo.partes;

public class HardWareBasico {
    private String nome;
    private float capacidade;

    public HardWareBasico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public float getCapacidade() {
        return capacidade;
    }
}
