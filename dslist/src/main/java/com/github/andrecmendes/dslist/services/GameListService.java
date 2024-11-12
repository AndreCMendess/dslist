package com.github.andrecmendes.dslist.services;

import com.github.andrecmendes.dslist.dto.GameListDTO;
import com.github.andrecmendes.dslist.entities.GameList;
import com.github.andrecmendes.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> gameList = gameListRepository.findAll();
        List<GameListDTO> gameListDTO = gameList.stream().map(GameListDTO::new).toList();
        return gameListDTO;
    }

}
