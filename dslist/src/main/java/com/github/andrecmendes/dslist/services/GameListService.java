package com.github.andrecmendes.dslist.services;

import com.github.andrecmendes.dslist.dto.GameListDTO;
import com.github.andrecmendes.dslist.entities.GameList;
import com.github.andrecmendes.dslist.projections.GameMinProjection;
import com.github.andrecmendes.dslist.repositories.GameListRepository;
import com.github.andrecmendes.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    GameListRepository gameListRepository;

    @Autowired
    GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> gameList = gameListRepository.findAll();
        List<GameListDTO> gameListDTO = gameList.stream().map(GameListDTO::new).toList();
        return gameListDTO;
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {
        List<GameMinProjection> list = gameRepository.searchByList(listId);
        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex,obj);


        int min = sourceIndex <  destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex <  destinationIndex ? destinationIndex : sourceIndex;

        for(int i=min; i<=max; i++){
            gameListRepository.updateBelongingPosition(listId,list.get(i).getId(),i);
        }
    }
}
