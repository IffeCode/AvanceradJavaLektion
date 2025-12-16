package org.example.springdemo.controller;


import org.example.springdemo.database.Database;
import org.example.springdemo.model.Pokemon;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.List;

@RestController
@RequestMapping("/api/pokemon/")
public class PokemonController {

    @GetMapping
    public List<Pokemon> getPokemons(){

        return Database.getInstance().getPokemons();
    }

    @GetMapping("{name}")
    public Pokemon getPokemon(@PathVariable String name){
       //return Database.getInstance().getPokemons().stream()
         //       .filter(pokemon -> name.equals(pokemon.getName()))
           //     .findFirst().orElse(null);

        for (Pokemon pokemon : Database.getInstance().getPokemons()){
            if (name.equals(pokemon.getName())){
                return pokemon;
            }
        }
        return null;
    }

    @PostMapping
    public void addPokemon(@RequestBody Pokemon pokemon){

        Database db = Database.getInstance();
        db.addPokemon(pokemon);

    }

    @PutMapping("{name}")
    public void updatePokemon(@RequestBody Pokemon pokemon,@PathVariable String name){
        Database db = Database.getInstance();
        var pokemons = db.getPokemons();

        for (int i = 0; i < pokemons.size(); i++) {
            Pokemon p = pokemons.get(i);
            if(p.getName().equals(name)){
                pokemons.set(i, pokemon);
            }
        }
    }

    @DeleteMapping("{name}")
    public void deletePokemon(@PathVariable String name){

        List<Pokemon> pokemons = Database.getInstance().getPokemons();
        for(Pokemon p : pokemons){
            if(p.getName().equals(name)){
                pokemons.remove(p);
                return; //Tar bort den första matchningen
            }
        }

    }

}
