import Pokemons.Especies.Charizard;
import Pokemons.Especies.Dito;
import Pokemons.Especies.Pikachu;
import Pokemons.Pokemon;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List <Pokemon> pokemons = new ArrayList <Pokemon>();

        pokemons.add(new Pikachu("Chu",1));
        pokemons.add(new Pikachu("Pika",2));

        pokemons.add(new Charizard("Rizard",3));
        pokemons.add(new Charizard("Cha",4));

        pokemons.add(new Dito("To",5));
        pokemons.add(new Dito("Di",6));

        Collections.sort(pokemons);

        for(Pokemon pokemon : pokemons){
            System.out.println(pokemon.getNome());
        }
    }
}