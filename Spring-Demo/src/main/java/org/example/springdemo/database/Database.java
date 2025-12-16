package org.example.springdemo.database;

import org.example.springdemo.model.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private static Database instance;
    private List<Pokemon> pokemons = new ArrayList<Pokemon>();

    private Database() {

    }

    public static Database getInstance(){
        if (instance == null){
            instance = new Database();
        }
        return instance;
    }

    //Skapa metod för lägga till pokemon
    public void addPokemon(Pokemon pokemon){
        pokemons.add(pokemon);
    }

    //
    public List<Pokemon> getPokemons(){
        return pokemons;
    }

}
