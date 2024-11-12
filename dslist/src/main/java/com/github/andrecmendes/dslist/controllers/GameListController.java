package com.github.andrecmendes.dslist.controllers;

import com.github.andrecmendes.dslist.dto.GameListDTO;
import com.github.andrecmendes.dslist.dto.GameMinDTO;
import com.github.andrecmendes.dslist.services.GameListService;
import com.github.andrecmendes.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    GameListService gameListService;
    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){

        List<GameListDTO> gameListDTO = gameListService.findAll();
        return gameListDTO;

    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){

        List<GameMinDTO> gameMinDTO = gameService.findByList(listId);
        return gameMinDTO;

    }
}
