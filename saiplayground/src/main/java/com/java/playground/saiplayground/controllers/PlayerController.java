package com.java.playground.saiplayground.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.playground.saiplayground.models.Player;
import com.java.playground.saiplayground.services.PlayerService;


@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService; 

    @GetMapping("/player/activity/{name}")
    public String getPlayer(@PathVariable("name") String name) {
        return name + " is " + playerService.bat();
    }

    @GetMapping("/player/{name}")
    public Player getPlayerDetails(@PathVariable("name") String playerName) {
        return playerService.getPlayerInfo(playerName);
    }

    @PostMapping("player")
    public Player createPlayer(@RequestBody Player player) {

        return playerService.createNewPlayer(player);
    }
    
}
