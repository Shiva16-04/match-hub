package com.example.matchhub.servicelayer.impl;

import com.example.matchhub.dtos.requestdtos.PlayerRequest;
import com.example.matchhub.exceptions.PlayerAlreadyPresentException;
import com.example.matchhub.models.Player;
import com.example.matchhub.repositorylayer.PlayerRepository;
import com.example.matchhub.servicelayer.PlayerService;
import com.example.matchhub.transformers.PlayerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    PlayerRepository playerRepository;
    @Override
    public String addDetails(List<PlayerRequest> playerRequestList) throws Exception{
        List<String>playerNames=new ArrayList<>();
        for(PlayerRequest playerRequest: playerRequestList) {
            Player player = PlayerTransformer.playerRequestToPlayer(playerRequest);
            Optional<Player>optionalPlayer=playerRepository.findByEmail(player.getEmail());
            if(!optionalPlayer.isPresent()){
                Player savedPlayer = playerRepository.save(player);
            }else{
                playerNames.add(player.getName());
            }
        }

        if(playerRequestList.size()==1) {
            return "Player " + playerRequestList.get(0).getName() + " has been successfully added to the database";
        }else if(playerNames.size()==0){
            return "Players has been added successfully";
        }else{
            throw new PlayerAlreadyPresentException("Player "+playerNames+" is/are already present in the database");
        }
    }
}
