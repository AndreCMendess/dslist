package com.github.andrecmendes.dslist.dto;

import com.github.andrecmendes.dslist.entities.Game;

public class GameMinDTO {


    private long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game gameEntity) {
        id = gameEntity.getId();
        title = gameEntity.getTitle();
        imgUrl = gameEntity.getImgUrl();
        year = gameEntity.getYear();
        shortDescription = gameEntity.getShortDescription();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
