package com.java.playground.saiplayground.services;

import org.springframework.stereotype.Component;

import com.java.playground.saiplayground.models.Player;

@Component
public interface PlayerService {

    String bat();
    String bowl(); 
    String field();
    String wicketKeep(); 
    String injured(); 
    String substitute(); 
    Player getPlayerInfo(String playerName);
    Player createNewPlayer(Player player);
}
