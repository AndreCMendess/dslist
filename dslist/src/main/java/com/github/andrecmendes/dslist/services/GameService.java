package com.github.andrecmendes.dslist.services;

import com.github.andrecmendes.dslist.dto.GameMinDTO;
import com.github.andrecmendes.dslist.entities.Game;
import com.github.andrecmendes.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    public List<GameMinDTO> findAll(){
        List<Game> games = gameRepository.findAll();
        List<GameMinDTO> gamesDTO = games.stream().map(x -> new GameMinDTO(x)).toList();
        return gamesDTO;
    }

}
