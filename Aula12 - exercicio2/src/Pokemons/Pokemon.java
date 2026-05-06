package Pokemons;

public abstract class Pokemon implements Comparable<Pokemon> {
    protected String nome;
    protected int id;

    public Pokemon(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    @Override
    public int compareTo(Pokemon o) {
        if (this.id < o.id) {
            return 1;
        }
        else if (this.id > o.id) {
            return -1;
        }
        return 0;
    }

    public String getNome() {
        return nome;
    }
}
