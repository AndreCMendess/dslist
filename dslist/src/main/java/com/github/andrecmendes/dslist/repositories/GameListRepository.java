package com.github.andrecmendes.dslist.repositories;

import com.github.andrecmendes.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long> {

}
