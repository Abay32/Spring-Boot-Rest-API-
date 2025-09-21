package com.pokemon.api.service;

import com.pokemon.api.dto.PokemonDto;
import com.pokemon.api.dto.PokemonResponse;

import java.util.List;

public interface PokemonService {
    PokemonDto createPokemon(PokemonDto pokemonDto);
    PokemonResponse getAllPokemon(int pageNo, int pageSize );
    PokemonDto getPokemonById(int id);
    PokemonDto updatePokemon(int id, PokemonDto pokemonDto);
    void deletePokemon(int id);
}
