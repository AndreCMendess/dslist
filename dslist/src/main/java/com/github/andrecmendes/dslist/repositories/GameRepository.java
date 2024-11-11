package com.github.andrecmendes.dslist.repositories;

import com.github.andrecmendes.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {

}
