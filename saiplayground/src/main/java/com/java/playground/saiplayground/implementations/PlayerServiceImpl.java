package com.java.playground.saiplayground.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.playground.saiplayground.Repository.PlayerRepository;
import com.java.playground.saiplayground.models.Player;
import com.java.playground.saiplayground.services.PlayerService;

@Component
public class PlayerServiceImpl implements PlayerService{

    @Autowired
    private PlayerRepository playerRepository; 

    @Override
    public String bat() {
        
        return "batting";
    }

    @Override
    public String bowl() {
        
        return "bowling";
    }

    @Override
    public String field() {
        
        return "fielding";
    }

    @Override
    public String wicketKeep() {
        
        return "wicket-keeping";
    }

    @Override
    public String injured() {
        
        return "injured";
    }

    @Override
    public String substitute() {
        
        return "substituting";
    }

    @Override
    public Player getPlayerInfo(String playerName) {
        
        List<Player> players = playerRepository.findPlayersByFieldName(playerName);
        if(players != null) {
            return players.get(0);
        }
        return null;
    }

    @Override
    public Player createNewPlayer(Player player) {
        Player savedPlayer = playerRepository.save(player);
        return savedPlayer;
    }
    
}
