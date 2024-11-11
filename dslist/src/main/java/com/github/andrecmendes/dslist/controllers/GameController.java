package com.github.andrecmendes.dslist.controllers;

import com.github.andrecmendes.dslist.dto.GameMinDTO;
import com.github.andrecmendes.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/games")
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> games =  gameService.findAll();
        return games;
    }

}
