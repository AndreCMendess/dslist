package com.github.andrecmendes.dslist.dto;

import com.github.andrecmendes.dslist.entities.Game;
import com.github.andrecmendes.dslist.projections.GameMinProjection;

public class GameMinDTO {


    private long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;
    private Integer position;

    public GameMinDTO() {
    }

    public GameMinDTO(Game gameEntity) {
        id = gameEntity.getId();
        title = gameEntity.getTitle();
        imgUrl = gameEntity.getImgUrl();
        year = gameEntity.getYear();
        shortDescription = gameEntity.getShortDescription();
    }

    public GameMinDTO(GameMinProjection projection)
    {
        id = projection.getId();
        title = projection.getTitle();
        imgUrl = projection.getImgUrl();
        year = projection.getYear();
        shortDescription = projection.getShortDescription();
        position = projection.getPosition();

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
