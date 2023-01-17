package com.java.playground.saiplayground.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.java.playground.saiplayground.models.Player;

@Repository
@Component
public interface PlayerRepository extends JpaRepository<Player,Integer>{

    List<Player> findPlayersByFieldName(String playerName);
    
}
