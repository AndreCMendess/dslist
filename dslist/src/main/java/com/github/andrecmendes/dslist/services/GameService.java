package com.github.andrecmendes.dslist.services;

import com.github.andrecmendes.dslist.dto.GameDTO;
import com.github.andrecmendes.dslist.dto.GameMinDTO;
import com.github.andrecmendes.dslist.entities.Game;
import com.github.andrecmendes.dslist.projections.GameMinProjection;
import com.github.andrecmendes.dslist.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly=true)
    public GameDTO findById(Long id){
        Game game = gameRepository.findById(id).get();
        GameDTO gameDTO =  new GameDTO(game);
        return gameDTO;
    }

    @Transactional(readOnly=true)
    public List<GameMinDTO> findAll(){
        List<Game> games = gameRepository.findAll();
        List<GameMinDTO> gamesDTO = games.stream().map(x -> new GameMinDTO(x)).toList();
        return gamesDTO;
    }

    @Transactional(readOnly=true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> games = gameRepository.searchByList(listId);
        List<GameMinDTO> gamesMinDTO = games.stream().map(GameMinDTO::new).toList();
        return gamesMinDTO;
    }



}
