package com.github.andrecmendes.dslist.dto;

import com.github.andrecmendes.dslist.entities.GameList;

public class GameListDTO {
    private long id;
    private String name;

    public GameListDTO() {
    }

    public GameListDTO(GameList gameList) {
        id = gameList.getId();
        name = gameList.getName();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
